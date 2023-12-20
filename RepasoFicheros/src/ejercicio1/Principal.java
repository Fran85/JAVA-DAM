/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) throws IOException {

        FileWriter f1 = null;

        //Programa/Algoritmo
        try {
            f1 = new FileWriter("numNaturales.txt");
            
            
            for(int i = 0; i<101;i++){
                f1.write(i + " ");
            }
            System.out.println("Fichero escrito correctamente");
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                f1.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

}
