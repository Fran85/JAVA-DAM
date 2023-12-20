
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fran
 */
public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero = 0;

        System.out.println("Introduce un numero: ");
        numero = teclado.nextInt();

        if (numero < 50) {
            System.out.println("<50");
        } else if (numero == 50) {
            System.out.println("=50");
        } else {
            System.out.println(">50");
        }

    }

}
