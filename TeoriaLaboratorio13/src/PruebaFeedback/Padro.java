/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PruebaFeedback;

/**
 *
 * @author Fran
 */
public class Padro extends Pobla{
    
    private Integer anioPadron;
    private Integer numHabitantes;
    private Double porcenAnioAnt;
    
    
    //Constructor
    public Padro(String comunAutonoma, String provincia, String nomPoblacion, Integer anioPadron, Integer numHabitantes, Double porcenAnioAnt){
        super(comunAutonoma,provincia,nomPoblacion);
        this.anioPadron = anioPadron;
        this.numHabitantes = numHabitantes;
        this.porcenAnioAnt = porcenAnioAnt;
    }
    
    public void mostrarDatos(){
        System.out.println("La comunidad autonoma es: "+getComunAutonoma());
        System.out.println("La provincia es: "+getProvincia());
        System.out.println("La poblacion es: "+getNomPoblacion());
        
        System.out.println("El año del padron es: "+anioPadron);
        System.out.println("El numero de habitantes es: "+numHabitantes);
        System.out.println("El porcentaje de crecimiento es: "+porcenAnioAnt);
        
    }

}
