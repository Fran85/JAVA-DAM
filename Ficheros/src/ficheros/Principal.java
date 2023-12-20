/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) throws IOException {
        //con FileWriter

        String fichero = "fichero.txt";
        FileWriter flujoSalida = new FileWriter(fichero, false);

        //flujoSalida.write("Hola a todos");
        //flujoSalida.write(" Que tal estais");
        Scanner teclado = new Scanner(System.in);
        String comentario = teclado.nextLine();

        comentario = comentario.toUpperCase();

        //saber el numero de A´s que tiene el comentario
        int contador = 0;
        for (int i = 0; i < comentario.length(); i++) {
            if (comentario.charAt(i) == 'A') {
                contador++;
            }
        }
        flujoSalida.write(String.valueOf(contador));
        flujoSalida.write(": ");
        
        flujoSalida.write(comentario);

        flujoSalida.close();
    }
}
