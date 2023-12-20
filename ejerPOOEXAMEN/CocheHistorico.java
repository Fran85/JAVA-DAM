/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerPOOEXAMEN;

public class CocheHistorico extends Coche {

    //atributos 
    private double anos;
    private String paisOrigen;

    //constructores
    public CocheHistorico(double anos, String paisOrigen, String marca, String modelo,
            String combustible, String color, double precio, double km) {

        super(marca, modelo, km, precio, color, combustible);
        this.anos = anos;
        this.paisOrigen = paisOrigen;
    }

    public CocheHistorico() {
        super();

    }

    /*public CocheHistorico(double anos, String paisOrigen) {
        this.anos = anos;
        this.paisOrigen = paisOrigen;

    }*/

    //metodos 
    public double devuelveAnos() {

        return anos;
    }

    public void ponAnos(double ano) {
        anos = ano;
    }

    public void ponPais(String paisOrigen) {
        this.paisOrigen = paisOrigen;

    }

    public String devuelvePais() {
        return paisOrigen;
    }

}
