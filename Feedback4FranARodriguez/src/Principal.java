
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserte un numero: ");
        int n1 = teclado.nextInt();

        try {
 
 
            if (n1 >= 0 && n1 <= 10) {
                throw new MiExcepcion(111);
            } else if (n1 > 10 && n1 <= 20) {
                throw new MiExcepcion(222);
            } else if (n1 > 20 && n1 <= 30) {
                throw new MiExcepcion(333);
            }
 
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        //    e.printStackTrace();
        }// finally {
          //  if (n1 > 31) {
           //     System.out.println("Bien hecho!!!");
          //  } else {
          //      System.out.println("Hemos generado una excepcion!");
                //se usa para cerrar recursos mayoritariamente, aqui irian los close
          //  }

        }

//}
