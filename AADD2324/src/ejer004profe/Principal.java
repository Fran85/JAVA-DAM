/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer004profe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //programa qie jace una copia de un archivo a otro
        //copia de un fichero de caracteres
        //FileReader FileWrite
        
        
        //buffer de linea a linea---> BufferReader(metodo readLine)
        File fichero= null;
        File copia = null;
        FileReader ficheroEntrada=null;
        FileWriter ficheroSalida=null;
        BufferedReader buffer =null;
        
        fichero = new File("milagroDePetinto");
        fichero.length();
        System.out.println(fichero.length());
        //si podemos saber el tamañao del archivo con 1's y 0's
        ficheroEntrada = new FileReader(fichero);
        
        copia = new File("copiaFichero.txt");
        ficheroSalida = new FileWriter(copia,true);
        
        buffer = new BufferedReader(ficheroEntrada);
        
        //leemos
        String linea = null;
        
        while((linea = buffer.readLine())!=null){
            //System.out.println(linea);
            ficheroSalida.write(linea);
            ficheroSalida.write("\n");
            
        }
        ficheroSalida.close();

        
        
        
    }
}
