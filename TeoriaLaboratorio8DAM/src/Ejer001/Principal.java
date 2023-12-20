/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer001;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author damiansualdea
 */
public class Principal {
    /*
    1. Hacer un programa que rellene un array 
    con los 100 primeros números enteros y los 
    muestre en pantalla en
    orden inverso a como se han introducido (orden inverso).
    */
    public static void main(String[] args) {
        int[] numeros = new int[100];
        
        System.out.println(Arrays.toString(numeros));
        
        //1,2,3,4....100
        //0-1-2-3-....-99
        
        for(int i = 0; i<numeros.length;i++){
            numeros[i]= i+1;
        }
        System.out.println(Arrays.toString(numeros));
        String hola;
        
        //recorro al reves
        //99, 98, 97 .... 0
        for(int i = numeros.length-1;i>=0;i--){
            System.out.print(numeros[i] +" ");
        }
        
    }
    
}
