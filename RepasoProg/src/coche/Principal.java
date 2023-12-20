/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coche;

/**
 *
 * @author Fran
 */
public class Principal extends Coche {
    public static void main(String[] args) {
        
        Coche c1 = new Coche("Renault","Twingo",10.0,"100.L","Rojo",20000.0);
        Coche c2 = new Coche("Seat","Ibiza",35000.0,"80.5L","Verde",40000.0);
        Coche c3 = new Coche();
        Coche c4 = new Coche("Dacia","MT",8000.0,"75.L","Blanco",37000.0);
        CocheHistorico c5 = new CocheHistorico();
        
        c2.ponCombus("75L");
        c2.ponColor("Morado");
        c2.ponKm(1800.000);
        c2.ponPrecio(18000.0);
        
        c3.ponMarca("Mercedes");
        c3.ponModelo("SLK");
        c3.ponKm(5000.0);
        c3.ponCombus("120");
        c3.ponColor("Plata");
        c3.ponPrecio(50000.0);
        
        c3.getBITCOIN();
        c3.pagarAveria(5500.0);
        
        
        c5.ponMarca("Seat");
        c5.ponModelo("127");
        c5.ponKm(150000.0);
        c5.ponCombus("65");
        c5.ponColor("Verde");
        c5.ponPrecio(47000.0);
        c5.setAnio(1947);
        c5.setPaisOrigen("España");

    }
    
}
