/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("Por favor, introduzca 10 numeros enteros: ");

        int negativos = 0;
        int positivos = 0;

        for (int i = 0; i < 10; i++) {
            if (Integer.parseInt(System.console().readLine()) < 0) {
                negativos++;
            } else {
                positivos++;
            }

        }
        System.out.println("Ha introducido " + positivos + " positivos y " + negativos + " negativos.");
    }

}
