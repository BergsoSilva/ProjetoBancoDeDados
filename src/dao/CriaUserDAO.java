package dao;

import java.nio.file.attribute.UserPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.User;
import util.ControlaConexao;

/**
 *
 * @author erick
 */
public class CriaUserDAO {
    
    public void criaConexao(User user)throws SQLException{
        Connection conexao = null;
        PreparedStatement instrucao = null;
        
        try {
            
            String sql = "create user ?";
                        
            conexao = ControlaConexao.getConexao2(user.getHost(), user.getPorta(), "root","root");
            
            instrucao = conexao.prepareStatement(sql);
            
            preencherParametros(instrucao, user);
            
            instrucao.execute();
            colandoSenha(user);
            System.out.println("Conexao criada com sucesso ...");
        } catch (SQLException e) {
            e.getLocalizedMessage();
        }catch(NullPointerException n){
             JOptionPane.showMessageDialog(null, "Erro"+n.getLocalizedMessage());
        }
    }
    
    public void privilegioAdministrador(User user)throws  SQLException{
        Connection conexao = null;
        Statement instrucao=null;
        
        Object usuario = user.getUsuario();
        
        try {
             conexao = ControlaConexao.getConexao2(user.getHost(), user.getPorta(),"root", "root");
            
             String sql = "grant all on *.* to "+usuario;   
            
             instrucao = conexao.createStatement();
                        
             instrucao.executeQuery(sql);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }catch (NullPointerException n){
            JOptionPane.showMessageDialog(null, "eroo"+n.getLocalizedMessage());
        }
    }
    
    public void privelegioGerente(User user)throws  SQLException{
        Connection conexao = null;
        String usuario = user.getUsuario();
        String banco = user.getPrivilegio();
        
        try {
            conexao = ControlaConexao.getConexao2(user.getHost(), user.getPorta(), "root", "root");
            
            String sql = "grant select on " + banco + ".* to " + usuario;   
            
            Statement instrucao = conexao.createStatement();
                        
            instrucao.executeQuery(sql);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void privilegioUsuario(User user)throws SQLException{
        Connection conexao = null;
        Object banco = user.getPrivilegio();
        Object usuario = user.getUsuario();
        
        try {
            conexao = ControlaConexao.getConexao2(user.getHost(), user.getPorta(), "root", "root");
            
            String sql = "grant select on " + banco + ".* to " + usuario;
            
            Statement instrucao = conexao.createStatement();
            
            instrucao.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void colandoSenha(User user){
        Connection conexao = null;
            
        try {
            conexao = ControlaConexao.getConexao2(user.getHost(), user.getPorta(), "root", "root");
            
            String sql = "set password for '" + user.getUsuario() +"' = "
                    + "password('" + user.getPassword() +"')";
            
            Statement instrucao = conexao.createStatement();
            
            instrucao.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<User> pegarUsuarios () {
        
        Connection conexao=null;
        PreparedStatement instrucao=null;
        ResultSet resultados=null;
        
        //Este comando mostra os resultados por nome parcial, mas também um 
        //registro apenas com um ID específico.
        
        String sql = "select user from mysql.user";
        
         try {
            
            conexao = ControlaConexao.getConexao3();

            instrucao = conexao.prepareStatement(sql);

           // instrucao.setString(1,"%"+cidade.getNome()+"%");
            
            resultados = instrucao.executeQuery(); // executa e gera e traz o traz o resutado
            
            
            List<User> users=new ArrayList<>();
            User usuarios;
            
            while(resultados.next()){
               usuarios=new User();
               usuarios.setUsuario(resultados.getString("user"));
                       
                users.add(usuarios);
            }
            
            return users;

        } catch (SQLException ex) {

            ex.printStackTrace();
        }
      return null;
    }
    
            
    private void preencherParametros(PreparedStatement instrucao, User user) throws SQLException {
        
        //Esse método trata as informações podem estar nulas.

       
        if (user.getUsuario() != null) {
            instrucao.setString(1, user.getUsuario());
        } else {
            instrucao.setNull(1, java.sql.Types.VARCHAR);
        }
    }
    
    
}
