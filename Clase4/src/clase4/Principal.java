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
public class Principal {

    public static void main(String[] args) {

        //CONDICIONALES solo puede ser de dos formas
        //VERDADERO O FALSO
        //< > <= >= != == OPERADORES DE COMPARACION
        //&& || ! OPERADORES LOGICOS
        if (6 == 6) {
            System.out.println("Entrando en 6 == 3");
        }
        System.out.println("Saliendo");

        System.out.println("----------------");

        if (6 < 3) {
            System.out.println("Entra Verdadero");
        } else {
            System.out.println("Entra falso");
        }

        if (6 > 3) {
            System.out.println("Si es correcto");
        } else {//<=
            System.out.println("Entrando");
        }

        //METEMOS LOS DATOS
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero, vamos a decir si es mayor que 5: ");
        //int num = teclado.nextInt();
        int num = 5;

        if (num > 5) {
            System.out.println("Es mayor que 5");
        } else if (num == 5) {
            System.out.println("Es igual que 5");
        } else {
            System.out.println("Es menor que 5");
        }//SE EJECUTA UNA VEZ

        if (num > 5) {
            System.out.println("Es mayor que 5");
        }
        if (num < 5) {
            System.out.println("Es menor que 5");
        }
        if (num == 5) {
            System.out.println("Es igual que 5");
        }//SE EJECUTA UTRES VECES

        //SWITCH caso concreto del if
        // if condicion == 2
        //menus con switch siempre
        
        System.out.println("Introduce un numero");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 3: //opcion ==3
                System.out.println("El 3");
                break;
            case 4://opcion ==4
                System.out.println("El 4");
                break;
            case 5://opcion ==5
                System.out.println("El 5");
                break;
            case 6://opcion ==6
                System.out.println("El 6");
                break;
            default: // opcion !=3 opcion !=5 opcion!=6
                System.out.println("no esta implementado");
        }

    }

}
