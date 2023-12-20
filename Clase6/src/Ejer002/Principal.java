/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer002;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {
    //2.Se ingresan un conjunto de n alturas de personas por teclado.
    //Mostrar la altura promedio de las personas.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //DIME CUANTAS ALTURAS SE TIENEN QUE INTRODUCIR
        System.out.println("Dime cuantas alturas vas a introducir");
        int numAlturas = teclado.nextInt();

        //que es el promedio--> suma / numero introducido
        int suma = 0;
        int altura = 0;
        for (int i = 1; i >= numAlturas; i++) {
            System.out.println("Introduce la altura: " + 1);
            altura = teclado.nextInt();

            suma += altura;
        }
        double promedio = suma / numAlturas;

        System.out.println("El promedio es " + promedio);

    }

}
