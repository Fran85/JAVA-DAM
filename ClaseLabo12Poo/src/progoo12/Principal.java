/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progoo12;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) {
        
      Coche c =  new Coche("Porche","Cayenne");
      Coche c1 = new Coche("911")  ;
      //c.setMarca("Porche");
      //c.setModelo("Cayenne");
      
        System.out.println(c.getMarca()+ " " +c.getModelo());
        System.out.println(c1.getMarca()+ " " +c1.getModelo());
        
        
    }
    
}
