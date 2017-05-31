package org.tss.hibernate.onetomany;

import org.hibernate.Session;
import org.tss.simple.hibernate.persistence.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("one to many+ Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        Department dept = new Department();
        dept.setDepartmentName("food corp");    
        dept.setLocation("coimbatore");
        
        Employee emp = new Employee();
        emp.setFirstName("e1");
        emp.setLastName("f1");
        emp.setDepartment(dept);
        
        Employee emp1 = new Employee();
        emp1.setFirstName("e1");
        emp1.setLastName("f1");
        emp1.setDepartment(dept);
                
        dept.getListEmployee().add(emp);
        dept.getListEmployee().add(emp1); 

                
        session.save(dept);
        
        
        //session.save(emp);
       // session.save(emp1);


        session.getTransaction().commit();
    }
}
