/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioLoteria;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {
        //Jugar la once diaria
        //5 numeros
        //tu compras un boleto: 84568 (2€)
        //cada dia hay un sorteo: distinto cada dia: aparece otro numero
        //¿Como ganas?cuando la compra sea igual al sorteo
        //¿Cuando....?dias, cada intento es un dia

        int boleto = 84568;

        //math.random() genera un numero aleatorio * 99999+1
        //el ramdon necesita un double
        int sorteo;
        double n;
        int dias = 0;
        do {
            //cada dia juego un numero random
            //cada dia hay un sorteo
            n = Math.floor(Math.random() * 99999 + 1);
            sorteo = (int) n;
          //  n = Math.floor(Math.random()*99999+1);
            //hacemos un casting
           // boleto = (int) n;
            dias++;
            System.out.println(n);

            //se hace un while parra saber cuantas veces son necesarias para que nos toque
        } while (boleto != sorteo);
        System.out.println("Numero sorteo: " + sorteo);
        System.out.println("Me ha tocado!");
        System.out.println("He tardado: " + dias + "dias");

        int años = dias / 365;
        System.out.println("Años: " + años);

        int meses = (dias % 365) / 30;
        System.out.println("Meses: " + meses);

        int diasF = (dias % 365) % 30;
        System.out.println("Dias: " + diasF);

        System.out.println("Te has gastado: " + dias * 2);

    }

}
