/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composicion1aN;

import java.util.ArrayList;

/**
 *
 * @author Fran
 */
public class Caja {
    private String nombre;
    
    ArrayList<Galleta> galletas;

    public Caja(String nombre, ArrayList<Galleta> galletas) {
        this.nombre = nombre;
        this.galletas = galletas;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Galleta> getGalletas() {
        return galletas;
    }
    public void setGalletas(ArrayList<Galleta> galletas) {
        this.galletas = galletas;
    }
    
    
}
