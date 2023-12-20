/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claselaboratorio9;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] numeros = new double[5];
        numeros[0] = 6;
        numeros[1] = 8;
        numeros[2] = 2;
        numeros[3] = 9;
        numeros[4] = 0;

        //para que muestre el contenido se tiene que usar un metodo
        System.out.println(numeros);

        //con este metodo mostramos el contenido del array, para ello tenemos que importar la clase
        //para que muestre los metodos se tiene que poner Array. y nos dira de importar la clase 
        //y de ahi ya saldran los metodos
        System.out.println(Arrays.toString(numeros));

        //metodo para buscar un numero en el arrya
        //ha de estar ordenado con array.sort para que de una busqueda fiable
        //si devuelbe la busqueda un negativo es que no lo encuentra o no existe
        //se alteraria el orden del array y no seria el original
        //para ello mejor clonarlo
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.binarySearch(numeros, 6));

        double[] numeros2 = new double[5];
        numeros2[0] = 6;
        numeros2[1] = 8;
        numeros2[2] = 2;
        numeros2[3] = 9;
        numeros2[4] = 0;

        int a = 7;
        int b = 7;
        System.out.println(a + " " + b);
        System.out.println(a == b);

        double[] numerosCopia = numeros2;
        System.out.println(Arrays.toString(numerosCopia));
        numeros2[0] = 58;
        System.out.println(Arrays.toString(numeros2));
        System.out.println(Arrays.toString(numerosCopia));

        //aqui la comparacion seria true xk se comparan los dos antes de cambiar 
        //el valor de la posicion 0 a 99 que se hace mas abajo
        System.out.println(numeros2 == numerosCopia);
        //salen igual por que estamos referenciado la misma posicion de memoria...
        //para hacer un array nuevo hay que clonar el array con el metodo clone()
        numerosCopia = numeros2.clone();
        numeros2[0] = 99;
        System.out.println(Arrays.toString(numeros2));
        System.out.println(Arrays.toString(numerosCopia));

        /*
        Comparacion de arrays
         */
        //Primera comparacion
        //aqui la comparacion seria false xk se comparan los dos despues de cambiar 
        //el valor de la posicion 0 a 99 siendo distintos los arrays, uno tendria
        // en la posicion 0 el 58 y el otro el 99
        System.out.println(numeros2 == numerosCopia);

        numeros2[0] = 58;
        System.out.println(Arrays.toString(numerosCopia));
        //comparacion 2 se usa el metodo de arrays de equals
        System.out.println(Arrays.equals(numeros2, numerosCopia));

        numeros2[0] = 6;
        //quiero saber si dos arraus son iguales
        //seria mas eficiente con un while
        boolean sonIguales = true;
        //con el for se recorreria todo el array
        if (numeros2.length != numerosCopia.length) {
            sonIguales = false;
        } else {
            for (int i = 0; i < numeros2.length; i++) {
                if (numeros2[i] != numerosCopia[i]) {
                    sonIguales = false;
                }
            }
        }
        System.out.println(sonIguales);

        //con while es
        //Le cambiamos un numero de una posicion
        numeros2[2] = 99;
        if (numeros2.length != numerosCopia.length) {
            sonIguales = false;
        } else {
            int i = 0;
            while (sonIguales && i < numeros2.length) {
                if (numeros2[i] != numerosCopia[i]) {
                    sonIguales = false;
                }
                i++;
            }
            System.out.println(i);
        }
        System.out.println(sonIguales);

        //quiero emilar un toString() de numeros
        System.out.print("[");
        for (int i = 0; i < numeros2.length; i++) {
            if (i == numeros2.length - 1) {
                System.out.println(numeros2[i]);
            } else {
                System.out.print(numeros2[i] + ",");
            }
        }
        System.out.print("}");
        System.out.println("");

        //emular el metodo clonar... numeros2
        double[] numeros3 = new double[numeros2.length];
        for (int i = 0; i < numeros3.length; i++) {
            numeros3[i] = numeros2[i];
        }
        System.out.println(Arrays.toString(numeros3));
        
        //busqueda binaria...partimos de un arry ordenado
        //int posicion o -1 si no existe, partimos de un array ordenado
        Arrays.sort(numeros3);
        int n = 58;
        int posicion = 0;
        for (int i = 0; i<numeros3.length;i++){
            if(numeros3[i]==n){
                posicion = i;
            }
            if(posicion == 0 && i == numeros.length -1)
                posicion = -1;
        }
        System.out.println(posicion);

    }

}
