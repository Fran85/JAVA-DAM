package progoo12;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fran
 */
public class Coche {
    
    //Ejercicio con clase y objetos constructores--Coches
    
    
    //Atributos
    private String marca;
    private String modelo;
    
    //Constructores
      public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }  
      
      //sobrecarga de contructor coche
      public Coche(String modelo){
          marca = "Proche";
          this.modelo = modelo;
      }
      public Coche(){
          
      }
            
    //Metodos--getter y setters - propios

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    
    
            
}
