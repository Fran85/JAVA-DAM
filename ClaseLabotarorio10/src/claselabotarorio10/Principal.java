/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claselabotarorio10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {

        /*teoria
        es dinamico, no se declaran posiciones
        puede variar durante la ejecucion del programa
        se pueden añadir o quitar elementos        
         */
        //-----------------------------------------------------
        //array de enteros
        ArrayList<Integer> numeros = new ArrayList();
        Scanner teclado = new Scanner(System.in);

        //la clase arraylist hay que mirarla en la apy de java, hay que mirar las clases
        //que hay ahi, se construiria con numeros.(el metodo que queremos)
        //lo unico novedoso es add() y remove()
        System.out.println(numeros);
        //no saca nada por que esta vacio

        System.out.println(numeros + " " + numeros.size());
        //muestra un tamaño de 0 por que esta vacio
        //vamos añadir elementos con el metodo add
        numeros.add(54);
        System.out.println(numeros + " " + numeros.size());
        //sacaria el 54 y un tamaño de 1

        numeros.add(23);
        System.out.println(numeros + " " + numeros.size());
        //sacaria el 54 y el 23 y un tamaño de 2

        //para eliminar un elemento, se puede hacer por posicion o por numero
        //por Object seria el contenido de la posicion e int seria por posicion
        numeros.remove(0);
        System.out.println(numeros + " " + numeros.size());
        numeros.add(54);
        Integer num = 23;
        numeros.remove(num);
        System.out.println(numeros + " " + numeros.size());
        numeros.add(23);
        System.out.println(numeros + " " + numeros.size());
        //añadiria el 87 en la posicion 1 desplazando el 23 a la segunda posicion
        numeros.add(1, 87);
        System.out.println(numeros + " " + numeros.size());

        //todo lo que es igual al concepto de arrays
        //Metodos
        System.out.println("para visualizar un elemento");
        System.out.println(numeros.get(2));
        //posicion que no existe, devuelve el error IndexOut..
        //System.out.println(numeros.get(9));

        System.out.println("Cambiar el valor de un elemento del array");
        numeros.set(1, 157);
        System.out.println(numeros);

        //para recorrer un arraylist con un for
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        System.out.println("-------------------------");
        //con un for each, se declara un objeto de la misma caracteristica de los objetos
        //del que hemos creado, el for each suele ser con objetos
        for (Integer n : numeros) {
            System.out.println(n);
        }
        System.out.println("Esta? " + numeros.contains(23));
        numeros.add(23);
        System.out.println(numeros);
        System.out.println("Posicion " + numeros.indexOf(23));
        numeros.add(58);
        numeros.add(23);
        System.out.println(numeros);
        System.out.println("posicion: " + numeros.lastIndexOf(23));

        //que no existe
        System.out.println("Esta? " + numeros.contains(45));
        System.out.println("posicion: " + numeros.lastIndexOf(45));
        
        
        //primero haremos una copia, con este tendriamos una copia
        ArrayList <Integer> numerosCopia = new ArrayList(numeros);
        System.out.println(numerosCopia);
        
        
        //hay que importar el Collection
        Collections.sort(numerosCopia);
        System.out.println(numerosCopia);
        
        
    }

}
