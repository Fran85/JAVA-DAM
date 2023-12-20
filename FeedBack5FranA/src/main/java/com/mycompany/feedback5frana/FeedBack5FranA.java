/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.feedback5frana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class FeedBack5FranA {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/vehiculo";
        String user = "root";
        String pass = "alumnodam2023@";
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un tipo de motor , G - H - D - E: ");
        String tipoMotor = teclado.next();

        System.out.println("Introduce un año a partir del 2000: ");
        String anio = teclado.next();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("**Conectado**");
            //Statement sql = con.createStatement();

            PreparedStatement sq = con.prepareStatement("SELECT * FROM coche WHERE tipo_motor=? AND anio_lanzamiento >= ?");

            sq.setString(1, tipoMotor);
            sq.setString(2, anio);

            ResultSet resultado = sq.executeQuery();

            while (resultado.next()) {
                System.out.print(resultado.getString(3) + " " + resultado.getString(4) + " " + resultado.getString(5) + " ");
                System.out.print(" - ");

            }
            System.out.println("Realizado correctamente");
            sq.close();
            resultado.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.toString());
        }
    }
}

















//String consulta = "select * from coche where tipo_motor='" + tipoMotor + "';";
//  String consulta = "SELECT * FROM coche WHERE tipo_motor='" + tipoMotor + "' AND anio_lanzamiento >= '" + anio + "';";
            //  ResultSet resultado = sql.executeQuery(consulta);
