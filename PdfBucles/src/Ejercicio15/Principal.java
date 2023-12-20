/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio15;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la base: ");
        int base = teclado.nextInt();

        System.out.println("Introduce el exponente maximo:");
        int exponenteFinal = teclado.nextInt();

        int potencia;
        int exponente;

        for (int i = 0; i <= exponenteFinal; i++) {
            potencia = 1;
            exponente = i;

            for (int j = 0; j < exponente; j++) {
                potencia *= base;
            }
            System.out.println(base + "^" + i + " = " + potencia);
        }
    }

}
