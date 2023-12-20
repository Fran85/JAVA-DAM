/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer001;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {
        //Este es nuestro primer programa
        //el tipico HOLA MUNDO

        //solo tenemos salida de informacion
        System.out.println("hola mundo");
        System.out.println("primer laboratorio");

        //para entreda de datos, se tiene que importar la libreria
        //con el scanner
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor introduce el nombre: ");

        String nombre = teclado.nextLine();

        System.out.println("Hola " + nombre);

    }

}
