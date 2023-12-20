/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer004;

/**
 *
 * @author damiansualdea
 */
public class Principal {
    //Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle for
    //320 - 300 - 280 - 260 .... -160... ya
    public static void main(String[] args) {
        for(int i = 320; i>=160 ;i-=20){
         System.out.println(i);
         //break encubierto
         //i=160;
         //break de suspenso
         break;
        }
    }
}
