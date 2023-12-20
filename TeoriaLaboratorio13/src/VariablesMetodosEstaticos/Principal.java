/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VariablesMetodosEstaticos;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) {
        
        double max =Double.max(3.0, 9.0);
        System.out.println(max);
        
        //metodos y variables estaticas
        //variable global
        //quiero saber cuantos objetos creo de tipo coche
        
        //aqui llamariamos al objeto de la clase Coche
        Coche c = new Coche("1234abcd");
         Coche c1 = new Coche("5678cba");
        
                //aqui llamamos a la clase por que hemos convertido en static el metodo
        //del contador
        System.out.println(Coche.getContador());
        
        //aqui llamariamos al metodo sin tener puesto el static
        //System.out.println(c1.getContador());
    }
    
}
