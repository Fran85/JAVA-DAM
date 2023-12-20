/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3Lectura;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String fichero = "fichero.txt";
        FileReader flujoEntrada = new FileReader(fichero);

        //Almacena todo el documento 
        BufferedReader lectura = new BufferedReader(flujoEntrada);

        String linea;
        int acumulador = 0;
        while ((linea = lectura.readLine()) != null) {
            System.out.println(linea);

            //hacer operaciones, contar palabras por linea
            //se contaria hasta un espacio en blanco
            int contarPalabrasLinea = 0;

            for (int i = 0; i < linea.length(); i++) {
                if (linea.charAt(i) == ' ') {
                    contarPalabrasLinea++;
                }
            }
            System.out.println("Palabras por linea: " + Integer.valueOf(contarPalabrasLinea + 1));
            acumulador += contarPalabrasLinea+1;
            
            //Convertir en array la linea con la cantidad de palabras totales
            String [] lineaArray = linea.split(" ");
            System.out.println(lineaArray.length);
            
        }
        System.out.println("En total: "+ acumulador);
        flujoEntrada.close();

    }

}
