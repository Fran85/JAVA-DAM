package ejerfeedback;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Escribir los departamentos en el archivo
        //si no funcionara en netbeans, darle una ruta a un directorio diferente
        try ( ObjectOutputStream depSalida = new ObjectOutputStream(new FileOutputStream("departamentos.dat"))) {
            Departamento d1 = new Departamento(1, "Informatica", "Madrid");
            Departamento d2 = new Departamento(2, "Jefatura de estudios", "Madrid");
            Departamento d3 = new Departamento(27, "Administracion", "Madrid");

            depSalida.writeObject(d1);
            depSalida.writeObject(d2);
            depSalida.writeObject(d3);

            System.out.println("Departamentos almacenados");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leer los departamentos del archivo
        try ( ObjectInputStream depEntrada = new ObjectInputStream(new FileInputStream("departamentos.dat"))) {
            while (true) {
                try {
                    Departamento departamento = (Departamento) depEntrada.readObject();
                    System.out.println(departamento);
                } catch (IOException e) {
                    System.out.println("Fin de archivo");
                    break; // Se alcanzó el final del archivo
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
