/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase3;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Definido de una variable + inicializarla
        int valor = 6;
        //Definicion de la variable
        int valorX = teclado.nextInt();
        //Inicializacion de variable
        valorX = 19;
        //Inicializacion de la variable
        if(valor>2){
            int valor9 = 8;
            valor = valor9 + valor;
        }
        //System.out.println(valor9);
        
        //Diferencia entre entero y real, int / double
        int numA = 7;
        double numB = 7;
        
        System.out.println(numA + " " + numB);
        //Tamaño de los enteros
        System.out.println(Integer.MAX_VALUE+ " "+Integer.MIN_VALUE);
        numA = teclado.nextInt();
        System.out.println(numA);
        
        
        //Operaciones variavles
        
        
        
        int numC = 12;
        int numD = 5;
        int resta = numC - numD;
        System.out.println(resta);
        
        
        int suma = numC + numD;
        System.out.println(suma);
        
        int producto = numC * numD;
        System.out.println(producto);
        
        int division= numC * numD;
        System.out.println(division);
        int resto = numC % numD;
        System.out.println(resto);
        //esto sabe para saber los numeros pares y para los años bisiestos
        //para ello se trabaja con el resto
        
        
        //asignacion de abreviados
        int numG = 9;
        numG = numG +9;
        //es lo mismo que poner y mas comodo
        numG +=9;
        numG -=9;
        
        //Contadores
        int contador = 0;
        contador = contador +1;
        System.out.println(contador);
        contador = contador +1;
        System.out.println(contador);        
        contador ++;;
        System.out.println(contador);        
        contador ++;
        System.out.println(contador);
        
        
        //Contadores
        int numR =7;
        double resultado;
        
        //Esto seria hacer Casting
        //double numR =7;
        //int resultado;
        //resultado = (int) numR;
        resultado = numR;
        System.out.println(resultado);

        //Castin de cadenas
        String entero = "98";
        int enteroTransformado = Integer.parseInt(entero);
        int resultado9;
        resultado9 = enteroTransformado + 2;
        System.out.println(resultado9);
    }
    }
    

