/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer3Ficheros;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) {
        
        try{
            FileWriter fw = new FileWriter("fichero.txt",true);
            
            fw.write("Hola mundo");
            fw.write(97);

            fw.close();
            
            
            FileReader fr = new FileReader("fichero.txt");
            
            int valor = fr.read();
            while(valor!=-1){
                System.out.println((char)valor);
                valor =fr.read();
            }
            fr.close();
            
        }catch(IOException e){
            System.out.println("Error E/S "+e); 
        }
    }
    
}
