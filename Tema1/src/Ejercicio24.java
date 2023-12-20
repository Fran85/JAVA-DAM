
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fran
 */
public class Ejercicio24 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        /**
         * Lee caracteres hasta que se introduce
         * un asterisco
         * Despues dice el numero de caracteres
         * introducido
         */
        
        int numeroCar = 0;
        String a;
        
        Scanner teclado = new Scanner(System.in);
        
        do
        {
            numeroCar++;
            System.out.println("Escribe un caracter (*para terminar");
            
            a = teclado.next();
        //}while(a.charAt(0)!='*');{
    }while(!a.equals("*"));
        
        System.out.println("Se ha introducido " + (numeroCar-1) + " caracteres");
        
        teclado.close();
        
    }
    
    
}
