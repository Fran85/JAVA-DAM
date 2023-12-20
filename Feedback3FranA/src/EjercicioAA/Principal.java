/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioAA;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {
        
        System.out.println("Escribe una frase: ");
        
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine();
        
        System.out.println("La frase al reves es: ");
        for (int i = frase.length() - 1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }
        
    }
    
}
