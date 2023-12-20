/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Labo6Ejer;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    //EJERCICIO 10 DE LOS EJERCICIOS DE BUCLES
    /*Escribe un programa que calcule la media de un conjunto de números
    positivos introducidos por teclado. 
    A priori, el programa no sabe cuántos números se introducirán. 
    El usuario indicará que ha terminado de introducir los datos 
    cuando meta un número negativo
     */
    //MEDIA ES LA SUMA DE TODOS LOS ELEMENTOS PARTIDO DEL NUMERO DE ELEMENTOS
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double num, suma = 0; 
                int contador = 0;

        do {
            System.out.println("introduce un numero(negativo para salir");
            num = teclado.nextInt();
            if (num >= 0) {
                suma += num;
                contador++;
            }
        } while (num >= 0);//condicion rotura--->num<0
        double media = suma / contador;
        System.out.println("La medai es: " + media);
    }
}
