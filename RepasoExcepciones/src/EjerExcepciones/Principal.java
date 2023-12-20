/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerExcepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) {
        String nombres []={"Paco","Tamara","Carmen","Kiko","Puca","Lola"};
        
        try{
        int posicion=Integer.parseInt(JOptionPane.showInputDialog("A que posicion deseas acceeder: "));
        JOptionPane.showMessageDialog(null,"El nombre en la posicion "+posicion+" es "+nombres[posicion]);
        
        }
        catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null,"Posicion invalida para recuperar del array");
        }
        
    }
    
}
