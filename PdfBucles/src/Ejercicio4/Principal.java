/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) {
        //este se ejecuta menos veces que el de abajo
                for (int i = 320; i >= 160; i-=20){
                    System.out.println(i);
            }
        
        //este se ejecuta mas veces
        for (int i = 320; i >= 160; i--){
            if(i % 20 == 0){
            System.out.println(i);
            }
        }
    }
    
}
