/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orm;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Fran
 */
public class ListaDepartamentos {
    public static void main(String[] args) {
        
        
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        
        //Consulta
        Query q = session.createQuery("from Departamentos");
        //el resultado de la query lo metemos en una lista, como un arraylist
        List <Departamentos> lista = q.list();
        
        Iterator <Departamentos> iter = lista.iterator();
        System.out.println("Numero de departamentos: " +lista.size());
        
        while(iter.hasNext()){
            Departamentos depar = (Departamentos) iter.next();
            System.out.println(depar.getDeptNo()+" "+depar.getDnombre()+" "+depar.getLoc());
        }
        
        
        //Consulta nueva, empleados
        System.out.println("-----Consulta empleados----");
        Query qe = session.createQuery("from Empleados");
        qe.setFetchSize(10);
        Iterator iterEmpleados = qe.iterate();
        
        
        while(iterEmpleados.hasNext()){
            Empleados emp = (Empleados) iterEmpleados.next();
            System.out.println(emp.getApellido()+ " "+emp.getSalario());
        }
        
        session.close();
        System.exit(0);
    }
    
}
