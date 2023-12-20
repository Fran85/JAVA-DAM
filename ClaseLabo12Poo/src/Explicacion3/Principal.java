/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Explicacion3;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) {
        Libro l = new Libro("Ultimos dias en berlin",345);
        
        System.out.println(l.getPaginaActual());
        l.avanzaPagina();
        System.out.println(l.getPaginaActual());
        
       //declaracion de la sobrecarga estatica,
       //no dejaria utilizar el metodo y da error
       //l.avanzarPagina(200);
       l.avanzarCapitulo();
       System.out.println(l.getPaginaActual());
    }
    
}
