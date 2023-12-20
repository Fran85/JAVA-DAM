/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio21;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("NUmeros primos entre 2 y 100");
        int prueba = 0;
        int i = 1;
        int contador = 0; //para contar las veces que el resto del numero da 0

        for (int n = 1; n < 101; n++) {
            i = 0;
            contador = 0;
            do {
                i++;
                prueba = n % i;

                if (prueba == 0) {
                    contador++;
                } else {
                    //nada
                }

            } while (i != n);

            if (contador == 2) {
                System.out.print(n + " ");
            } else {
                //nada
            }
        }
    }

}
