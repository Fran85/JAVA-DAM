/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composicion1aN;

import java.util.ArrayList;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Galleta>galletas= new ArrayList();
        
        System.out.println(galletas.size());
        
        Galleta g = new Galleta("Vainilla");
        Galleta g2 = new Galleta("Chocolate");
        for(int i = 1; i<=20;i++){
            galletas.add(g);
            galletas.add(g2);
        }
        
        Caja n = new Caja("Campurrianas",galletas );
        
        for(Galleta galle:n.getGalletas()){
            System.out.println(galle.getSabor());
        }
    }
    
}
