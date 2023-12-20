/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FeedUnidad2;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {
        Padron pa1 = new Padron(2022, 130577, 1.8);
        Poblacion p1 = new Poblacion("Comunidad de Madrid", "Madrid", "Parla", pa1);

        p1.mostrarComAut();
        p1.mostrarProvi();
        p1.mostrarNomPo();
        p1.mostrarPadron();
        p1.mostrarPadron2();
        p1.mostrarPadron3();
        
        System.out.println("------------");

    }
}
