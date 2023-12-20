/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claselaboratorio17sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) throws SQLException {
        
        String usuario = "root";
        String pass="YES";
        String url ="jdbc:mysql://localhost:3306/AlumnosDAM";
        Connection con = DriverManager.getConnection(url, usuario, pass);
        System.out.println("Me he conectado");
    }
    
}
