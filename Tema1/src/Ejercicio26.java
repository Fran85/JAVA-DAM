
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fran
 */
public class Ejercicio26 {
    
    /** * Lee 2 números y una operación 
     * para seleccionar la operacion
     * usaremos un switch
     * aritmética a relizar con ellos. 
     * 
     * 
     */
    
    public static void main(String[] args) {
        
        int numero1 = 0, numero2 = 0;
        String operacion = "";
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Primer numero: ");
        numero1 = teclado.nextInt();
        
        System.out.println("Segundo numero: ");
        numero2 = teclado.nextInt();
        
        System.out.println("Operacion: ( + - / * )");
        operacion = teclado.next();
        
        
        switch (operacion.charAt(0))
               {
            case '+' : System.out.println(numero1 + " + " + numero2 + " = "
            + (numero1+numero2));break;
            case '-' : System.out.println(numero1 + " - " + numero2 + " = "
            + (numero1-numero2));break;
            case '/' : System.out.println(numero1 + " / " + numero2 + " = "
            + (numero1/numero2));break;
            case '*' : System.out.println(numero1 + " * " + numero2 + " = "
            + (numero1*numero2));break;
            default: System.out.println("Operacion desconocida");
        }
        
        teclado.close();
        
    }
    
}
