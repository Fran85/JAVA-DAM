
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fran
 */
public class Ejercicio25 {
    /**
     * Lee 2 numeros y escribe entre parentesis
     * el mayor, si lo hay
     * 
     * la lectura se hace en la misma linea
     */
    
    public static void main(String[] args) {
        
        int numero1 = 0, numero2 = 0;
        Scanner teclado = new Scanner(System.in);
        
        // La entrada de los números se realiza 
        // separándolos por un espacio en la misma línea
        
        System.out.println("Escribe dos numeros: ");
        numero1 = teclado.nextInt();
        numero2 = teclado.nextInt();
        
        if (numero1 == numero2)
                System.out.println(numero1 + " - " + numero2);
        else if (numero1 > numero2)
                System.out.println("(" + numero1 + ") - " + numero2);
             else
                System.out.println(numero1 + " - (" + numero2 + ")");
    }
    
}
