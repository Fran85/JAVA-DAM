/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2Excep;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String linea = teclado.nextLine();
        
        try{
        if(linea.length()>=10){
            throw new ExcepcionMetro();
        }
        }catch(ExcepcionMetro e){
            System.out.println("Hemos recogido nuestra excepcion");
            e.printStackTrace();
            e.ver();
        }
    }
    
}
