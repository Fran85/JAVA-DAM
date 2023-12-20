/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author damiansualdea
 */
import java.util.Arrays;
public class Principal {

    public static void main(String[] args) {
        //Arrays, estáticos...
        int[] numeros = new int[20];

        numeros[0] = 1;
        numeros[1] = 6;

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[3]);
        System.out.println(numeros[8]);

        int[] numeros2 = {2, 7, 9, 1, 5, 0, 1};
        System.out.println(numeros2.length);

        System.out.println(numeros2);
        System.out.println(numeros2[0]);
        System.out.println(numeros2[1]);
        System.out.println(numeros2[2]);
        System.out.println(numeros2[3]);
        System.out.println(numeros2[4]);
        System.out.println(numeros2[5]);
        System.out.println(numeros2[6]);
        System.out.println("--------------");
        for (int i = 0; i < numeros2.length; i++) {
            System.out.print(numeros2[i]+" - ");
        }
        System.out.println("");
        System.out.println(Arrays.toString(numeros2));

    }

}
