
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Desc;
import modelo.User;
import util.ControlaConexao;

/**
 *
 * @author erick
 */
public class TablesDAO {
    
    private User user;
        
    public TablesDAO(User user) {
        this.user = user;
    }
    
    public List<String> selecionar()throws SQLException{
        List<String> tables = new ArrayList<String>();
        Connection conexao = null;
        Statement instrucao = null;
        
        try {
            conexao = ControlaConexao.getConexao3();
            
            String sql = "select distinct table_schema from information_schema.tables;";
            
            instrucao = conexao.createStatement();
            
            instrucao.execute(sql);
            
            ResultSet resultado = instrucao.getResultSet();
            
            while (resultado.next()) {                
                
                tables.add(resultado.getString("table_schema"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return tables;
    }   
    
    public List<String> selecionarBancoETabelas()throws SQLException{
        List<String> tables = new ArrayList<String>();
        Connection conexao = null;
        
        try {
            conexao = ControlaConexao.getConexao3();
            String sql = "select table_name from information_schema.tables " +
                            "where table_schema = '" + user.getPrivilegio() + "'";
            
            Statement instrucao = conexao.createStatement();
            
            instrucao.execute(sql);
            
            ResultSet resultado = instrucao.getResultSet();
            
            while (resultado.next()) {                
                
                tables.add(resultado.getString("table_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return tables;
    }
    
    public List<String> selecionarDataBase()throws SQLException{
        List<String> dataBabes = new ArrayList<String>();
        Connection conexao = null;
        
        try {
            conexao = ControlaConexao.getConexao3();
            String sql = "show databases";
            
            Statement instrucao = conexao.createStatement();
            instrucao.execute(sql);
            
            ResultSet resultado = instrucao.getResultSet();
            
            while(resultado.next()){
                dataBabes.add(resultado.getString("Database"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return dataBabes;
    }
    
    public List<Desc> selecionarDesc(String nomeCidade)throws SQLException{
        List<Desc> descs = new ArrayList<Desc>();
        Connection conexao = null;
        
        try {
            conexao = ControlaConexao.getConexao3( );
            String sql = "desc " + user.getPrivilegio() + "." + nomeCidade;
                        
            Statement instrucao = conexao.createStatement();
            instrucao.execute(sql);
            ResultSet resultado = instrucao.getResultSet();
            Desc desc;
            while(resultado.next()){
                desc = new Desc();
                desc.setNomeCampo(resultado.getString("Field"));
                desc.setTipo(resultado.getString("Type"));
                                
                descs.add(desc);
            }
        } catch (SQLException ex) {
        }
        
        return descs;
    }
    
    
    public List<String> recuperaUsuario()throws SQLException{
        Connection conexao = null;
        Statement instrucao = null;
        ResultSet resultados=null;
        
        List<String> bancosPrivilegios = new ArrayList<String>();
        
        String sql = "call teste";
        
        try {
            conexao = ControlaConexao.getConexaoTeste(user.getDriver(), user.getHost()
                    , user.getPorta(), user.getUsuario(), user.getPassword());
            
            instrucao = conexao.createStatement();
            
            instrucao.execute(sql);
            
            resultados = instrucao.getResultSet();
                      
            while(resultados.next()){
                bancosPrivilegios.add(resultados.getString("table_schema"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return bancosPrivilegios;
    }
    
    
}
