
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fran
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
            int num = 0;
            
            System.out.println("Introduce un numero: ");
            num = teclado.nextInt();
            
            int resultado = num*num;
            
            System.out.println(num + " elevado al cuadrado es: " + resultado);
    }
    
}
