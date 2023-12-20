/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumaArrays;

import java.util.ArrayList;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {
        ArrayList<Integer> cadena1 = new ArrayList();
        ArrayList<Integer> cadena2 = new ArrayList();
        ArrayList<Integer> cadena3 = new ArrayList();

        cadena1.add(1);
        cadena1.add(2);
        cadena1.add(3);
        cadena1.add(4);
        cadena1.add(5);
        cadena1.add(6);

        cadena2.add(2);
        cadena2.add(3);
        cadena2.add(1);
        cadena2.add(5);
        cadena2.add(2);
        cadena2.add(1);
        
        int contador=0;
        
        for (int i=0;i<cadena1.size();i++){
            int resultado =cadena1.get(i)+cadena2.get(i)+contador;
            if(resultado>9){
                String resulString = Integer.toString(resultado);
                resulString = resulString.replaceFirst("1", resulString);
                int resulInt1 = Integer.parseInt(resulString);
                
                cadena3.add(i, resulInt1);
                cadena3.add(i+1, 1);
                contador++;
            }else{
                cadena3.add(i, resultado);
                contador=0;
            }
        }
        System.out.println(cadena1);
        System.out.println(cadena2);
        System.out.println(cadena3);

    }

}
