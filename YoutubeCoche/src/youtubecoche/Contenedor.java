/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package youtubecoche;

/**
 *
 * @author Fran
 */
public abstract class Contenedor {
    private int capacidad;
    private int contenido;

    public Contenedor() {
    }

    public Contenedor(int capacidad, int contenido) {
        this.capacidad = capacidad;
        this.contenido = contenido;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }
       
    
    
}
