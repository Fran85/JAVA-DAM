/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) throws IOException {
        
        String fichero = "fichero.txt";
        
        //True añade al final de la linea y con false sobreescribe lo que hubiera
        FileWriter flujoSalida = new FileWriter(fichero,true);
        
       // flujoSalida.write("Prueba escritura");
       // flujoSalida.write(" Segunda prueba de escritura");
        flujoSalida.write(System.lineSeparator());
        
        Scanner teclado = new Scanner(System.in);
        String comentario = teclado.nextLine();
        
        //convierte en mayusculas
       // comentario = comentario.toUpperCase();
        
        //quiero poner el numero de letras X que tiene el comentario
        int contador = 0;
        for(int i = 0;i<comentario.length();i++){
            if(comentario.charAt(i)=='a'){
                contador++;
            }
        }
        
        flujoSalida.write(String.valueOf(contador));
        
        flujoSalida.write(": ");
        flujoSalida.write(comentario);
        
        
        flujoSalida.close();
        
        
    }
    
    
}
