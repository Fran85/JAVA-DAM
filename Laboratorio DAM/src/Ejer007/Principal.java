/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer007;

import java.util.Scanner;

/**
 *
 * @author damiansualdea
 */
public class Principal {

    /*
    Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El
    programa pedirá la combinación para abrirla. Si no se acierta, se mostrará el mensaje “Lo
    siento, esa no es la combinación” y si se acierta se dirá “La caja fuerte se ha abierto”. Se
    tendrán cuatro oportunidades para abrir la caja fuerte.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //poner a un puerta para asegurarnos que se ponen 4 cifras
        //String --> si son números --> parsearlo a un entero
        //String --> tiene un tamñao de 4 --> String.length()
        //Entrada: código de 4 cifras --> leemos 1 a 1 --> entre 0 - 9
        int codigo = 2456;
        int millares, centenas, decenas, unidades;
        int intentos = 4;
        //boolean interruptor = false;
        boolean hasGanado = false;

        do {
            do {
                System.out.println("Introduce el primer número: ");
                millares = teclado.nextInt();
            } while (millares < 0 || millares > 9); // queremos un número entre 0 y 9
            millares *= 1000;

            do {
                System.out.println("Introduce el segundo número: ");
                centenas = teclado.nextInt();
            } while (centenas < 0 || centenas > 9); // queremos un número entre 0 y 9
            centenas *= 100;

            do {
                System.out.println("Introduce el tercer número: ");
                decenas = teclado.nextInt();
            } while (decenas < 0 || decenas > 9); // queremos un número entre 0 y 9
            decenas *= 10;

            do {
                System.out.println("Introduce el cuarto número: ");
                unidades = teclado.nextInt();
            } while (unidades < 0 || unidades > 9); // queremos un número entre 0 y 9

            int combinacion = millares + centenas + decenas + unidades;
            //tenemos una combinación que podemos comparar con el código

            intentos--;

            if (combinacion == codigo) {
                // se abre la caja....
                hasGanado = true;
            } else {
                // no es el código
                System.out.println("No es el código, te queda... " + intentos);
            }

            //hay dos posibles salidas del programa
            // que has ganado, has acertado.
            // Te has pasado número de intentos
            
        } while (intentos > 0 && !hasGanado); //romper cuando una de las dos sea verdadero
        
        
       //evaluar por dónde ha salido el bucle
        if (hasGanado) {
            System.out.println("Has abierto la caja");
        } else {
            System.out.println("No lo has conseguido");
        }

    }

}
