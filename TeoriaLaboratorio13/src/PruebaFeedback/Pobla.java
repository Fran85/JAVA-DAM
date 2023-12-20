/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PruebaFeedback;

/**
 *
 * @author Fran
 */
public class Pobla {

    private String comunAutonoma;
    private String provincia;
    private String nomPoblacion;

    public Pobla(String comunAutonoma, String provincia, String nomPoblacion) {
        this.comunAutonoma = comunAutonoma;
        this.provincia = provincia;
        this.nomPoblacion = nomPoblacion;
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
    
    

}
