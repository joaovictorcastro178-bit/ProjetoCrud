package controller;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TesteConexao {
    public static void main(String[] args)throws SQLException{
        
        Connection connection = new ConnectionMySql().getConnection();
        
        JOptionPane.showMessageDialog(null, "Conexão Estabelecida!");
        
        connection.close();
            
    }
}
