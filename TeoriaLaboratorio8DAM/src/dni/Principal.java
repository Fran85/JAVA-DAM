/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dni;

import java.util.Scanner;

/**
 *
 * @author damiansualdea
 */
public class Principal {
    /*
    Se divide el número entre 23 y el resto se sustituye 
    por una letra que 
    se determina por inspección mediante la siguiente tabla:
    */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el DNI SIN LETRA ");
        int dni = teclado.nextInt();
        
        char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'}; 
        
        int posicion = dni%23;
        
        System.out.println(letra[posicion]);
        
        
    }
}
