/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orm;

import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.TransientPropertyValueException;
import org.hibernate.exception.ConstraintViolationException;

/**
 *
 * @author Fran
 */
public class ORM {

    public static void main(String[] args) {
        
        SessionFactory sesion = orm.HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();

        System.out.println("Inserta un empleado: ");
        
        Empleados em = new Empleados();
        em.setEmpNo((short) 4665);
        em.setApellido("Jose Mellado");
        em.setDir((short) 7111);
        em.setOficio("Developer");
        em.setSalario((float) 2000);
        em.setComision((float) 10);

        Departamentos d = new Departamentos();
        d.setDeptNo((byte) 10);
        em.setDepartamentos(d);

        try {
            session.save(em);

            try {
                tx.commit();
            } catch (ConstraintViolationException e) {
                System.out.println("Empleado duplicado");
                System.out.println("Error SQL: " + e.getSQL());
            }
        } catch (TransientPropertyValueException e) {
            System.out.println("Departamento no existe");
            System.out.println("Mensaje: " + e.getMessage());
        }

        session.close();
        System.exit(0);
    }
}
