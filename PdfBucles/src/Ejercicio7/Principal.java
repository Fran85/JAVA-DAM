/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int contraseña = 1111;
        boolean acertado = false;
        int intentos = 4;

        for (int i = 0; i < 4; i++) {
            System.out.println("Introduce la contraseña: ");
            int intento = teclado.nextInt();

            if (intento == contraseña) {
                System.out.println("Has abieto la caja!!");
                acertado = true;
                break;

            } else {
                System.out.println("Contraseña incorrecta");
            }
            intentos--;
            System.out.println("Te quedan " + intentos + " intentos");

        }

    }

}
