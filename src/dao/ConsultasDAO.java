/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.D;
import util.ControlaConexao;

/**
 *
 * @author GRS
 */
public class ConsultasDAO{
    
    public List<D> consultaD ( D d) throws ClassNotFoundException, SQLException{
     Connection conexao=null;
     CallableStatement instrucao=null;
     
     String parametro = d.getPar();
    Class.forName("com.mysql.jdbc.Driver");

    conexao = ControlaConexao.getConexao3();

    instrucao = conexao.prepareCall("{ call sp_questaoD(?) }");
    instrucao.setString(1,parametro);
    instrucao.execute();
   
    ResultSet rs =instrucao.executeQuery();
    List<D> ds = new ArrayList<> ();
     D res;   
    while (rs.next()) {
           
      res = new D();
      res.setLadon(rs.getString("LADO_N"));
      res.setLado1(rs.getString("LADO_1"));
            
       ds.add(res);
             
    }

    return ds;    
    }
}
    
        
    
    

