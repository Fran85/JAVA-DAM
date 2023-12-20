/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claselaboratorio14;

import java.util.ArrayList;

/**
 *
 * @author Fran
 */
public class Empresa {

    private String nombre;
    private static int empleados;
    private ArrayList<JefeProyecto> jefes;
    private ArrayList<Analista> analistas;
    private ArrayList<Programador> programadores;

    public static final int HORAS = 40;

    public Empresa(String nombre, ArrayList<JefeProyecto> jefes, ArrayList<Analista> analistas, ArrayList<Programador> programadores) {
        this.nombre = nombre;
        this.jefes = jefes;
        this.analistas = analistas;
        this.programadores = programadores;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<JefeProyecto> getJefes() {
        return jefes;
    }
    public void setJefes(ArrayList<JefeProyecto> jefes) {
        this.jefes = jefes;
    }
    public ArrayList<Analista> getAnalistas() {
        return analistas;
    }
    public void setAnalistas(ArrayList<Analista> analistas) {
        this.analistas = analistas;
    }
    public ArrayList<Programador> getProgramadores() {
        return programadores;
    }
    public void setProgramadores(ArrayList<Programador> programadores) {
        this.programadores = programadores;
    }
    
    

    public static int getEmpleados() {
        return empleados;
    }
    public static void setEmpleados(int empleados) {
        Empresa.empleados = empleados;
    }
    
    public void anyadirJefe(JefeProyecto jefe){
        jefes.add(jefe);
    }
    public void anyadirAnalista(Analista analista){
        analistas.add(analista);
    }
    public void anyadirProgramador(Programador programador){
        programadores.add(programador);
    }
    
    public void listarJefes(){
        for(JefeProyecto j : jefes){
            j.visualizar();
        }
    }

}
