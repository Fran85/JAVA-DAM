/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioCoche;

/**
 *
 * @author Fran
 */
public class Coche {
    
    private int ruedas;
    private int largoCm;
    private int anchoCm;
    private int motor;
    private int peso_plataforma;
    
    private String color;
    
    private int peso_total;
    
    private Boolean asientos, climatizador;
    
    
    
    //metodo constructor da un estado inicial a los objetos
    public Coche(){
        ruedas=4;
        largoCm=2000;
        anchoCm=300;
        motor=1600;
        peso_plataforma=500;
    }
    
    public String dime_datos_generales(){//getter
        
        return "La plataforma del vehiculo tiene " + ruedas+ " ruedas" +
                ". Mide "+largoCm/1000+ " metros con un ancho de "+anchoCm+
                 " cm y un peso de plataforma "+peso_plataforma;
    }
    
    public void establece_color(String color_coche){//setter
        
        this.color = color_coche;
        
    }
    
    public String dime_color(){
        return "El color del coche es "+ color;
    }
    
    
    public void configura_asientos(String asientos_cuero){
        
        if(asientos_cuero == "si"){
            this.asientos =true;
        }else{
            this.asientos=false;
        }
    }
    
    public String dime_asientos(){
        if(asientos==true){
            return "El coche tiene asientos de cuero";
        }else{
            return "No lleva asientos de cuero";
        }
    }
}
