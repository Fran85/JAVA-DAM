/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer007Labo6Bucles;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {

        /*Realiza el control de acceso a una caja fuerte.
        La combinación será un número de 4 cifras. El programa pedirá la combinación para abrirla. 
        Si no se acierta, se mostrará el mensaje 
        “Lo siento, esa no es la combinación” y si se acierta se dirá 
        “La caja fuerte se ha abierto”. Se tendrán cuatro oportunidades para abrir la caja fuerte.
         */
        Scanner teclado = new Scanner(System.in);

        //poner una validacion apra asegurarnos que se ponen 4 cifras
        //String > ai aon numeros -->se podria parsearlo
        //String --> tiene un tamaño de 4 -->String.length()
        //seria perfecto con un array
        //Eentrada: codigo de 4 cifras --> leemos una a una y que estre entre 0 y9
        int codigo = 2456;
        int millares, centenas, decenas, unidades;
        int intentos = 4;
        //boolean interruptor = false;
        boolean hasGanado = false;

        do {

            do {
                System.out.println("Introduce el primer numero del codigo: ");
                millares = teclado.nextInt();

            } while (millares < 0 || millares > 9);//queremos un numero entre 0 y 9

            millares = millares * 1000;

            do {
                System.out.println("Introduce el primer numero del codigo: ");
                centenas = teclado.nextInt();

            } while (centenas < 0 || centenas > 9);//queremos un numero entre 0 y 9

            centenas = centenas * 100;

            do {
                System.out.println("Introduce el primer numero del codigo: ");
                decenas = teclado.nextInt();

            } while (decenas < 0 || decenas > 9);//queremos un numero entre 0 y 9

            decenas = decenas * 10;

            do {
                System.out.println("Introduce el primer numero del codigo: ");
                unidades = teclado.nextInt();

            } while (unidades < 0 || unidades > 9);//queremos un numero entre 0 y 9

            int combinacion = millares + centenas + decenas + unidades;
            //tenemos una combinacion que podemos comparar con el codigo

            intentos--;

            if (combinacion == codigo) {
                //se abre la caja
                hasGanado = true;
            } else {
                //no es el codigo
                System.out.println("No es el codigo, te quedan :" + intentos);
            }

            //hay dos posibles salidas del programa
            //una que has abierto la caja y otra es uqe no la has abierto
            //te has pasado en numero de intentos
        } while (intentos >= 0 && !hasGanado); //Romper el bucle cuando una de las dos sea verdadero

        if (hasGanado) {
            System.out.println("Has abierto la caja");
        } else {
            System.out.println("No lo has conseguido");
        }
    }

}
