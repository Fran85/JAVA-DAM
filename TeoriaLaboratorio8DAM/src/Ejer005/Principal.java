/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer005;

import java.util.Scanner;

/**
 *
 * @author damiansualdea
 */
/*
5. Hacer un programa que pida un numero por teclado 
y después diga si el numero introducido es capicúa o no.
 */
public class Principal {

    public static void main(String[] args) {
        //123321
        //12321
        //111222444222111

        //rellenamos el array
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número ");
        String numero = teclado.next();

        for (int i = 0; i < numero.length(); i++) {
            //  System.out.println(numero.charAt(i));
        }

        //123111
        //0-4
        //1-3
        //2-2
        //3-1
        //4-0
        boolean capicua = true;
        int j = numero.length() - 1;
        for (int i = 0; i < numero.length(); i++) {
            //System.out.println(i +" - "+j);
            if (numero.charAt(i) != numero.charAt(j)) {
                capicua = false;
            }
            j--;
        }

        if (capicua) {
            System.out.println("capicuaaaa");
        } else {
            System.out.println("nooooooo");
        }

    }

}
