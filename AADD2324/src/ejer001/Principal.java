/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer001;

import java.io.File;

/**
 *
 * @author Fran
 */
public class Principal {
    
    public static void main(String[] args) {
        /*
        en el contructor(entre comillas)
        se puede poner cualquier cosa        */
        File f = new File("cualquier/cosa/hola.doc");
        
        System.out.println("Nombre: "+f.getName());
        /*para sacar la ruta absoluta*/
        System.out.println("Ruta absoluta: "+f.getAbsolutePath());
        /*directorio padre*/
        System.out.println("Directorio padre: "+f.getParent());
    }
    
}
