
package Conf;

import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.SQLException;

public class Conexao {
    
    public static String estado = "Não conectado";
    
    
    public Conexao(){
    
     
    
    
    
    }
    
    
    public static java.sql.Connection conectar(){
      
          Connection conexao = null;         
 
  
 
try {
 
 
String driverName = "com.mysql.jdbc.Driver";                        
 
Class.forName(driverName);
 
  
 
// Configurando a nossa conexão com um banco de dados//
 
            String host = "localhost";    //caminho do servidor do BD
 
            String banco  = "varpla";
 
            String endereco = "jdbc:mysql://" + host + "/" + banco;
 
            String user = "root";           
 
            String senha = "";     
 
            conexao = DriverManager.getConnection(endereco, user, senha);
 
  
 
      
            if (conexao != null) {
 
                estado = ("ESTADO: Conectado.");
 
            } else {
 
                estado = ("ESTADO: Não foi possível conectar.");
 
            }
 
  
 
            return conexao;
 
  
 
        } catch (ClassNotFoundException e) {  
 
  
 
            System.out.println("O driver expecificado nao foi encontrado.");
 
            return null;
 
        } catch (SQLException e) {
 

 
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
 
            return null;
 
        }
 
  
 
    }
 
  
 
    //Método que retorna o status da sua conexão//
 
    public static String statusConection() {
 
        return estado;
 
    }
 
   
 
   //Método que fecha sua conexão//
 
    public static boolean FecharConexao() {
 
        try {
 
            Conexao.conectar().close();
 
            return true;
 
        } catch (SQLException e) {
 
            return false;
 
        }
 
  
 
    }
 
   
 
    public static java.sql.Connection ReiniciarConexao() {
 
        FecharConexao();
 
  
 
        return Conexao.conectar();
 
    }
 
}