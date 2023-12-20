/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composicion1a1;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {

        Galleta g = new Galleta("Oreo", 1.3);
        Sobre s = new Sobre("Azul y negro", g);
         
        System.out.println(s.getColor() + " " + s.getGalleta().getSabor() + " " + s.getGalleta().getPrecio());

        Sobre s2 = new Sobre("Transparente", new Galleta("mantequilla", 0.3));
        System.out.println(s2.getColor() + " " + s2.getGalleta().getSabor() + " " + s2.getGalleta().getPrecio());
        
        Galleta g2 = s2.getGalleta();
        g2.setPrecio(3.0);
        g2.setSabor("Carbon");
        
        System.out.println(s2.getGalleta().getSabor());
        
        
        //Esto es un variable que cogeria el color de sobre2
        String c = s2.getColor();
        //seria transparente por que no enlaza con ningun metodo
        c = "Azul verdoso";
        System.out.println(s2.getColor());
        
        

    }

}
