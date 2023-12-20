
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fran
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int numero1 = 0;
        int numero2 = 0;
        
        System.out.println("Introduce el primer numero: ");
        numero1 = reader.nextInt();
        
        System.out.println("Introduce el segundo numero: ");
        numero2 = reader.nextInt();
        
        int resultado = numero1+numero2;
        
        System.out.println("La suma es " + numero1 + " + " + numero2 + " = " + resultado);
    }
}
