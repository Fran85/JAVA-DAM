/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPoo2;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {

        Cafetera deLonghi = new Cafetera();
        Cafetera nessPresso = new Cafetera(1500);
        Cafetera dolceGusto = new Cafetera(1600, 2000);

        
        deLonghi.setNombre("deLonghi");
        nessPresso.setNombre("nessPresso");
        dolceGusto.setNombre("dolceGusto");
        
        deLonghi.mostraContenido();
        nessPresso.mostraContenido();
        dolceGusto.mostraContenido();

        //este metodo llena la cafetera
        deLonghi.llenarCafetera();
        //este metodo ejecuta el sout que hemos contruido en la lcase cafetera
        //no habria que hacer un sout por que hemos creado ese metodo en la otra clase
        deLonghi.mostraContenido();

        nessPresso.servirTaza(600);
        nessPresso.mostraContenido();
        nessPresso.servirTaza(800);
        nessPresso.mostraContenido();
        nessPresso.servirTaza(1000);
        nessPresso.mostraContenido();
        
        dolceGusto.vaciarCafetera();
        dolceGusto.mostraContenido();


    }

}
