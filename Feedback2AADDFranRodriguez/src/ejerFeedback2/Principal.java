/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerFeedback2;

import java.io.File;
import java.io.IOException;
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
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        
        Document document = builder.parse(new File ("departamentos.xml"));
        System.out.println("El fichero existe\n");
        
        document.getDocumentElement().normalize();
        System.out.println("Fichero normalizado\n");
        
        Element raiz = document.getDocumentElement();
        System.out.println(raiz.getNodeName());
        
        NodeList nList = document.getElementsByTagName("departamento");
        System.out.println("=============================");
        
        for (int temp = 0; temp< nList.getLength(); temp++){
            Node node = nList.item(temp);
            System.out.println("");
            
            if (node.getNodeType()==Node.ELEMENT_NODE){
                Element eElement = (Element) node;
                System.out.println("Departamento: ");
                System.out.println("Numero " + eElement.getElementsByTagName("num").item(0).getTextContent());
                System.out.println("Nombre " + eElement.getElementsByTagName("nombre").item(0).getTextContent());
                System.out.println("Localidad " + eElement.getElementsByTagName("localidad").item(0).getTextContent());
            }
        }
    }
}
