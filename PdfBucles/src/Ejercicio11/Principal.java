/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {
    //ejercicio 11 ejercicios bucles, cuadrado y cubo de los 5 primeros numeros enteros introducidos por teclado

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero y te doy el cuadrado y el cubo del numero y los 5 siguientes");

        int num = teclado.nextInt();

        for (int i = num; i <= num + 5; i++) {
            System.out.println(i + " " + (int) Math.pow(num, 2) + " " + (int) Math.pow(i, 3));
        }

    }

}
