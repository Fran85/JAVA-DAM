/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer003;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {
        ArrayList<String> cadenas = new ArrayList();
        //Recorrer todo el arraylist
        //recojo la palabra "Hola"
        //con Hola creo 

        cadenas.add("hola");
        cadenas.add("hola");
        cadenas.add("mundo");
        cadenas.add("hola");
        cadenas.add("mundo");
        cadenas.add("hola");

        System.out.println(cadenas.toString());
        Collections.sort(cadenas);
        System.out.println(cadenas.toString());

        ArrayList<String> cadenaFinal = new ArrayList();
        String anterior = cadenas.get(0);
        int cont = 1;
        for (int i = 1; i < cadenas.size(); i++) {
            if (anterior.equalsIgnoreCase(cadenas.get(i))) {
                cont++;
            } else {
                cadenaFinal.add(anterior);
                cadenaFinal.add(String.valueOf(cont));
                System.out.println(anterior + " " + cont);
                cont = 1;
            }
            //System.out.println(anterior + cont);
            anterior = cadenas.get(i);
        }
        cadenaFinal.add(anterior);
        cadenaFinal.add(String.valueOf(cont));
        System.out.println(cadenaFinal.toString());
        //System.out.println(anterior + " " + cont);

    }

}
