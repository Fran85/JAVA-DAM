/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase4;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce una calificaion");
        int calificacion = teclado.nextInt();
        
        switch (calificacion){
            case 1: case 2: case 3: case 4:
                System.out.println("Suspenso");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
                System.out.println("Notable");
                break;
            case 8:
                System.out.println("Notable");
                break;
            case 9:
                System.out.println("Sobresaliente");
                break;
            case 10:
                System.out.println("Matricula de honor");
                break;
        }
        
        System.out.println("--------------");
        
        System.out.println("Introduce una nota");
        double nota;
        
        nota = teclado.nextDouble();
        
        if (nota < 5 ){
            System.out.println("Suspenso");
        }else if ((nota >= 6 || nota < 7)){
            System.out.println("Bien");
        }else if ((nota >= 7 || nota <= 9)){
            System.out.println("Notable");
        }else if ((nota >= 9 || nota <= 10)){
            System.out.println("Sobresaliente");
        }else{
            System.out.println("Matricula de honor!");
        }
    
    }
    
}
