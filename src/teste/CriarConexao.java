/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author GRS
 */
import dao.CriaUserDAO;
import java.sql.*;
import java.sql.Connection;  
import java.sql.SQLException; 
import modelo.User;
import util.ControlaConexao;
public class CriarConexao {
    
    public static void main(String[] args) throws SQLException {
        
         User user = new User ();
         
          user.setHost("localhost");
          user.setPorta("3306");
          user.setPassword("123");
          user.setUsuario("fera");
       
          
        
       CriaUserDAO dao = new CriaUserDAO();
       dao.criaConexao(user);
       dao.privilegioAdministrador(user);
         
    }
        
    
}
