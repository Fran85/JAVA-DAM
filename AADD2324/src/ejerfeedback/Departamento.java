/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerfeedback;

import java.io.Serializable;

/**
 *
 * @author Fran
 */
public class Departamento implements Serializable{

    //atributos
    private int num;
    private String nombre;
    private String localidad;

    public Departamento(int num, String nombre, String localidad) {
        this.num = num;
        this.nombre = nombre;
        this.localidad = localidad;
    }

   /* public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }*/

    @Override
    public String toString() {
        return "Departamento[num=" + num + ", nombre=" + nombre + ", localidad=" +localidad+ "]";
    }

    public Object getNum() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getLocalidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    


    
    
    
}
