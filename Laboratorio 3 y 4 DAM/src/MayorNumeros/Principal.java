/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MayorNumeros;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {
        //cual es el numero mayor de 2 numeros
        //introducido por teclado

        //ENTRADA DE DATOS
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        double n1 = teclado.nextDouble();

        System.out.println("Introduce otro numero ");
        double n2 = teclado.nextDouble();

        //ALGORITMO
        Double mayor = 0.0;
        if (n1 >= n2) {
            mayor = n1;
        } else //n1<= n2
        if (n2 > n1) {
            mayor = n2;
        } else //si son iguales valen los dos
        //SALIDA DE DATOS
        {
            System.out.println("El mayor es: " + mayor);
        }

        //cual es el numero mayor de 3 numeros
        //introducido por teclado
        System.out.println("Introduce otro numero: ");
        double n3 = teclado.nextDouble();

        mayor = 0.0;
        //hay que imaginarse que gane el primero y el segundo
        //faltaria que el 3 fuera mayor que el primero y segundo
        if (n1 >= n2) {
            if (n1 >= n3) {
                mayor = n1;
            } else {
                mayor = n3;
            }
        } else //n1 <=n2
        if (n2 >= n3) {
            mayor = n2;
        } else {
            mayor = n3;
        }
        //SALIDA
        System.out.println("El mayor es: " + mayor);

        //CON OPERADORES LOGICOS
        if ((n1 >= n2) && (n1 >= n3)) {
            mayor = n1;
        } else if ((n2 >= n3) && (n2 >= n1)) {
            mayor = n2;
        } else {
            mayor = n3;
        }
        System.out.println("El mayor es: " + mayor);
        //cual es el numero mayor de 4 numeros
        //introducido por teclado

        System.out.println("4.Introduce otro numero: ");
        double n4 = teclado.nextDouble();

        if ((n1 >= n2) && (n1 >= n3) && (n1 >= n4)) {
            mayor = n1;
        } else if ((n2 >= n1) && (n2 >= n3) && (n2 >= n4)) {
            mayor = n2;
        } else if ((n3 >= n1) && (n3 >= n2) && (n3 >= n4)) {
            mayor = n3;
        } else {
            mayor = n4;
        }
        //salida
        System.out.println("El mayor es: " + mayor);
    }

}
