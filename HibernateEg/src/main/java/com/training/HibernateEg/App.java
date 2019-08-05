package com.training.HibernateEg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.training.HibernateEg.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee em = new Employee();
        em.setEpmID(1);
        em.setEmpName("Jigar");
        em.setEmpSal(1000);
        em.setEmpDesignation("Consultant");
        em.setEmpDepartment("IT");
        
        @SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();	
        session.beginTransaction();
        session.save(em);
        session.getTransaction().commit();
    }
}
