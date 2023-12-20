/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claslab10ahoracado;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {

        /*
        Juego del ahorcado, se tiene una serie de vidas que si no aciertan la palabra pierden
        si la aciertan antes de que acaben las vidas gana
         */
        String palabra = "murciegalo";
        //trabajar con arrays, palabra.toCharArray();cone sto se convierte a array, es un metodo
        char[] palabraArray = new char[palabra.length()];

        for (int i = 0; i < palabraArray.length; i++) {
            palabraArray[i] = palabra.charAt(i);
        }
        System.out.println(Arrays.toString(palabraArray));

        //crear la cadena de asteriscos
        char[] asteriscos = new char[palabra.length()];
        for (int i = 0; i < asteriscos.length; i++) {
            asteriscos[i] = '*';
        }
        System.out.println(Arrays.toString(asteriscos));

        Scanner teclado = new Scanner(System.in);
        int vidas = 5;
        String letraString;
        char letra;
        boolean hasGanado = false;
        //tranformas esto (!Arrays.equals(asteriscos, palabraArray) en un booleano
        //terminamos cuando acertamos o perdemos todas las vidas
        do {
            System.out.println("Introduce una letra: ");
            letraString = teclado.next();
            letra = letraString.charAt(0);

            if (palabra.contains(String.valueOf(letra))) {
                for (int i = 0; i < palabra.length(); i++) {
                    /*
                    if (palabra.equalsIgnoreCase(String.valueOf(letra)));
                    {

                    }
                     */
                    if (letra == palabra.charAt(i)) {
                        asteriscos[i] = letra;
                    }
                }
                System.out.println(Arrays.toString(asteriscos));
                if (!Arrays.equals(asteriscos, palabraArray)) {
                    hasGanado = true;
                }
            } else {
                //Crear un ArraList de letras falladas para evitar que descuenten vidas
                vidas--;
                System.out.println("Letra no encontrada, te quedan " + vidas + " vidas");
            }

            //} while (vidas > 0 && !Arrays.equals(asteriscos, palabraArray));
        } while (vidas > 0 && !hasGanado);
        //if(vidas==0){
        if (!hasGanado) {
            System.out.println("has perdidos");
        } else {
            System.out.println("Has ganado, te han sobrado " + vidas + " vid as");
        }

    }

}
