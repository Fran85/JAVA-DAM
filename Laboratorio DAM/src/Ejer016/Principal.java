/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer016;

import java.util.Scanner;

/**
 *
 * @author damiansualdea
 */
public class Principal {

    /*
    Escribe un programa que diga si un número introducido por teclado es o no primo. 
    Un número primo es aquel que sólo es divisible entre él mismo y la unidad.
    solución es el contador: si el contador es 2--> es primo, si el contador es != 2 no es primo
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número y te digo si es primo o no");
        int num = teclado.nextInt();

        //5: 5%5(0) - 5%4(1) - 5%3(2) - 5%2(3) - 5%1(0)
        //contamos los divisibles: 2. Es primo
        // 5 / 4 = 1 resto 1
        // 5 / 3 = 1 resto 2
        int contador = 0;

        for (int i = num; i >= 1; i--) {
            if (num % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.println("El número: " + num + " es primo");
        } else {
            System.out.println("El número: " + num + " es no primo");
        }

        //dos condiciones
        contador = 0;
        int contadorVeces=0;
        int i = 1;
        while (contador <= 2 && i <= num) {
            if (num % i == 0) {
                contador++;
            }
            i++;
            //mientras no sea primo
            contadorVeces++;
        }
        System.out.println(contadorVeces);
        if (contador == 2) {
            System.out.println("El número: " + num + " es primo");
        } else {
            System.out.println("El número: " + num + " es no primo");
        }
    }

}
