/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionExcepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {
        //FileReader f1 = new FileReader("adios.txt");
        //f1.read();
        
        //se pueden meter varios catch y se ordenas de mas especificas a menos
        //FileWriter f2 = null;
        
        //try with resources(otro tipo de try)automaticamente lo cerraria
        try(FileWriter f2= new FileWriter("Hola");)
        {
            //f2 = new FileWriter("");//Si no hay excepcion continua el programa
            //si lo dejamos sin declarar el nombre del fichero nos saltara una excepcion
            f2.write("1234");
            System.out.println("He escrito una cadena");
            //f2.close();
        } catch (FileNotFoundException e2) {//Si hay excepcion se ejecuta lo que hay en el catch
            System.out.println("Hemos recogido la excepcion de fichero no encontrado");
            e2.printStackTrace();
        }catch(IOException e){
            System.out.println("Hemos recogido la excepcion de entrada salidao");
        }finally{
            System.out.println("Es un bloque que se ejecuta siempre");
            //se usa para cerrar recursos mayoritariamente, aqui irian los close
        }
    }

}
