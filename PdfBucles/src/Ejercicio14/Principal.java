/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero base: ");
        int base = teclado.nextInt();

        System.out.println("Introduce un exponente: ");
        int expo = teclado.nextInt();
        
        double poten =Math.pow(base, expo);

        System.out.println("potencia con math pow: " +poten);
        
        int potencia = 1;
        for (int i = 1; i <= expo; i++) {
            potencia = potencia*base;
        }
        
        System.out.println("El resultado es: "+potencia);
    }

}
