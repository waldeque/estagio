/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufpi.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author waldeque
 */
public class JDBD {
    public JDBD() throws SQLException{
//        Connection conexao = DriverManager.getConnection("jdbc:derby://localhost:1527/SistemaCondominios");
        Connection connection = null;  
        try {  
            connection = DriverManager.getConnection("jdbc:derby:/localhost:1527/SISTEMA_CONDOMINIOS");  
         
        } catch (SQLException e) {  
            System.err.println("Falha na conexão:  " + e);
        }

        }
    
}
