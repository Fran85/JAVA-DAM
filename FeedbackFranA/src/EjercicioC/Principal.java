/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioC;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int factorial = 1;

        System.out.println("Introduce un numero para calcular su factorial: ");
        int numero = teclado.nextInt();
        
        
        while (numero == 0 || numero < 0) {

            System.out.println("El numero es negativo o 0, por vafor, introduce otro numero: ");
            numero = teclado.nextInt();
        }

        for (int i = 1; i <= numero; i++) {

            factorial = factorial * i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);

    }

}
