
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fran
 */
public class Ejercicio22 {
        public static void main(String[] args) {
        
        int numero1=1, numero2=1;
        int suma = 0;
        int veces = 3;

        
        Scanner teclado = new Scanner(System.in);
        
            System.out.println("Escribe la cantidad de numero de Fibonnaci a mostrar:  ");
            int vecesUsuario = teclado.nextInt();
        
        System.out.println(numero1 + " " + numero2);
        do{
            suma = numero1 + numero2;
            numero1 = numero2;
            numero2 = suma;
            System.out.println(" " + numero2);
            veces++;
        }
        while (veces <= vecesUsuario);
        
        teclado.close();
        }
    
}
