/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio16Bis;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero y comprueba si es primo:" );
        
        
        
        //con bucle for
        int numero = teclado.nextInt();
        int contador = 0;
        for(int i = numero; i >= 1; i--){
            if(numero%i == 0){
                contador++;
            }
        }
        if(contador ==2){
            System.out.println("El numero: " +numero+ " es primo");
        }else{
            System.out.println("El numero: " +numero+ " no es primo");
        }
           
                
    }
    
}
