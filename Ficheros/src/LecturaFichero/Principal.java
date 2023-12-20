/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LecturaFichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fichero = "fichero.txt";
        FileReader flujoEntrada = new FileReader(fichero);

        //con scanner y nextLine peta
        //Scanner lectura = new Scanner(flujoEntrada);
        
        //almacena todo el documento que le pasemos para que lea
        BufferedReader lectura = new BufferedReader(flujoEntrada);

        //Hay que leer linea a linea mientras no sea nulo
        String linea;
        int acumulador=0;
        while ((linea = lectura.readLine()) != null) {
            System.out.println(linea);
            
            //hacer operaciones, contar palabras por lineas
            int contarPalbarasLinea = 0;
            for(int i = 0; i<linea.length();i++){
                if(linea.charAt(i)==' ')
                   contarPalbarasLinea++;; 
            }
            System.out.println("Palabras por lineas: "+Integer.valueOf(contarPalbarasLinea+1));
            acumulador += contarPalbarasLinea+1;
            
            String [] lineaArray = linea.split(" ");
            System.out.println(lineaArray.length);
            
            //Mostrar el texto cambiando las e´s por 3
            String linea4 = linea.replace('e', '3');
            System.out.println(linea4);
            
            
            //Saber si hay una palabra
            if(linea.contains("hola"));{
            System.out.println("Si esta la palabra Hola");
        }
        }
        System.out.println("En total son: "+acumulador+" palabras en todo el texto");
        flujoEntrada.close();
    }

}
