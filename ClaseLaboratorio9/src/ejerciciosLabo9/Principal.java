/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosLabo9;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {

        // ejercicio 16 de arrays
        /*Hacer un programa que lea dos cadenas de caracteres y forme una tercera intercalando los
        caracteres de las palabras de las dos primeras cadenas. Escribir las tres cadenas.
         */
        //una cadena es una array,es un conjunto de char
        //se concatena con +
        //se puede trabajar con equals
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce cadena 1: ");
        String cadena1 = teclado.nextLine();
        System.out.println("Introduce cadena2: ");
        String cadena2 = teclado.nextLine();

        System.out.println(cadena1 + cadena2);

        //primero a plantear tamaño de la tercera cadena
        String cadena3 = "";
        //metodo de concatenacion

        cadena3 += cadena1.charAt(0);
        System.out.println(cadena3);
        cadena3 = "";

        //recorrer la cadena mas larga
        int tamMax = Math.max(cadena1.length(), cadena2.length());

        for (int i = 0; i < tamMax; i++) {
            if (i < cadena1.length() && i < cadena2.length()) {
                cadena3 = cadena3.concat(String.valueOf(cadena1.charAt(i)) + String.valueOf(cadena2.charAt(i)));
            } else if (i >= cadena1.length()) {
                cadena3 = cadena3.concat(String.valueOf(cadena2.charAt(i)));

            } else {
                cadena3 = cadena3.concat(String.valueOf(cadena1.charAt(i)));
            }
        }
        System.out.println(cadena3);

        //con next se coge hasta donde encuentra el espacio en blanco
    }

}
