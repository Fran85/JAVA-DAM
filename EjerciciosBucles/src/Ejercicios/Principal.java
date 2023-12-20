/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //e) leer una seria de numeros desde el terminal y calcular su media
        // la marca de fin de lectura sera el numero -999
        int num6;
        //media = suma de todos los numeros / cantidad de numeros

        int contador = 0, acumulador = 0;
        double media;

        do {
            System.out.println("Introduce un numero para la media, el -999 saca del programa");
            num6 = teclado.nextInt();

            if (num6 != -999) {
                acumulador = acumulador + num6;
                //acumulador es acumulador + num6, si solo ponemos num6 nos cargamos el contenido
                contador++;
            }
        } while (num6 != 999);

        //solucion cutre
        //acumulador +=999;
        //contador--;
        media = acumulador / contador;
        System.out.println("la media es: " + media);

        //----------------------------------------------------------
        //d) Visualizar los multiplos de 4 compredidos entre 4 y N
        // que es el numero que se introduce por teclado
        //multiplo de 4, al dividir por 4 el resto es 0
        System.out.println("Introduce el limite para calcular los multiplos de 4");

        int num5 = teclado.nextInt();
        for (int i = 4; i <= num5; i++) {
            if (i % 4 == 0) {
                System.out.println(i + " ");
            }
        }

        //2ºalgoritmo, mas limpio y menos operaciones en maquina
        for (int i = 4; i <= num5; i += 4) {
            System.out.println(i);
        }

        //c Leer valores por teclado y que tye diga si es igual, menor o mayor que 25
        //la marca de fin de lectura sera el numero 12345678
        int num4;
        do {
            System.out.println("introduce un numero, la salida es 12345678");
            num4 = teclado.nextInt();

            if (num4 == 24) {
                System.out.println("Igual a 25");
            } else if (num4 > 25) {
                System.out.println("Es mayor a 25");
            } else {
                System.out.println("Es menor a 25");
            }

        } while (num4 != 12345678);

        //b) leer teclado una serie de numeros hasta que aparezca alguno menor de 1000
        int num2;
        do {
            System.out.println("Introduce un numero, si es menor de 1000 sales del programa");
            num2 = teclado.nextInt();
        } while (num2 >= 1000);

        //a)Calcular y escribir los cuadrados de una serie de numeros hasta que se 
        //introduzca el 0 por teclado
        // System.out.println("Introduce un numero, el 0 saca del programa");
        // int num = teclado.nextInt();
        //el cuadrado seria numero por su numero 
        //o con la clase MATH.pow pero habria que declarar el double
        //ya que trabaja con double esa clase
        int num, cuadrado2;
        double cuadrado;
        do {
            System.out.println("Introduce un numero, el 0 saca del programa");
            num = teclado.nextInt();

            cuadrado = num * num;
            cuadrado = Math.pow(num, 2);

            //seria hacer un casting a entero, perderia la parte decimal
            cuadrado2 = (int) cuadrado;

            System.out.println("Su cuadrado es: " + cuadrado2);

        } while (num != 0);
        System.out.println("Sale del programa");
    }

}
