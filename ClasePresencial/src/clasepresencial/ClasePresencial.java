/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasepresencial;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class ClasePresencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> nombreArray = new ArrayList<String>();
        ArrayList<Double> precioArray = new ArrayList<Double>();
        ArrayList<Integer> stockArray = new ArrayList<Integer>();
        System.out.println("Ingresa la cantidad de parametros que quieras cargar: ");
        int n = teclado.nextInt();
        //System.out.println(n);

        //PARA RELLENAR DINAMICAMENTE UN ARRA
        for (int i = 0; i < n; i++) {
            System.out.println("Introduce los productos: ");
            String posic = teclado.next();
            // int posic = teclado.nextInt(); //seria para numeros enteros

            nombreArray.add(posic);
        }
        // for (int j = 0; j < nombreArray.size(); j++) {
        //     System.out.println(nombreArray.get(j));
        // }
        //  for (int i = 0; i < n; i++) {

        //     System.out.println("Introduce el precio de cada producto: ");
        //     Double preci = teclado.nextDouble();
        //Int posic = teclado.nextInt() seria para numeros enteros
        //     precioArray.add(preci);
        //  }
        for (int i = 0; i < n; i++) {
            System.out.println("Introduce el stock: ");
            Integer stock = teclado.nextInt();
            //Int posic = teclado.nextInt() seria para numeros enteros
            stockArray.add(stock);
        }
        for (int k = 0; k < n; k++) {
            System.out.println(nombreArray.get(k));
            // System.out.println(precioArray.get(k) + " - ");
            System.out.println(stockArray.get(k));
        }

        //SI VENDIERAN TODO
        Double sum = 0.00;
        for (int i = 0; i < n; i++) {
            sum += precioArray.get(i);
        }
        System.out.println("Total: ");
        //con string.format("%.2f" , +la variable double) acorto los decimales
        System.out.println(String.format("%.2f", sum));

        //mostrar productos con stock menos a 250
        for (int k = 0; k < n; k++) {
            if (stockArray.get(k) < 250) {
                System.out.println("--STOCK FALTANTE--");
                System.out.println(nombreArray.get(k));
                System.out.println(stockArray.get(k));
            } else {
                System.out.println("Stock mayor a 250u");
            }
        }

        double calculoPorcentaje;
        for (int k = 0; k < precioArray.size(); k++) {
            ArrayList<Double> prereviArray = new ArrayList<>(precioArray);
            double porcentaje = precioArray.get(k) * 0.10;
            prereviArray.add(porcentaje);

            System.out.println("Precios nuevos: ");
            System.out.println(prereviArray.get(k));
        }

        //nombreArray.add("Lapiz");
        //nombreArray.add("Boligrafo");
        //nombreArray.add("Sacapuntas");
        //nombreArray.add("Borrador");
        // nombreArray.add("Tiza");
        // for (int i = 0;i<nombreArray.size();i++){
        //    System.out.println(nombreArray.get(i));;
        //}
        //precioArray.add(1.95);
    }

}
