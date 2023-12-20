/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer005;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //Archivos de configuracion
        //crear archivos de configuracion a partir de
        //datos que introduzca el usuario
        Scanner teclado = new Scanner(System.in);
        Properties archivoConfiguracion = new Properties();

        System.out.println("Introduce la web: ");
        String web = teclado.nextLine();
        archivoConfiguracion.setProperty("url", web);

        System.out.println("Introduce prefijo tabla: ");
        String prefijo = teclado.nextLine();
        archivoConfiguracion.setProperty("prefix", prefijo);

        System.out.println("Servidoder de la BBDD: ");
        String server = teclado.nextLine();
        archivoConfiguracion.setProperty("server", server);

        archivoConfiguracion.store(new FileOutputStream("wp.configg.php"), "Mi archivo de configuracion");
        
        
        //para leerlo-achivo de configuracion
        
        archivoConfiguracion.load(new FileInputStream("wp-config.php"));
        //mostramos en orden inveros al fichero por que nos da la gana
        String servidor = archivoConfiguracion.getProperty("server");
        System.out.println("Servidor de la bbdd: " + servidor);
        
        String dominio = archivoConfiguracion.getProperty("url");
        System.out.println("El dominio es: " + dominio);

    }

}
