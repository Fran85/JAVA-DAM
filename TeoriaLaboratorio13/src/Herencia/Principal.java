/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) {
        //herencia
        Persona p = new Persona("Paquito");
        Deportista d = new Deportista("Baloncesto","Usain");
        System.out.println(d.getNombre()+" "+d.getDeporte());
        
        System.out.println(p.getNombre());
        p.andar();
        System.out.println(d.getNombre());
        d.andar();
    }
    
}
