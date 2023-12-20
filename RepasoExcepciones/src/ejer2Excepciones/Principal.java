/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer2Excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) throws FileNotFoundException {
     
        try{
            FileReader fr= new FileReader("fichero.txt");
            
            System.out.println("No se vera este mensaje");
        }
        catch(IOException e){
            System.out.println("Error E/S: el fichero no existe"); 
            e.printStackTrace();
        }
        
    }
    
}
