/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claselaboratorio14;

/**
 *
 * @author Fran
 */
public class Analista {

    private String nombre;
    private int antiguedad;
    private int horasExtra;
    private static final double PRECIOHORA = 15.0;

    public Analista(String nombre, int antiguedad, int horasExtra) {
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        this.horasExtra = horasExtra;
        Empresa.setEmpleados(Empresa.getEmpleados()+1);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double calcularSueldo() {
        return Empresa.HORAS * 4 * PRECIOHORA + antiguedad + horasExtra * 2 * PRECIOHORA;//calculo de sueldo
    }

    public void visualizar() {
        System.out.println("Analista");
        System.out.println("Nombre: " + nombre);
        System.out.println("Antiguedad: " + antiguedad);
        System.out.println("Horas extra: " + horasExtra);
        System.out.println("Sueldo: " + calcularSueldo());
        System.out.println("--------------------------");
    }

}
