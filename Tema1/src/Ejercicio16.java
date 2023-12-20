
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fran
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        
        int numero;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un numero entero: ");
        numero = teclado.nextInt();
        
        if (numero % 2 == 0)
        {
            System.out.println("El numero es PAR");
        }
        else
        {
            System.out.println("El numero es IMPAR");
        }
    }
    
}
