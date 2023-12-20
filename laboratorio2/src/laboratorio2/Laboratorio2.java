/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio2;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Laboratorio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Vamos a calcular el area de un triangulo");
        //1. ENTRADA DE DATOS
        //LAS VARIABLES,
        //Declaracion de variables
        double base;
        //Uso de la varible
        System.out.println("Introduce la base del triangulo: ");
        base = teclado.nextDouble();
        System.out.println("El valor recogido es.."+base);
        
        System.out.println("Introduce la altura del triangulo: ");
        double altura = teclado.nextDouble();
        System.out.println("El valor recogido es.."+altura);
        
        
        
        
        //2. ALGORITMO
        //area de triangulo = base x altura divido por 2
        double area;
        area = (base * altura / 2);
        
        
        //3. SALIDA DE DATOS
        System.out.println("El area es... "+area);
        System.out.println("Para el lado " +base+ " y la altura " +altura+ ". El area es:" +area);

    }
    
}
