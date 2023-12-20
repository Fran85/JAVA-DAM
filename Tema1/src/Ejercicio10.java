
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fran
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        
       int Radio;
       
        System.out.println("Ingresa el tamaño del radio: ");
        
        Scanner radio = new Scanner(System.in);
        
        Radio = radio.nextInt();
        
        double Area = Math.PI * Math.pow(Radio, 2);
        
        System.out.println("El area del circulo es: " + Area);
    }
    
}
