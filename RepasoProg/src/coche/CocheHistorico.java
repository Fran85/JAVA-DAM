/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coche;

/**
 *
 * @author Fran
 */
public class CocheHistorico extends Coche {
    
    private Integer anio;
    private String paisOrigen;

    public CocheHistorico() {
    }

    public CocheHistorico(Integer anio, String paisOrigen, String marca, String modelo, Double km, String combustible, String color, Double precio) {
        super(marca, modelo, km, combustible, color, precio);
        this.anio=anio;
        this.paisOrigen = paisOrigen;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    
    
    
    
}
