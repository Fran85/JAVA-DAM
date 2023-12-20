/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author damiansualdea
 */
public class Principal {

    public static void main(String[] args) {
        /*
        Realiza los siguientes ejercicios sobre bucles:
            a) Calcular y escribir los cuadrados de una serie de números hasta que se 
            introduzca el 0 desde el teclado
            b)  Leer desde teclado una serie de números hasta que aparezca alguno menor que 1000
            c) Leer valores por teclado y que te diga si es igual, menor o mayor que 25. 
            La marca de fin de lectura será el número 12345678
            d) Visualizar los múltiplos de 4 comprendidos entre 4 y N, 
            que es el número que se introduce por teclado
            e)  Leer una serie de números desde el terminal y calcular su media. 
            La marca de fin de lectura será el número -999
         */
        Scanner teclado = new Scanner(System.in);
 
        //e)  Leer una serie de números desde el terminal y calcular su media. 
        //    La marca de fin de lectura será el número -999
        
        int num7;
        //MEDIA = SUMA DE TODOS LOS NUMEROS / CANTIDAD DE NÚMEROS
        
        int contador =0 , acumulador=0;
        double media;
        
        do{
            System.out.println("Introduce un número para la media, el -999 sale");
            num7 = teclado.nextInt(); // 4, 6, 8, 2, -999
            
            if(num7!=-999){
                acumulador = acumulador + num7; // 4, 10, 18, 20 -999
                //acumulador += num7;
                contador++; // 1, 2, 3, 4, 5
            }
   
        }while(num7!=-999);
        
        //acumulador += 999;
        //contador--;
        media = acumulador / contador;
        System.out.println("La media: "+media);
        
        //d) Visualizar los múltiplos de 4 comprendidos entre 4 y N, 
        //    que es el número que se introduce por teclado
        
        //1º al dividir por 4 el resto es 0
        System.out.println("Introduce el límite para calcular los múltiplos de 4");
        int num6 = teclado.nextInt();
        for(int i=4;i<=num6;i++){
            if(i%4==0)
                System.out.println(i+" ");
        }       
        
        //2º alogritmo: sumamos 4       
        for(int i=4;i<=num6;i+=4)
            System.out.println(i);
        
        
        System.out.println("------Siguiente programa-----");
        //c) Leer valores por teclado y que te diga si es igual, menor o mayor que 25. 
        //   La marca de fin de lectura será el número 12345678
        
        int num4;
        do{
            System.out.println("Introduce un número, salida 12345678");
            num4=teclado.nextInt();
            
            if(num4==25)
                System.out.println("Igual a 25");
            else if(num4>25)
                
                System.out.println("Es mayor que 25");
            else 
                System.out.println("Es menor que 25");
            
        }while(num4!=12345678);
        System.out.println("------Siguiente programa-----");
        //b)  Leer desde teclado una serie de números hasta que aparezca alguno menor que 1000
        int num3;
        do {
            
            System.out.println("Introduce un número, si es menor que 1000 sales del programa");
            num3 = teclado.nextInt();

        } while (num3 >= 1000);

        System.out.println("------Siguiente programa-----");
        //a) Calcular y escribir los cuadrados de una serie de números hasta que se 
        //    introduzca el 0 desde el teclado
        int num, cuadrado2;
        double num2, cuadrado;

        do {
            System.out.println("Introduce un número, el 0 sale del programa");
            num2 = teclado.nextDouble();
            cuadrado = num2 * num2;
            cuadrado = Math.pow(num2, 2);
            Math.floor(num2); //aproximas hacia arriba
            //casting
            cuadrado2 = (int) cuadrado;
            System.out.println("Su cuadrado es: " + cuadrado2);

        } while (num2 != 0);//ROMPE SALIDA

        System.out.println("Salida del programa");

    }
}
