/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FeedUnidad2;

/**
 *
 * @author Fran
 */
public class Padron{
    private Integer anioPadron;
    private Integer numHabitantes;
    private Double porcenAnioAnt;
    
    public Padron(Integer anioPadron, Integer numHabitantes, Double porcenAnioAnt) {
        this.anioPadron = anioPadron;
        this.numHabitantes = numHabitantes;
        this.porcenAnioAnt = porcenAnioAnt;
    }

    public Integer getAnioPadron() {
        return anioPadron;
    }
    public Integer getNumHabitantes() {
        return numHabitantes;
    }
    public Double getPorcenAnioAnt() {
        return porcenAnioAnt;
    }


    
    
}
