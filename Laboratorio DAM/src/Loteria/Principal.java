/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loteria;

/**
 *
 * @author damiansualdea
 */
public class Principal {

    /*
    Jugar la once diaria....
    5 números... 78456 - 12489 - 325 - 8 - 99999
    Tú compras un boleto: 84568 (2€)
    Cada día hay un sorteo: distinto cada día: 78542
    
    ¿Cómo ganas?: compra = sorteo
    ¿Cuándo....?: días
     */
    public static void main(String[] args) {
        int boleto1, boleto2, boleto3, boleto4, boleto5;
        //Math.random() * 99999 +1
        int sorteo;
        double n;
        int dias = 0;

        do {
            //cada día juego un número diferente
            n = Math.floor(Math.random() * 99999 + 1);
            boleto1 = (int) n;

            n = Math.floor(Math.random() * 99999 + 1);
            boleto2 = (int) n;

            n = Math.floor(Math.random() * 99999 + 1);
            boleto3 = (int) n;

            n = Math.floor(Math.random() * 99999 + 1);
            boleto4 = (int) n;

            n = Math.floor(Math.random() * 99999 + 1);
            boleto5 = (int) n;

            //cada día hay un sorteo
            n = Math.floor(Math.random() * 99999 + 1);
            sorteo = (int) n;
            dias++;

        } while (boleto1 != sorteo && boleto2 != sorteo && boleto3 != sorteo && boleto4 != sorteo && boleto5 != sorteo);
        // Me ha tocado
        System.out.println("Número de sorteo: " + sorteo);
        System.out.println("Me ha tocadoooooo!!!!");
        System.out.println("He tardado: " + dias + " dias");

        int años = dias / 365;
        System.out.println("Años: " + años);

        int meses = (dias % 365) / 30;
        System.out.println("Meses: " + meses);

        int diasF = (dias % 365) % 30;
        System.out.println("Días: " + diasF);
        
        System.out.println("Jugamos 1 al año: "+dias);

        System.out.println("Te has gastado: " + dias * 20*5);

        /*
        578 / 365
        213     1
        213 / 30
         3    7   
         */
    }

}
