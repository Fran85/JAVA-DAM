
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Fran
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[100];

        for (int i = 1; i < numeros.length + 1; i++) {
            //el int entre parentesis es para hacer un casting ya que random es tipo double, con decimales
            //math.random * 100 =12.3455 97.765
            //le aplico un math.floor se convierte en 12.0 y 98.0
            //y le hago un casting a (int) y se convierten en 12 y 97(seria como un redondeo)
            //el math.floor redondea hacia abajo
            System.out.println(i);
        }
        System.out.println("-------------------------------------");

        System.out.println("Imprimiendo orden inverso.");
        for (int i = numeros.length ; i >= 0; i--) {
            System.out.println(i);
        }

    }

}
