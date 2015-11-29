/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import dao.ConsultasDAO;
import java.awt.RenderingHints.Key;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import modelo.D;
import util.ControlaConexao;

/**
 *
 * @author LAB-07
 */
public class TesteProcedure {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
     /*Class.forName("com.mysql.jdbc.Driver");

    Connection conexao = ControlaConexao.getConexao3();

    CallableStatement proc_stmt = conexao.prepareCall("{ call sp_questaoD(?) }");
    proc_stmt.setString(1,"bairro");
    proc_stmt.execute();
   
    ResultSet rs = proc_stmt.executeQuery();
    
        
  
    while (rs.next()) {
          
      System.out.println("Generated employeeId: " +rs.getString("LADO_1") +" <> "+rs.getString("LADO_N"));
      
     
      
      */
        
        ConsultasDAO dao = new ConsultasDAO ();
        D d = new D();
            d.setLadon("bd_apbd");
            
             System.out.println(dao.questaoI(d));
        
              
              
             
        }
   
  }
 
    

