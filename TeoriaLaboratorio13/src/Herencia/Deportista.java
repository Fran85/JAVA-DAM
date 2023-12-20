/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Fran
 */
public class Deportista extends Persona{    
    private String deporte;

    public Deportista(String deporte, String nombre) {
        super(nombre);
        this.deporte = deporte;
    }


    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    
    //sobrecarga dinamica
    @Override
    public void andar(){
        
        System.out.println("Estoy andando a 20km/h");
        //super.andar();
    }
    
}
