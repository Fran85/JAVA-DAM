/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in)   ;
        System.out.println("Introduce un numero para saber cuantos son: ");
     int numero = teclado.nextInt();
     int digitos = numero;
     int contador = 0;
     
     while(digitos>0){
         digitos = digitos/10;
         contador++;
     }
        System.out.println(numero + " tiene " + contador + " digitos");
     
     
        
    }
    
}
