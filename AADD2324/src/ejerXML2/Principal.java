/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerXML2;

import ejerfeedback.Departamento;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) throws ParserConfigurationException, FileNotFoundException, IOException, TransformerConfigurationException, TransformerException {
        //Crear el documento XML
// Leer los departamentos del archivo
        try ( ObjectInputStream depEntrada = new ObjectInputStream(new FileInputStream("departamentos.dat"))) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();

            Element raiz = document.createElement("departamentos");
            document.appendChild(raiz);

            while (true) {
                try {
                    Departamento departamento = (Departamento) depEntrada.readObject();

                    Element departamentoElement = document.createElement("departamento");
                    raiz.appendChild(departamentoElement);

                    Element numero = document.createElement("num");
                    numero.appendChild(document.createTextNode(String.valueOf(departamento.getNum())));
                    departamentoElement.appendChild(numero);

                    Element nombre = document.createElement("nombre");
                    nombre.appendChild(document.createTextNode(departamento.getNombre()));
                    departamentoElement.appendChild(nombre);

                    Element localidad = document.createElement("localidad");
                    localidad.appendChild(document.createTextNode(departamento.getLocalidad()));
                    departamentoElement.appendChild(localidad);
                } catch (IOException | ClassNotFoundException e) {
                    break; // Se alcanzó el final del archivo
                }
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            DOMSource source = new DOMSource(document);

            StreamResult result = new StreamResult(new FileWriter("departamentos.xml"));
            transformer.transform(source, result);

        } catch (IOException | ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }

    }
}
