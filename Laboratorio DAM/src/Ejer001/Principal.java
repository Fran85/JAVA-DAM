/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer001;

/**
 *
 * @author damiansualdea
 */
public class Principal {

    //Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for
    //0 - 5 - 10 -15 - 20 - .... - 100
    public static void main(String[] args) {
        //ejecuta 20 veces
        for (int i = 0; i <= 100; i += 5) {
            System.out.println(i);
        }
//ejecuta 100 veces
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

}
