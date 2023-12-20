/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca numeros positivos para saber su media,");
        System.out.println("para parar el programa introduzca uno negativo");

        double numero = 0;
        double contador = 0;
        double suma = 0;

        while (numero >= 0) {
            numero  = teclado.nextInt();
            contador++;
            suma += contador;

        }
        System.out.println("La media total es " + (suma - numero) / (contador - 1));

    }

}
