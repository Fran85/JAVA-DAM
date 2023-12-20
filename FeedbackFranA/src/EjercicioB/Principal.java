/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioB;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) {
        
       Scanner teclado = new Scanner(System.in);
       
        System.out.println("Introduce un numero: ");
        int numero1 = teclado.nextInt();
        
        System.out.println("Introduce un numero mayor que el anterior: ");
        int numero2 = teclado.nextInt();
        
        for(;numero1<=numero2;numero1++){
            if (numero1 % 5 == 0){
                System.out.println("El numero "+numero1+" es divisible por 5");
            }else{
                System.out.println("El numero "+numero1+" no es divisible por 5");
            }
        }
        
        
        
        
        
        
    }
    
}
