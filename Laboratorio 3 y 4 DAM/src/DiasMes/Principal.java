/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DiasMes;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        //numero de dias que tiene un mes

        System.out.println("Introduce el numero del mes");
        int mes = teclado.nextInt();
        int dias;
        int anyo;
        /*Desde un enfoque algorítmico, se consideran las proposiciones o enunciados lógicos siguientes:
            p: Es divisible entre 4
            q: Es divisible entre 100 (¬q entonces significa no divisible entre 100)
            r: Es divisible entre 400
         */
        
        switch (mes) {
            case 1,3,5,7,8,10,12:
                dias = 31;
                break;
            case 2: //preguntar si es bisiesto
                System.out.println("Introduce el año:");
                anyo = teclado.nextInt();
                boolean esD4, esD100, esD400;
                if ((anyo % 4 == 0) && (anyo % 100 != 0) || (anyo % 400 == 0));
                dias = 28;
                dias = 29;
                break;
            case 4,6,9,11:
                dias = 30;
                break;
            default:
                System.out.println("mes no valido");
                dias = -1;
        }
                System.out.println("El mes tiene " +dias+ "dias");
    }

}
