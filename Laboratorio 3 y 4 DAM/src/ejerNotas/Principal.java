/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerNotas;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {

        //ENTRADA DE DATOS
        Scanner teclado = new Scanner(System.in);
        double nota = teclado.nextDouble();
        String salida = "";

        //ALGORITMO-->1º A PENSAR
        //comparar la nota
        //operadores de comparacion < > <= >= != ==
        //operadores logicos ! && ||
        if (nota < 0) {
            //System.out.println("Dato no valido");

        } else // nota < 0
        if (nota < 5) {
            //System.out.println("Suspenso");
            salida = "Suspenso";
        } else //nota >= 5 esto seria el falso
        if (nota < 6) {
            //System.out.println("Suficiente");
            salida = "Suficiente";
        } else //nota >= 6  .... nota>=5
        if (nota < 7) {
            // System.out.println("Bien");
            salida = "Bien";
        } else //nota>=7
        if (nota < 9) {
            // System.out.println("Notable");
            salida = "Notable";
        } else //nota >= 9
        if (nota < 10) {
            // System.out.println("Sobresaliente");
            salida = "Sobresaliente";
        } else //nota >= 10
        if (nota == 10) {
            // System.out.println("Matricula de honor");
            salida = "Matricula de honor";
        } else { //nota > 10
            // System.out.println("Nota no valida");
            salida = "Nota no valida";
        }

        //SALIDA DE DATOS
        System.out.println(salida);

        //! && || operadores logicos
        // && ---> Y ---> AND
        //se puede juntar con 
        //true && true ---------->>true
        //true && false---------->>false
        //false && true---------->>false
        //false && false---------->>false
        //|| --> O --> OR
        //true || true ---------->>true
        //true || false---------->>true
        //false || true---------->>true
        //false || false---------->>false
        //si se pone un rango siempre un &&
        //con rangos trabajar con ifs independientes
        
        if ((nota >= 0) && (nota < 5)) {
            System.out.println("Suspenso");
        } else if ((nota >= 5) && (nota < 6)) {
            System.out.println("Suficiente");
        } else if ((nota >= 6) && (nota < 7)) {
            System.out.println("Bien");
        } else if ((nota >= 7) && (nota < 9)) {
            System.out.println("Notable");
        } else if ((nota >= 9) && (nota < 10)) {
            System.out.println("Sobresaliente");
        } else if (nota == 10) {
            System.out.println("Matricula de honor");
        } else //todo lo que no hemos definido dentro de los rangos
        if (nota < 0) {
            System.out.println("Nota no valida por abajo");
        } else {
            System.out.println("Nota no valida por arriba");
        }

        //switch para menus
        // tienen que ser siempre == o != (distinto y lo gestiona con el default
        //solo funciona con numeros enteros
        
        int nota2 = teclado.nextInt();
        switch (nota2) {
            case 0:
                System.out.println("Suspenso");
                break;
            case 1:
                System.out.println("Suspenso");
                break;
            case 2:
                System.out.println("Suspenso");
                break;
            case 3:
                System.out.println("Suspenso");
                break;
            case 4:
                System.out.println("Suspenso");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
                System.out.println("Bien");
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
            default:
                if (nota2 < 0) {
                    System.out.println("Nota no valida por abajo");
                } else {
                    System.out.println("Nota no valida por arriba");
                }
        }

    }

}
