
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fran
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        
        int ANOACTUAL = 2022;
        int num = 0;
        int resultado;
        
        resultado = num - ANOACTUAL;
        
        Scanner dato = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        num = dato.nextInt();
        
        if (num>=18){
            System.out.println("es mayo de edad");
        }
        else{
            System.out.println("es menor de edad");
        }
        
    }
    
}
