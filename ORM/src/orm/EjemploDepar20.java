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
public class EjemploDepar20 {

    public static void main(String[] args) {
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();

        //Consulta que muestra el apelli y el salario de los empleados del departamento 20
        Query q = session.createQuery("from Empleados");
        //aqui tendriamos toso los empleados y tendriamos que recorrerlo
        List<Empleados> listaEmpleados = q.list();
        Iterator<Empleados> iterador = listaEmpleados.iterator();

        //lo recorremos
        while (iterador.hasNext()) {
            Empleados emp = iterador.next();
            Departamentos dep = emp.getDepartamentos();
            if (dep.getDeptNo() == 30) {
                System.out.println(emp.getApellido() + " " + emp.getSalario());
            }
        }

            System.out.println("----SEGUNDA CONSULTA----");
        
        //otra forma, metemos los objetos en la sentencia HQL
        Query q2 = session.createQuery("from Empleados as e where e.departamentos.deptNo = 20");

        listaEmpleados = q2.list();

        iterador = listaEmpleados.iterator();

        while (iterador.hasNext()) {
            Empleados emp = iterador.next();
            System.out.println(emp.getApellido() + " " + emp.getSalario());
        }

        
        
        
        session.close();
        System.exit(0);
    }
}
