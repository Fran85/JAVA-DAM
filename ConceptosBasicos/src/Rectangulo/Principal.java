/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rectangulo;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo(5, 6.0);
        System.out.println(r1.area());
        System.out.println(r1.perimetro());

        Rectangulo r2 = new Rectangulo(2, 7);
        System.out.println(r2.area() + " - " + r2.perimetro());

        //con get y set el primero te muestra el contenido y el set te lo modifica
        System.out.println(r2.getLado1() + " " + r2.getLado2());
        r1.setLado1(78);
        r1.setLado2(1);

        System.out.println(r1.area());
        System.out.println(r1.perimetro());

    }

}
