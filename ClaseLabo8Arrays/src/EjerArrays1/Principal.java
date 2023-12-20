/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerArrays1;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) {
        
        //CALCULO DE DIGITO DE CONTROL DEL DNI
        
       Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el DNI SIN LETRA");
        
        int dni = teclado.nextInt();
        
        char [] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E',};
        
        int posicion = dni%23;
        
        System.out.println(letra[posicion]);
        
        
    }
    
}
