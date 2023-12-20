/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase5labotario5;

/**
 *
 * @author Fran
 */
public class Principal {
    public static void main(String[] args) {
        
        
        //WHILE
        boolean condicion = true;
        
        
        if(condicion){
            System.out.println("IF: Verdadera");
        }else{
            System.out.println("IF: Falsa");
        }
        
        
        //1º inicializamos siempre la variable que depende de la condicion
        
        condicion = true;
        while (condicion){
            //ejecuta instrucciones
            //siempre que sean verdaderas
            
          System.out.println("WHILE: Verdadera");  
        //tocamos la variable que depende de la condicion
        condicion = false;
        }//cuando sea falsa la condicion rompo el bucle
        System.out.println("WHILE: Falsa");
        
        
        condicion = true;
        do{
            System.out.println("DO WHILE: condicino verdadera");
        }while(condicion);
        System.out.println("DO WHILE: condicion falsa");
        
        
        //diferencia while y do while
        //do while ejecuta minimo una vez: 1 -N
        //while puede ejecutarse minimo 0 veces: 0 - N
        
        
        
        for(int i =0;;){
            
            
        }
    }
    
}
