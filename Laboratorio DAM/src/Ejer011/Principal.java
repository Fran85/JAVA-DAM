/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer011;

import java.util.Scanner;

/**
 *
 * @author damiansualdea
 */
public class Principal {

    //Escribe un programa que muestre en tres columnas, 
    //el cuadrado y el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = 5;
        double m = 6.0;

        m = n;
        
        System.out.println(m);

        System.out.println("Introduce un número y te doy el cuadrado y el cubo del número y los 5 siguientes");

        int num = teclado.nextInt();

        for (int i = num; i <= num + 5; i++) {
            System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3));
        }

    }
}
