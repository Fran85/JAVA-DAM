/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claselaboratorio14;

/**
 *
 * @author Fran
 */
public class JefeProyecto {

    private String nombre;
    private int numProyectos;
    private int horasExtra;
    private static final double PRECIOHORA=20.0;
    
    private static final int HORAS = 40;//constante

    public JefeProyecto(String nombre, int numProyectos, int horasExtra) {
        this.nombre = nombre;
        this.numProyectos = numProyectos;
        this.horasExtra = horasExtra;
        Empresa.setEmpleados(Empresa.getEmpleados()+1);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumProyectos() {
        return numProyectos;
    }
    public void setNumProyectos(int numProyectos) {
        this.numProyectos = numProyectos;
    }
    public int getHorasExtra() {
        return horasExtra;
    }
    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }
    
    public double calcularSueldo(){
        return Empresa.HORAS*4*PRECIOHORA + 300*numProyectos + horasExtra*2*PRECIOHORA;//calculo de sueldo
    }
    
    public void visualizar(){
        System.out.println("Jefe de proyecto");
        System.out.println("Nombre: "+nombre);
        System.out.println("Numero de proyectos: "+numProyectos);
        System.out.println("Horas extra: "+horasExtra);
        System.out.println("Sueldo: "+calcularSueldo());
        System.out.println("--------------------------");
    }
}
