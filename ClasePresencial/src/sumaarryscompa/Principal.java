/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumaarryscompa;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) {
           ArrayList <Integer> num1 = new ArrayList();
    num1.add(1);
    num1.add(9);
    num1.add(2);
    num1.add(4);
    num1.add(5);
    num1.add(7);
    num1.add(3);
    num1.add(2);
    num1.add(4);
    System.out.println(num1.toString());
    ArrayList <Integer> num2 = new ArrayList();
    num2.add(9);
    num2.add(5);
    num2.add(1);
    num2.add(5);
    num2.add(1);
    num2.add(9);
    num2.add(1);
    num2.add(3);
    num2.add(2);
    System.out.println(num2.toString());
    ArrayList <Integer> resultado = new ArrayList();

    int teLlevas = 0;
        for (int i = num1.size()-1; i >=0; i--) {
            int suma = num1.get(i)+num2.get(i)+teLlevas;
            if(suma>=10){
                teLlevas=1;
                suma-=10;
            }else{
                teLlevas=0;
            }resultado.add(suma);
        }
        if(teLlevas==1){
         resultado.add(teLlevas);
        }

    Collections.reverse(resultado);
    System.out.println(resultado.toString());
   }
    }
    

