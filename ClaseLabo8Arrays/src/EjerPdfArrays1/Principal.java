/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerPdfArrays1;

import java.util.Arrays;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {

        /*1. Hacer un programa que rellene un array 
        con los 100 primeros números enteros y los muestre en pantalla en
        orden inverso a como se han introducido (orden inverso).
         */
        int[] numeros = new int[100];

        //to.String muestra el contenido de un array, si eso te muestra la posicion de memoria
        //devuelkve el string para poder ver su contenido sin tener que recorrerlo, no haria falta for
        System.out.println(Arrays.toString(numeros));

        //1,2,3,4....100
        //0-1-2-3-...99
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        System.out.println(Arrays.toString(numeros));
        //de esta manera los muestra del 1 al 100, para hacerlo al reves
        
        
        //recorro al reves
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

    }

}
