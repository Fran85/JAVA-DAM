/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*
        Creamos dos variables, una para definir el tamaño del array y la otra para
        elejir el ultimo numero de cada uno de los numeros del array        
         */
        int numero2 = 0;
        int numero3 = 0;

        /*
        Aqui pedimos que introduzcan el numero de posiciones que tendra el array
        y para ello le decimos que el numero 2 es el valor que ellos elijan por teclado
         */
        System.out.println("Inserte el numero de posiciones del array: ");
        numero2 = teclado.nextInt();

        /*
        Aqui indicamos que el array numero, tendra de valor el mismo numero que numero2
        que han introducido por teclado
         */
        int numero[] = new int[numero2];

        //Mostramos el numero que han introducido por teclado
        System.out.println("Creado array de: " + numero.length);

        /*
        En el bucle for, le indicamos que i tiene como maximo el numero2 y que sume uno hasta
        el valo0r de numero2
         */
        System.out.println("El array es el siguiente: ");
        for (int i = 0; i < numero2; i++) {

            /*
            Aqui, declaramos que numero, tiene el valor de i y que es igual a tantos numeros
            aleatorios. El valor lo da con Math.random multiplicado por el limite de numeros que queremos
            para el array, para este ejercicio le decimos que puede rellenar X posiciones
            (tomadas por numero2, hasta el valor de 300 numeros
             */
            numero[i] = (int) (Math.random() * (300));
            System.out.println("En la posicion: " + i + " se a asignado el numero: " + numero[i]);
        }
        /*hacemos formula para que segun elijamos x numero saque todos los que elijamos
        Aqui elejimos un numero del 0 al 9 para que busque posteriormente la cantidad de numeros de numero2
        que acaban en ese numero
         */
        System.out.println("Indica el ultimo digito:");
        numero3 = teclado.nextInt();

        /*
        Aqui indicamos que j tiene de longitud el valor del array,numero = numero2
        y que nos elija solo los numeros que acaban en el numero que hemos pedido en numero3
        Para ello divide el valor de la posicion j por 10 para quedarnos con las unidades
        y esto lo haria con todas las posiciones mostrando solo los numeros
        que acaben en ese numero
         */
        for (int j = 0; j < numero.length; j++) {
            if (numero3 == numero[j] % 10) {
                System.out.println("Los numeros que terminan por ese digito son: " + numero[j]);

            }

        }

    }
}
