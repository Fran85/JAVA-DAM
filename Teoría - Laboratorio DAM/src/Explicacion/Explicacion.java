/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Explicacion;

/**
 *
 * @author damiansualdea
 */
public class Explicacion {
    public static void main(String[] args) {
        
        
        boolean condicion = true;
        
        // Operadores comparativos < > <= >= != ==
        // Operadores lógicos  ! && ||
        
        if (condicion){
           //ejecuta si es verdadera
            System.out.println("IF: condición verdadera");
        }else
            //se ejecuta si es falso
            System.out.println("IF: condición falsa");
        
        //1º Inicalizamos la variable que depende de la condición
        condicion = true;
        while (condicion){
            //VERDADERAS
            //ejecutan instrucciones
            System.out.println("WHILE: condición verdadera");
            //2º tocamos la variable que depende de la condición
            condicion = false;
            
        }//ROMPE EL BUCLE

        System.out.println("WHILE: condición falsa");
        
        condicion = true;
        do{      
            System.out.println("DO WHILE: condición verdadera");
            condicion = false;
        }while(condicion);
        System.out.println("DO WHILE: condición falsa");
        
        //DIFERENCIA WHILE Y DO WHILE
        //DO WHILE ejecuta mínimo 1 vez: 1 - N veces
        //WHILE ejecuta mínimo 0 veces: 0 - N veces
        
        //Bucle: en la definición se explica el comportamiento del bucle
        //cuando sabemos el principio y el final de las cosas
        
        //1º Inicalizamos la variable que depende de la condición
        int i = 1;
        while (i<=10){ //1, 2, 3, ....10, 11       
            System.out.println("Holaaaaaaa");
            //2º tocamos la variable que depende de la condición
           i++;  //
        }//ROMPE EL BUCLE
        System.out.println(i);
        
        
        for( int j=1; j<=10; j++ ){
            System.out.println("Hola ");
        } // j = 1,2,3,4...10, 11
    }
    
}
