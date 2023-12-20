/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unirListas;

import java.util.ArrayList;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList <Integer> n1 = new ArrayList();
                ArrayList <Integer> n2 = new ArrayList();
                
       n1.add(1);
       n1.add(2);
       n1.add(3);
       
       n2.add(4);
       n2.add(5);
       n2.add(6);

       
       ArrayList <Integer> union = new ArrayList();
       
       
       for(Integer n:n1){
           union.add(n);
       }
        System.out.println(union.toString());
        int cont = 0;
        for(int i = 1;i<=(n1.size()+n2.size());i+=2){
            union.add(1,n2.get(cont));
            cont++;
        }
        System.out.println(union.toString());
       
    }
    
}
