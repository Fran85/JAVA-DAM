/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio2ejer3;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class pricipal {
        //Calcular los euros que valen los bitcoins introducidos por teclado
        //la equivalencia entre bitcoin y euros hay que introducirla previamente
        // 1 bitcoin cuantos euros son..
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //ENTRADA DE DATOS
        System.out.println("Introduce la equivalencia ede 1 Bitocin en euros ");
        double equivalencia = teclado.nextDouble();
        
        System.out.println("Introduce los bitcoins que tienes ");
        double bitcoins = teclado.nextDouble();
        
        //ALGORITMO: SIEMPRE SE EMPIEZA POR AQUI
        //conversion = equicalencia + bitcoin de entrada
        double conversion = equivalencia * bitcoins;
        
        
        //SALIDA DE DATOS
        System.out.println("El resultado es... " + conversion);

    }
    
}
