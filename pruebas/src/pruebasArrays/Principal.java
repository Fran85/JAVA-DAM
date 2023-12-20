/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasArrays;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();;
        
        String [] array=frase.split(" ");
        String invertido="";
        
        for(int i=array.length-1;i>=0; i--){
           invertido=invertido+" "+array[i];
        }
        System.out.println(invertido);
    }

}
