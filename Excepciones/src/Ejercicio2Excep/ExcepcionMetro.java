/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2Excep;

/**
 *
 * @author Fran
 */
public class ExcepcionMetro extends Exception{
    
    ExcepcionMetro(){
        super();
    }
    
    public void ver(){
        System.out.println("El error ha sido por el tamaño");
    }
    
}
