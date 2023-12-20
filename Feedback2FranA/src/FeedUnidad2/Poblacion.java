/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FeedUnidad2;

/**
 *
 * @author Fran
 */
public class Poblacion {

    private String comunAutonoma;
    private String provincia;
    private String nomPoblacion;
    private Padron padron;

    public Poblacion(String comunAutonoma, String provincia, String nomPoblacion, Padron padron) {
        this.comunAutonoma = comunAutonoma;
        this.provincia = provincia;
        this.nomPoblacion = nomPoblacion;
        this.padron = padron;
    }

    public String getComunAutonoma() {
        return comunAutonoma;
    }
    public String getProvincia() {
        return provincia;
    }
    public String getNomPoblacion() {
        return nomPoblacion;
    }


    public void mostrarComAut() {
        System.out.println("La comunidad autonoma es: " + getComunAutonoma());
    }
    public void mostrarProvi() {
        System.out.println("La provincia es: " + getProvincia());
    }
    public void mostrarNomPo() {
        System.out.println("La poblacion es: " + getNomPoblacion());
    }
    
    public void mostrarPadron() {
        System.out.println("El anyo del padron es: " + padron.getAnioPadron());
    }
    public void mostrarPadron2() {
        System.out.println("El numero de habitantes es: " + padron.getNumHabitantes());
    }
    public void mostrarPadron3() {
        System.out.println("El porcentaje de crecimiento es: " + padron.getPorcenAnioAnt());
    }


}
