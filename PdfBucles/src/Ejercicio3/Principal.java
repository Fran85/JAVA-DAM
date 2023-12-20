/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) {
        
        int num = 0;
        
        do{
            if(num % 5 == 0){
                System.out.println("Los multiplos de 5 son: " + num);
            }
            num++;
        }while(num <= 100);
    }
    
}
