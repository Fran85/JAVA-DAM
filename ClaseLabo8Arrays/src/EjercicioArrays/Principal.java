/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioArrays;

/**
 *
 * @author Fran
 */
import java.util.Arrays;
public class Principal {

    public static void main(String[] args) {

        //Arrays, estaticos y dinamicos
        //la declaracion es [], con eso se convierte en un array, seria un conjunto
        int[] numeros = new int[20]; //este es un array estatico, sus posiciones no seran mas de 20

        numeros[0] = 1;
        numeros[1] = 6;

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[3]);
        System.out.println(numeros[19]);

        int[] numeros2 = {2, 7, 9, 1, 5, 0, 1};
        System.out.println(numeros2.length);

        System.out.println(numeros2);
        System.out.println(numeros[0]);//esto se repetiria tantas veces como posiciones tiene el array
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);
        System.out.println(numeros[5]);
        System.out.println(numeros[6]);
        
        //mas comodo en un bucle for si sabe la longitud, asi se podria visualizar todo el array
        //ESTO ES LO IMPORTANTE
        for(int i = 0; i < numeros2.length; i++){
            System.out.println(numeros2[i]);
        }
        
        
        System.out.println(Arrays.toString(numeros2));
        
        
        
                                                        
    }
}
