/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioB;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabras[] = new String[10];

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("introduce 10 palabras: " + (i + 1));
            palabras[i] = teclado.nextLine();
        }

        Arrays.sort(palabras);
                System.out.println(Arrays.toString(palabras));

        //for (int i = palabras.length-1; i >= 0; i--) {
          //  System.out.print(palabras[i]+ " ");
        //}
    }

}
