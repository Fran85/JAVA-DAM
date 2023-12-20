/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.teorialaboratorio18dam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Fran
 */
public class TeoriaLaboratorio18DAM {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/instituto";
        String user = "root";
        String pass = "alumnodam2023@";

        Connection con = DriverManager.getConnection(url, user, pass);
        System.out.println("**Conectado**");

        System.out.println("Error dse SQL");

        Statement sql = con.createStatement();
        System.out.println(sql.execute("select apellido1, apellido2, nombre from alumno;"));
        System.out.println("Consulta realizada");

        //insercion de un alumno a la tabla instituto
        // int n = sql.executeUpdate("INSERT INTO alumno VALUES(NULL, 'Pepe', 'Flores', 'fuertes', '1985-01-31', 'no', 698765432);");
        System.out.println("Insertado correctamente");

        //borrado de datos de la tabla instituto
        // n = sql.executeUpdate("DELETE FROM alumno WHERE nombre = 'Pepe' ");
        System.out.println("Borrado correctamente");

        //  n = sql.executeUpdate("UPDATE alumno SET telefono = '999999999' WHERE id = 11;");
        System.out.println("Actualizado correctamente");

        //Select updateQuery
        ResultSet salida;
        salida = sql.executeQuery("SELECT * FROM alumno;");
        System.out.println(salida);

        //salida.absolute(3);
        while (salida.next()) {
            System.out.print(salida.getInt("id"));
            //System.out.println(salida.getString("nombre"));
        }
    }
}
