/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coche;

/**
 *
 * @author Fran
 */
public class Coche{
    private String marca;
    private String modelo;
    private Double km;
    private String combustible;
    private String color;
    private Double precio;
    
    private static final Double BITCOIN = 43491.59;

    
    public Coche(){
        
    }

    public Coche(String marca, String modelo, Double km, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
        this.precio = precio;
    }
    
    
    public Coche(String marca, String modelo, Double km, String combustible, String color, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
        this.combustible = combustible;
        this.color = color;
        this.precio = precio;
    }
    
    
    //Metodos
    public String devuelveMarca(){
        return marca;
    }
    
    public void ponMarca(String marca){
        this.marca = marca;
    }
    
    public String devuelvevModelo(){
        return modelo;
    }
    
    public void ponModelo(String modelo){
        this.modelo = modelo;
    }
    
    public Double devuelveKm(){
        return km;
    }
    
    public void ponKm(Double km){
        this.km=km;
    }
    
    public String devuelveCombus(){
        return combustible;
    }
    
    public void ponCombus(String combustible){
        this.combustible=combustible;
    }
    
    public String devuelveColor(){
        return color;
    }
    
    public void ponColor(String color){
        this.color=color;
    }
    
    public Double devuelvePrecio(){
        return precio;
    }
    
    public void ponPrecio(Double precio){
        this.precio=precio;
    }
    
    public void pasarItv(){
        precio= precio+60;
    }
    
    public void pagarAveria(Double averia){
        precio= precio + averia;
    }

    public Double getBITCOIN() {
        precio = precio / BITCOIN;
        return precio;
    }
    

    
}
