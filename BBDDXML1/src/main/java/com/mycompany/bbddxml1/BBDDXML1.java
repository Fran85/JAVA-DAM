/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bbddxml1;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.Database;
import org.xmldb.api.base.Resource;
import org.xmldb.api.base.ResourceIterator;
import org.xmldb.api.base.ResourceSet;
import org.xmldb.api.base.XMLDBException;
import org.xmldb.api.modules.XPathQueryService;

/**
 *
 * @author Fran
 */
public class BBDDXML1 {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, XMLDBException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        String driver = "org.exist.xmldb.DatabaseImpl";
        Class cl = Class.forName(driver);
        System.out.println("Correcto");

        Database database = (Database) cl.getDeclaredConstructor().newInstance();
        //database.setProperty("create-database", "true");
        DatabaseManager.registerDatabase(database);
        System.out.println("Correcto");
        //Colección
        String URI = "xmldb:exist://localhost:8080/exist/xmlrpc/db/universidad";
        String usu = "admin";
        String pass = "12345FFrr";
        Collection col = (Collection) DatabaseManager.getCollection(URI, usu, pass);
        System.out.println("COrrecto");
        if (col == null) {
            System.out.println("La colección no existe");
        }

        XPathQueryService servicio = (XPathQueryService)col.getService("XPathQueryService", "1.0");

        //ResourceSet result = servicio.query("/*/*");
        ResourceSet result = servicio.query("/universidad/departamento/codigo[.='IFC1']/../empleado/nombre/text()");
        System.out.println("Correcto");
        //Recorremos
        ResourceIterator i;
        i = result.getIterator();
        String cadenaSuma="";
        if (!i.hasMoreResources()) {
            System.out.println("La consulta no devuelve nada");
        } else {
            
            while (i.hasMoreResources()) {                
                Resource r = i.nextResource();
                String s = r.getContent().toString();
                //Ojo al parseo Integer.valueOf()
                cadenaSuma+=s;
                System.out.println(s);
                //System.out.println(r.getContent());
            }
        }
        System.out.println("Suma de cadenas: "+cadenaSuma);

    }
}
