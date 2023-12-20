
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fran
 */
public class Pricipal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //ENTRADA DE DATOS
        System.out.println("Calculo del area de un circulo");
        System.out.println("Introduce el radio: ");
        double radio = teclado.nextDouble();
        
        //ALGORITMO
        //area = PI por radio al cuadrado
        //Math es una clase, es un API de Java
        double area = Math.PI * radio * radio;
        area = Math.PI * Math.pow(radio, 2);
        
        
        //SALIDA DE DATOS
        System.out.println("El area es.. "+area);
    }
    
}
