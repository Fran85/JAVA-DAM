/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioA;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de productos comprados: ");
        int productos = teclado.nextInt();
        
        System.out.println("Ingrese el precio del producto: ");
        double precio = teclado.nextDouble();
        
        double total, total2;
        double descuento;
        
        total = productos * precio;
        
        descuento = total * 0.20;
        
        total2 = total - descuento;
        
        System.out.println("La cantidad a pagar con el descuento aplicado es: "+total2);
        
        
        
        
        
        
    }
    
}
