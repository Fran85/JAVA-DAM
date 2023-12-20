/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio27;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("El programa calcula los multiplos de 3 hasta el numero introducido");
        
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        
        for(int i = 0;(i*3)<=numero;i++){
            if(i<=numero){
                System.out.println(i+"º) "+(i*3));
            }else{
                //nada
            }
        }
        
    }
    
}
