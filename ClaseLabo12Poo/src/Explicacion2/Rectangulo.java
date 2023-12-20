/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Explicacion2;

/**
 *
 * @author Fran
 */
public class Rectangulo {
    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    
    public double getLado1() {
        return lado1;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    public double area(){
        return lado1*lado2;
    }
    public double perimetro(){
        return lado1*2+lado2*2;
    }
    
    //este metodo no devuelve nada, solo ejecuta la instruccion
    public void perimetro2(){
        System.out.println( lado1*2+lado2*2);
    }
    
    public void agrandar(double tamano){
        lado1=lado1*tamano;
        lado2*=tamano;
    }
    
    public double cambioMedidaL1(double relacion){
        return this.lado1*relacion;
    }

    
}
