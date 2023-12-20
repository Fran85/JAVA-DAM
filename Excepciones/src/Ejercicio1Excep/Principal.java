/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1Excep;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) {
        
        FileWriter f2=null;
        try{
            f2 = new FileWriter(" ");
            
            f2.write("hola");
            System.out.println("He escrito una cadena");
            
                   f2.close();
        }
        catch (IOException e){
            System.out.println("Hemos recogido la excepcion");
            e.printStackTrace();
        }

        
        
    }
    
}
