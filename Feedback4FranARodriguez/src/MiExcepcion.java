/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fran
 */
public class MiExcepcion extends Exception{
     
    private int codigoError;
     
    public MiExcepcion(int codigoError){
        super();
        this.codigoError=codigoError;
    }
     
    @Override
    public String getMessage(){
         
        String mensaje="";
         
        switch(codigoError){
            case 111:
                mensaje="Error, el numero esta entre 0 y 10";
                break;
            case 222:
                mensaje="Error, el numero esta entre 11 y 20";
                break;
            case 333:
                mensaje="Error, el numero esta entre 21 y 30";
                break;
        }
         
        return mensaje;
         
    }
     
}
