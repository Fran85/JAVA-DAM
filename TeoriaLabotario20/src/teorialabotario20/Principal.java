/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teorialabotario20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {
        /*Eliminar duplicados: Escribe un programa que tome una lista de números y elimine los duplicados, devolviendo una lista con cada número único en la lista original. Por ejemplo, si la entrada es [1, 2, 3, 2, 4, 3], la salida debería ser [1, 2, 3, 4].
Unir dos listas: Escribe un programa que tome dos listas y las una en una sola lista. Por ejemplo, si la primera lista es [1, 2, 3] y la segunda es [4, 5, 6], la salida debería ser [1, 2, 3, 4, 5, 6].
Contar ocurrencias: Escribe un programa que tome una lista de palabras y cuente cuántas veces aparece cada palabra en la lista. La salida debe ser una lista de pares (palabra, cantidad de ocurrencias). Por ejemplo, si la entrada es ["hola", "mundo", "hola", "hola", "mundo", "hola"], la salida debería ser [("hola", 4), ("mundo", 2)].
Ordenar lista: Escribe un programa que tome una lista de números y los ordene de menor a mayor. Puedes utilizar cualquier algoritmo de ordenamiento, pero te recomendamos utilizar el método de burbuja. Por ejemplo, si la entrada es [4, 2, 1, 3, 5], la salida debería ser [1, 2, 3, 4, 5].
Eliminar elementos: Escribe un programa que tome una lista de números y elimine los elementos que sean divisibles por 3. Por ejemplo, si la entrada es [1, 2, 3, 4, 5, 6], la salida debería ser [1, 2, 4, 5].
Suma de elementos: Escribe un programa que tome una lista de números y calcule la suma de todos los elementos. Por ejemplo, si la entrada es [1, 2, 3, 4, 5], la salida debería ser 15.
Presione Mayús + Tabulación para navegar por el historial de chat.
         */

        ArrayList<Integer> numeros = new ArrayList();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(2);
        numeros.add(4);
        numeros.add(3);
        System.out.println(numeros.toString());

        //Hacemos trampa
        Collections.sort(numeros);
        System.out.println(numeros.toString());

        Integer anterior = numeros.get(0);
        for(int i = 0;i<numeros.size();i++){
            if(anterior==numeros.get(i)){
                numeros.remove(i);
                anterior=numeros.get(i);
            }
                anterior = numeros.get(i);
        }
        System.out.println(numeros.toString());
    }

}
