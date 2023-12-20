
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fran
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
            int num = 0;
            
            System.out.println("Introduce un numero: ");
            num = teclado.nextInt();
            String texto = "";
            
            if (num >= 0 && num <= 9)
            {
                switch (num)
                {
                    case 1: texto = "Uno"; break;
                    case 2: texto = "Dos"; break;
                    case 3: texto = "Tres"; break;
                    case 4: texto = "Cuatro"; break;
                    case 5: texto = "Cinco"; break;
                    case 6: texto = "Seis"; break;
                    case 7: texto = "Siete"; break;
                    case 8: texto = "Ocho"; break;
                    case 9: texto = "Nueve"; break;
                }
                System.out.println(texto);
        }
            else
            {
                System.out.println("Numero no valido (0..9");
            }
    teclado.close();
    }
    
}
