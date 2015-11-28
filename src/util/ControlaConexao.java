
package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erick
 */
public class ControlaConexao {
    
    // concexao de ussuarios TelaConexao
    public static Connection getConexao1(String driveConexao,String localHost, String porta,
            String user, String senha) throws SQLException{
                return DriverManager.getConnection(driveConexao+localHost+":"+porta+"/mysql",user,senha);

    }
    
    public static Connection getConexaoTeste(String driveConexao,String localHost, String porta,
            String user, String senha) throws SQLException{
                return DriverManager.getConnection(driveConexao+localHost+":"+porta,user,senha);

    }
    
    // criar usuario e dar permições Tela Criar Conexao
    public static Connection getConexao2(String localHost, String porta,String user, String senha) throws SQLException{
            try{
              Class.forName("com.mysql.jdbc.Driver");
            } catch(ClassNotFoundException ex){
                Logger.getLogger(ControlaConexao.class.getName()).log(Level.SEVERE, null, ex);
                   
            }
            return DriverManager.getConnection("jdbc:mysql://"+localHost+":"+porta,user,senha);
    }
    
    
     // usado para consultas 
    public static Connection getConexao3() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControlaConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_apbd","root","root");
    }
}
