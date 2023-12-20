/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioA;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    /*
    a) Hacer una aplicación que pida por pantalla que se escriba una frase para
    almacenarla, después sacar por pantalla la misma frase al revés.
    
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();;
        
        String [] array=frase.split(" ");
        String fraseInvertida="";
        
        for (int x=frase.length()-1;x>=0;x--)
        fraseInvertida = fraseInvertida + frase.charAt(x);
        System.out.println(fraseInvertida);

    }
}
