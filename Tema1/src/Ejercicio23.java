
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fran
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        
        String telefono = "";
        
        System.out.print("Telefono: ");
        Scanner teclado = new Scanner(System.in);
        
        telefono = teclado.next();
        
        if(telefono.charAt(0)=='6' || telefono.charAt(0)=='7')
            System.out.println("Es un numero movil");
        else
            System.out.println("No es numero movil");
            
        teclado.close();
    }
    
}
