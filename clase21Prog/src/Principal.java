
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Fran
 */

/*
    NUMERO DE PAGINAS
    NUMERO DE PALABRAS
    CARACTERES SIN ESPACIO
    CARACTERES CON ESPACIOS
    PARRAFOS
    LINEAS

 */
public class Principal {

    public static void main(String[] args) throws IOException {
        //con try with resources nos cierra automaticamente los ficheros
        //no tendriamos que poner .close ni en la creacion del fichero
        //ni en la lectura ni el buffered
        try ( FileWriter fe = new FileWriter("novela.txt")) {
            //con try with resources nos cierra automaticamente los ficheros
            //no tendriamos que poner .close ni en la creacion del fichero
            //ni en la lectura ni el buffered

            fe.write("El Kaiser le habia di dando cuerda");
            fe.write("\n"); //ESTO HACE DE PARRAFO
            fe.write("hasta aquella noche. No habia mas tiempo");
            fe.write("\n"); //ESTO HACE DE PARRAFO
            fe.write(" \n"); //ESTO HACE DE PARRAFO
            fe.write("queria a la chica de la fiesta del viernes, ");
            fe.write("\n"); //ESTO HACE DE PARRAFO
            fe.write("en el piso de la calle Castello");
            fe.write("\n"); //ESTO HACE DE PARRAFO
            fe.write(" \n");//ESTO HACE DE PARRAFO
            fe.write("la sonata del silecio");
            fe.write("\n");//ESTO HACE DE PARRAFO
            fe.write(" \n"); //ESTO HACE DE PARRAFO
            fe.write("Paloma Sanchez Guernica");
            fe.write("\n");//ESTO HACE DE PARRAFO
            fe.write(" \n"); //ESTO HACE DE PARRAFO
        }

        //para almacenar la lectura
        try ( //para leer
                 FileReader flectura = new FileReader("novela.txt"); //para leer la lectura
                //se le indica la variable que tiene la lectura del fichero creado
                  BufferedReader contenido = new BufferedReader(flectura)) {//para almacenar todo el documento

            String linea;
            //numero de lineas
            int contLineas = 0;
            //contar caracteres con espacios
            int acumulador = 0;
            int tamLinea = 0;
            //palabras y parrafos
            int contParrafos = 0;
            //caracteres sin espacios
            String lineaSinEspacios;
            int acumulador2 = 0;
            int contarPalabrasLinea = 0;
            //para leer las lineas creamos un bucle while que vaya leyendo linea a linea
            //para ello le decimos que linea es igual a contenido. readline, que es un metodo para poder leer por lineas
            //este metodo nos lo da bufferedreader
            //le decimos que linea es la linea del contenido mientras no sea null
            //y ya con esto declarado poddemos empezar a trabajar dentro del while
            //
            while ((linea = contenido.readLine()) != null) {

                //saber el numero de lineas , para ello creamos un contador fuera del bucle
                contLineas++;

                //caracteres con espacios, declaramos dos variables enteras una de acumulador y otra del tamaño de la linea
                acumulador += linea.length(); //el acumulador sera igualal tamaño de la linea

                //contar palabras y parrafos, habria que buscar dos cosas, un espacio en blanco,
                //y tamaño es 1, para ello usamos un IF
                if (linea.length() == 1 && linea.charAt(0) == ' ') {
                    contParrafos++;
                }

                //contar caracteres sin espacios,creamos una variable string que nos va a guardar el remplazo de los carateres
                //De linea con el replace, remplaza los espacios por nada.
                lineaSinEspacios = linea.replace(" ", "");
                acumulador2 += lineaSinEspacios.length();

                //si encuentra las palabras "El kaiser" que recorte la linea, se haria con substring
                //cargandonos la primera letra
                //System.out.println(linea);
                System.out.println(linea.substring(1));
                //boolean existe = linea.contains("El Kaiser ");
                //if (existe) {
                 //   System.out.println("El elemento SÍ existe en la lista");
               // } else {
                //    System.out.println("El elemento no existe");
                //}

                //creamos un if para preguntar si empieza por el string que queramos
                //pasandoselo por startsWith, linea.startsWith y despues con un substring
                //eliminamos los 10 primeros caracteres
                //el startsWith me puede servir para buscar al principio de una frase
                if (linea.startsWith("El Kaiser")) {
                    System.out.println(linea.substring(10));
                }

                //para  contar palabras
                for (int i = 0; i < linea.length(); i++) {
                    if (linea.charAt(i) == ' ') {
                        contarPalabrasLinea++;
                    }
                }

            }
            System.out.println("Numero de lineas: " + contLineas);

            System.out.println("Numero de caracteres " + acumulador);

            System.out.println("Numero de parrafos: " + contParrafos);

            System.out.println("Caracteres sin espacios: " + acumulador2);

            System.out.println("Palabras por linea: " + Integer.valueOf(contarPalabrasLinea + 1));

        }
    }

}
