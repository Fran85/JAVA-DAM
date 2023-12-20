/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerXML;

import java.io.File;
import java.io.IOException;
//import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        //PREGUNTA DE EXAMEN - DARA CODIGO UNCOMPLETO Y QUE LO TERMINEMOS NOSOTROS
        //Item importante, getElementsByTagName - mejor la de Damian, que es este
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        //Crear el objeto Document con el archivo XML
        Document document = builder.parse(new File("Categoria_camaras_web.xml"));
        System.out.println("El fichero existe");

        //Siempre despues se tiene que validar el XML
        document.getDocumentElement().normalize();
        System.out.println("El fichero esta normalizado");

        //Empezamos a extraer el nodo raiz (camaras_web) del documento XML
        //COjemos el principal de nodo raiz
        Element root = document.getDocumentElement();
        System.out.println(root.getNodeName());

        //recorrer un elemento (camara id=n)
        NodeList nList = document.getElementsByTagName("camara");
        System.out.println("==============================");

        //leer, se hace con un for
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node node = nList.item(temp);
            System.out.println("");
            //preguntamos el tipo de nodo
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) node;
                System.out.println("Camara " + eElement.getAttribute("id"));
                System.out.println("Modelo " + eElement.getElementsByTagName("modelo").item(0).getTextContent());
                System.out.println("Marca " + eElement.getElementsByTagName("marca").item(0).getTextContent());
                System.out.println("Megapixeles " + eElement.getElementsByTagName("megapixeles").item(0).getTextContent());

                //No parsea por que en el XML el 3 y 4 son guiones y por lo tanto no son numericos
                //si cambiamos los guiones por numeros funciona sin problema
                //int megapixel = Integer.parseInt(eElement.getElementsByTagName("megapixeles").item(0).getTextContent());
                //System.out.println(megapixel + 100);
            }
        }

    }

}
