/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = (int) Math.floor(Math.random() * 100);
        }
        System.out.println(Arrays.toString(numeros));
        int posicion = teclado.nextInt();

        System.out.println("Introduce una posicion");
        System.out.println(numeros[posicion]);

    }

}
