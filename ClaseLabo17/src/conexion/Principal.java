/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) throws SQLException {
        String usuario = "root";
        String pass = "alumnodam2023@";
        String url ="jdbc:mysql://localhost:3306/instituto";
        
        Connection con = DriverManager.getConnection(url, usuario, pass);
        System.out.println("Me he conectado");
        
        Statement sql = con.createStatement();
        System.out.println(sql.execute("select apellido1, apellido2, nombre from alumno;"));
        System.out.println("Consulta realizada");
        
        
        //insercion de un alumno a la tabla instituto
       int n = sql.executeUpdate("INSERT INTO alumno VALUES(NULL, 'Pepe', 'Flores', 'fuertes', '1985-01-31', 'no', 698765432);");
        System.out.println("Insertado correctamente");

        //borrado de datos de la tabla instituto
       n = sql.executeUpdate("DELETE FROM alumno WHERE nombre = 'Pepe' ");
        System.out.println("Borrado correctamente");
    }
    
}
