/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Explicacion2;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(2, 5);
        Rectangulo r2 = new Rectangulo(3, 7);
        System.out.println(r1.area() + " " + r1.perimetro());
        System.out.println(r2.area() + " " + r2.perimetro());
        
        
        double p = r1.perimetro();
        System.out.println("Funcion: "+p);
        r1.perimetro2();
        
        r2.agrandar(2);
        System.out.println(r2.getLado1()+" "+r2.getLado2());
        
        double piesL1 = r2.cambioMedidaL1(0.7);
        System.out.println("En pies "+piesL1);
        
        double miaL1 = r2.cambioMedidaL1(0.3);
        System.out.println("En pies "+miaL1);
    }

}
