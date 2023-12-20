/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DiasSemana;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        //ASIGANCIONES

        double n1 = 90;
        double n2;

        n2 = n1;
        System.out.println(n2);

        n2 = n2 * 2;
        System.out.println(n2);

        n2 /= 2; //seria como division y ahorramos codigo
        System.out.println(n2);

        //elusuario introduce un numero del 1 al 7 y se le dice el dia de la semana
        //se hara con un switch
        System.out.println("Introduce el numero de la semana");
        int dia = teclado.nextInt();
        String nomDia;
        switch (dia) {
            case 1:
                nomDia = "Lunes";
                break;
            case 2:
                nomDia = "Martes";
                break;
            case 3:
                nomDia = "Mierco,es";
                break;
            case 4:
                nomDia = "Jueves";
                break;
            case 5:
                nomDia = "Viernes";
                break;
            case 6:
                nomDia = "Sacado";
                break;
            case 7:
                nomDia = "Domingo";
                break;
            default:
                nomDia="Dia no valido";

        }
        System.out.println("El dia es... " +nomDia);
        
        
    }

}
