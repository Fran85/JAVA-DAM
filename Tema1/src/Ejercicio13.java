
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fran
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        
        int anio = 0;
        
        Scanner dato = new Scanner(System.in);
        
        System.out.println("Introduce un año: ");
        anio = dato.nextInt();
        
        if ((anio % 4 == 00) && ((anio % 100 != 0) || (anio % 400 == 0)))
            System.out.println("El año es bisiesto");
        else
            System.out.println("El año no es bisiesto");
        
    }
    
}
