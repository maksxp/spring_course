package hibernate_CRUD;

import hibernate_CRUD.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            //update one Employee object
//            Employee emp = session.get(Employee.class, 1);
//            emp.setSalary(555);

            //update few Employee objects
            session
                   .createQuery("update Employee set salary=777 where name='MaxName'")
                   .executeUpdate();

            session.getTransaction().commit();

            System.out.println("__________________________________");


        } finally {
            factory.close();
        }
    }
}
