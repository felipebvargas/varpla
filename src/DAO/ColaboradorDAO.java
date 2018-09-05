package DAO;

import Modelo.Colaborador;
import Conf.Conexao;
import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.sql.*;

public class ColaboradorDAO {
    private Connection conexao;
    Long id_colab;
    String nome,
           placa,
           modelo,
           cor;
    
    
    public ColaboradorDAO (){
    
     this.conexao = new Conexao().conectar();
       
   }
    
    public void adicionar(Colaborador colaborador){
       String sql = "INSERT INTO colaboradores (nome, placa, modelo, cor) VALUES (?,?,?,?)";
        try {
           PreparedStatement pstm = conexao.prepareStatement(sql);
           pstm.setString(1, colaborador.getNome());
           pstm.setString(2, colaborador.getPlaca());
           pstm.setString(3, colaborador.getModelo());
           pstm.setString(4, colaborador.getCor());
           pstm.execute();
           pstm.close();
           System.out.println("Cadastrado com sucesso!");
           
        } catch(SQLException e) {
            
            throw new RuntimeException(e);
              }
    }  
    
    
    }
    
    
    

