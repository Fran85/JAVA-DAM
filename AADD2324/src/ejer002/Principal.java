/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer002;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) throws IOException {
        
        /*primero para ver, como en los apuntes, como bytes, sirve para datos no texto, imagenes, musica,etc*/
        //se trata siempre como bytes
        //siempre se inicializa a null
        FileOutputStream  fs =null;
        //lo ideal es para no perder datos, antes se lee el fichero, se calcula el tamaño y poner el tamaño en la variable
        byte[] buffer = new byte[81];
        int nbytes;//para saber el tamaño
        
        //Entrada de datos
        System.out.println("Introduce el texto... se gestiona como binario");
        nbytes = System.in.read(buffer);
        
        System.out.println("El tamaño escrito es: "+nbytes );
        
        
        //Creamos el flujo
        fs = new FileOutputStream("milagroDePetinto");
        
        
        //Salida al fichero binario
        fs.write(buffer, 0, nbytes);
        
        
    }
}
