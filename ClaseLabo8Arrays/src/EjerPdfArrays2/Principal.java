/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerPdfArrays2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    /*
    2. Hacer un programa que cree un array de 10 posiciones de números aleatorios entre
    1 y 100. Posteriormente
    se pedirá por teclado una posición y se mostrara en pantalla que valor tiene esa posición.
    Math.random() → Devuelve un numero entre 0.0 y 1.0
    Math.floor(Math.random()*6) → Devuelve un numero entre 0 y 5        
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            //el int entre parentesis es para hacer un casting ya que random es tipo double, con decimales
            //math.random * 100 =12.3455 97.765
            //le aplico un math.floor se convierte en 12.0 y 98.0
            //y le hago un casting a (int) y se convierten en 12 y 97(seria como un redondeo)
            //el math.floor redondea hacia abajo
            numeros[i] = (int) Math.floor(Math.random() * 100);
        }
        System.out.println(Arrays.toString(numeros));

        System.out.println("Introduce una posicion");
        int pos = teclado.nextInt();

        System.out.println(numeros[pos]);

    }

}
