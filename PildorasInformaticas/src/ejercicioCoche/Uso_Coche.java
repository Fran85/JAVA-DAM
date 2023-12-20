/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioCoche;

/**
 *
 * @author Fran pildoras informaticas
 */
public class Uso_Coche {

    public static void main(String[] args) {

        //Instancio una clase, esto es un ejemplar de la clase coche
        Coche micoche = new Coche();

        micoche.establece_color("amarillo");
        
        
        micoche.configura_asientos("si");
        
        System.out.println(micoche.dime_color());

        System.out.println(micoche.dime_datos_generales());
        
        System.out.println(micoche.dime_asientos());

        // System.out.println("Este coche tiene "+renault.+ " ruedas");
    }

}
