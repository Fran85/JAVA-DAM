/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer002;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author damiansualdea
 */
public class Principal {
            /*
        2. Hacer un programa que cree un array de 10 posiciones 
        de números aleatorios entre 1 y 100. Posteriormente
        se pedirá por teclado una posición y 
        se mostrara en pantalla que valor tiene esa posición.
        */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int[] numeros = new int[10];
        
        for(int i = 0; i<numeros.length;i++){
            //Math.random() valores entre 0 y 1 = 0.1234555 0.977655
            //*100 = 12.3455 97.765
            //Math.floor() = 12.0 98.0
            //(int) = 12 98
            numeros[i]=(int) Math.floor(Math.random()*100);
        }
        
        System.out.println(Arrays.toString(numeros));
        
        System.out.println("Introduce una posición");
        int pos = teclado.nextInt();
        System.out.println(numeros[pos]);
  
        
    }
    
}
