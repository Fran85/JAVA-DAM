/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerPdfArrays5;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    /*
    5. Hacer un programa que pida un numero por teclado 
    y después diga si el numero introducido es capicúa o no.
     */
    public static void main(String[] args) {

        //123321
        //12321
        //111222444222111
        //todos estos serian capicuas
        //un string es un array
        //rellenamos el array 
        Scanner teclado = new Scanner(System.in);

        System.out.println("introduce un numero ");
        String numero = teclado.next();

        for (int i = 0; i < numero.length(); i++) {
            //con esto se accede a la posicion de un array
           // System.out.println(numero.charAt(i));

        }
        //se compara el array primera posicion con la ultima, segunda con la cuarta....
        //12321
        //0-1
        //1-3
        //2-2
        //3-1
        //4-0
        boolean capicua = true;
        int j = numero.length() - 1;
        for (int i = 0; i < numero.length(); i++) {
            //con esto se accede a la posicion de un array
            //System.out.println(i + " - " + j);

            if (numero.charAt(i) != numero.charAt(j)) {
                capicua = false;
            }
            j--;
        }
        if (capicua) {
            System.out.println("Capicuaaaa");
        } else {
            System.out.println("Noooooooo");
        }

    }
}
