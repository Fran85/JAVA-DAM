/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {
    //secuencia de fibbonaci

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime la cantidad de numeros de la sucecion de Fibonacci: ");
        long cantidad = teclado.nextInt();
        long primero = 1, segundo = 1;
        //primeros numero serian 1 y 1 
        long suma = 0;
        System.out.println(primero + " ");
        System.out.println(segundo + " ");
        for (int i = 3; i <= cantidad; i++) {
            suma = primero + segundo;
            primero = segundo;
            segundo = suma;

            System.out.println(suma + " ");
        }

    }

}
