/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {
        /*
        Escribe un programa que diga si un numero es primo o no
        la solucion es el contador: si el contador es 2-->es primo, si el contador es != 2 no es primo
         */

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero y te digo si es primo: ");

        int num = teclado.nextInt();

        //ejemplo, imaginoa el 5 / 5 y nos quedamos con el resto (%) si 5%5(0) contamos- 5%4(4) - 5%3(2) - 5%2(3) - 5%1(0)
        //se contrarian los divisibles y nos sale dos, ya que los primos son divisibles entre ellos mismos y uno
        //nos daria 2, ya que 5 solo se puede dividir entre el mismo y el 1 para que nos de resto 0
        int contador = 0;
        for (int i = 2; i >= num; i--) {
            if (num % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.println("El numero: " + num + " es primo");
        } else {
            System.out.println("El numero: " + num + " no es primo");
        }
        //dos condiciones

        contador = 0;
        int contadorVeces = 0;
        int i = 1;
        while (contador <= 2 && i <= num) {
            if (num % i == 0) {
                contador++;
            }
            i++;
            //mientras no sea primo, esto funcionaria
            contadorVeces++;
        }
        System.out.println(contadorVeces);
        if (contador == 2) {
            System.out.println("El numero: " + num + " es primo");
        } else {
            System.out.println("El numero: " + num + " no es primo");
        }

    }

}
