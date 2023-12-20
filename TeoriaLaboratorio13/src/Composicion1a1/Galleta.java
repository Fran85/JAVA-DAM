/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composicion1a1;

/**
 *
 * @author Fran
 */
public class Galleta {
    private String sabor;
    private Double precio;

    public Galleta(String sabor, Double precio) {
        this.sabor = sabor;
        this.precio = precio;
    }

    public String getSabor() {
        return sabor;
    }
    public Double getPrecio() {
        return precio;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    
    
}
