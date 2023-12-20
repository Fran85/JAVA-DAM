/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composicion1a1;

/**
 *
 * @author Fran
 */
public class Sobre {
    private String color;
    private Galleta galleta;

    public Sobre(String color, Galleta galleta) {
        this.color = color;
        this.galleta = galleta;
    }

    public Sobre(String color) {
        this.color = color;
    }
    

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Galleta getGalleta() {
        return galleta;
    }

    public void setGalleta(Galleta galleta) {
        this.galleta = galleta;
    }
    
    
    
}
