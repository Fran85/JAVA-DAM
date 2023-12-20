/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase6;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {
    /*1.Escribir un programa que solicite ingresar 10 notas de alumnos 
    y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
    */
    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double nota;
        int contMayor = 0;
        int contMenor = 0;
        
        //bucle que se repite 10 veces
        for(int i = 0; i <=10; i++){
            //cada iteracion va cambiando la nota
            //validacion, si el numero es negativo no sale del bucle
            do{
            System.out.println("Introduce la nota: "+i);
            nota = teclado.nextDouble();
            }while(nota < 0 || nota>10);//si esta en los valores que yo quiero, que rompa el bucle
            //¿Que pasa si el docente introduce notas no validas en caunto a rangos?
            //rangos validos-->0 a 10--> poner en el while lo contrario de lo que queremos
            
            
            if(nota >= 7){
                contMayor++;
            }else{
                contMenor++;
            }
            
        }
        
        System.out.println("Mayores o iguales a 7 "+contMayor);
        System.out.println("Menores de 7 "+contMenor);
    }
}
