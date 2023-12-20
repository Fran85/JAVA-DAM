 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer003;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Fran
 */
public class Principal {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
       FileInputStream fe = null;
       byte[] buffer = new byte[100];
       int nbytes;
       
       fe = new FileInputStream("milagroDePetinto");
       
       nbytes = fe.read(buffer, 0, 100);
       
       String cadena = new String(buffer,0,nbytes);
       
        System.out.println(cadena);
       
       
    }
    
}
