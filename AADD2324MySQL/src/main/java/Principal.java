/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

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
public class Principal {

    public static void main(String[] args) throws SQLException {

        //Connection conexion = null;
        String cadenaConexion = "jdbc:mysql://localhost:3307/alumnos_guays";
        //Sentencias preparadas
        Connection conexion = DriverManager.getConnection(cadenaConexion, "root", "");

        //Hacer la sentencia en SQL preparada y luego lanzarla
        String sqlP = "INSERT INTO `uax` (`id`, `nombre`, `apellido`) VALUES ('?', '?', '?')";
        String sqlP2 = "DELETE FROM uax WHERE `uax`.`id` = ?";
        String sqlP3 = "SELECT * FROM uax WHERE uax.nombre=?";
        
        //lo voy cambiando por INSERT, UPDATE o DELETE o SELET, pasaremos un sqlP u otro segun que queramos ejecutar
        PreparedStatement sentenciaP = conexion.prepareStatement(sqlP3);

        Scanner teclado = new Scanner(System.in);
        String nombre = teclado.next();
        
        sentenciaP.setString(1, nombre);
        
        ResultSet salidaSelect = sentenciaP.executeQuery();
        
        while(salidaSelect.next()){
            int idTabla = salidaSelect.getInt(1);
            String nombreTabla = salidaSelect.getString(2);
            String apellidoTabla = salidaSelect.getString(3);
            System.out.println("id: " +idTabla+" Nombre: " +nombreTabla+"Apellido: "+apellidoTabla);
        }
        System.out.println("Fin");
        
        //Recogida de datos del select para buscar por nombre
                //System.out.println("Dame el nombre: ");
        //String nombre = teclado.next(
        
        //RECOGIDA DE DATOS DEL INSERT
        //System.out.println("Dame el id: ");
        //int id = teclado.nextInt();
        //System.out.println("Dame el nombre: ");
        //String nombre = teclado.next();
        //System.out.println("Dame el apellido: ");
        //String apellido = teclado.next();
        //System.out.println(id + " " + nombre + " " + apellido);
        
        //recogemos los datos del delete
        System.out.println("Dame el id a borrar: ");
        teclado.nextInt();

        //Asociar a posiciones los valores recogidos
        //sentenciaP.setString(1, id);
        //sentenciaP.setString(2, nombre);
        //sentenciaP.setString(3, apellido);
        //sentenciaP.setInt(1, id);
        
        sentenciaP.executeUpdate();
        System.out.println("Datos borrados correctamente");

    }
}

//Sentencias statement
//try ( Connection conexion =DriverManager.getConnection(cadenaConexion, "root", "");
//      Statement sql = conexion.createStatement();
//        ){
//try {
//  conexion = DriverManager.getConnection(cadenaConexion, "root", "");
//  System.out.println("Conexion establecida");
//  Statement sql = conexion.createStatement();
//sql.execute("create database alumnos1");
//System.out.println("BBDD de alumnos1 creada");
//sql.execute("CREATE TABLE `alumnos_guays`.`uax` (`id` INT NOT NULL , `nombre` VARCHAR(255) NOT NULL , `apellido` VARCHAR(255) NOT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;");
//System.out.println("Tabla UAX creada correctamente");
//sql.executeUpdate("INSERT INTO `uax` (`id`, `nombre`, `apellido`) VALUES ('3', 'Carlos', 'Sainz')");//insert
//sql.executeUpdate("INSERT INTO `uax` (`id`, `nombre`, `apellido`) VALUES ('4', 'Fernando', 'Alonso')");//insert
// sql.executeUpdate("DELETE FROM uax WHERE `uax`.`id` = 1");//delete
//System.out.println("Alumno borrado");
//sql.executeUpdate("UPDATE `uax` SET `apellido` = 'Chicote33' WHERE `uax`.`id` = 2");//update
//System.out.println("Alumno actualizado");
/* ResultSet rs = sql.executeQuery("select * from uax");
            System.out.println("Lo tengo recogido en un Resulset");
            
            while(rs.next()){
              int id = rs.getInt("id");
              String nombre = rs.getString("nombre");
              String apellido = rs.getString("apellido");
                System.out.println(id);
                System.out.println(nombre);
                System.out.println(apellido);
                System.out.println(id+ " " + nombre + " " + apellido);
            }
            
            
            //Sencencia select,el resultado se mete en un objeto resulset
            
                    //una vez conectados con la bbdd haremos sentencias con Statement
        } catch (SQLException ex) {
            System.out.println("Conexion fallida");
            ex.printStackTrace();

        } 

        //try with resources, gestiona el cierre de recursos
        //try ( Connection conexion =DriverManager.getConnection(cadenaConexion, "root", "");
        //acabe donde acabe el programa cierra la conexion, hace close automaticamente y siempre entre parentesis en try
        //una vez conectados con la bbdd haremos sentencias con Statement
//Connection conexion;
        //conexion = new DriverManager.getConnection(cadenaConexion, "root", "");
        //System.out.println("Conexion correcta");
        //Statement sql = conexion.createStatement();
        //-sql.execute("create database alumnos1");
        //System.out.println("base de datos Alumnos1 creada");
        //para coger la sentencia iremos a xamp al navegador, crearemos la tabla con su columnas y demas 
        //y nos copiaremos la sentencia que nos de y la metemos en la sentencia .exceute
        //-sql.execute("create table XXXXXXX")
        //el crud se hara con .executeUpdate
        //las selects se recorren con un while
        //ResultSet rs = sql.executeQuery("select * from uax");
    }
}*/
