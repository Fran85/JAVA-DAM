/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPoo2;

/**
 *
 * @author Fran
 */
public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

        
    public Cafetera() {
        capacidadMaxima = 1000;
        cantidadActual = 0;
    }
    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }
    public Cafetera(int capacidadMaxima, int cantidadActual) {

        if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;

        } else {

            this.cantidadActual = cantidadActual;
        }
        this.capacidadMaxima = capacidadMaxima;
    }

    public void llenarCafetera(){
        cantidadActual=capacidadMaxima;
    }
    public void servirTaza(int centilitros){
        if(cantidadActual < centilitros){
            cantidadActual = 0;
        }else{
            cantidadActual = cantidadActual - centilitros;
        }
    }
    
    public void vaciarCafetera(){
        cantidadActual=0;
    }
    
    public void mostraContenido(){
        System.out.println(nombre+ " le queda : "+ cantidadActual+ " de cafe");
    }
    
}
