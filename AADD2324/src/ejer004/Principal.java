/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer004;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.in;
import static java.lang.System.out;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //programa que copie un fichero en otro
        
        File forigen = new File("Anomariano.txt");
        File fdestino = new File("milagroDePetinto");
        byte[] buffer = new byte[1024];
        int leng;
        
        FileInputStream fe = new FileInputStream(forigen);
        FileOutputStream fs = new FileOutputStream(fdestino);
        
        
        while((leng = fe.read(buffer))>0){
            fs.write(buffer,0,leng);
        }
        System.out.println("PROGRAMA FINALIZADO");
    }
}
