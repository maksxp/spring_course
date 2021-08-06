package hibernate_CRUD;

import hibernate_CRUD.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            // get all employees
//            List <Employee> emps = session.createQuery("from Employee").getResultList();

//            // get all employees by name
//            List <Employee> emps = session.createQuery(
//                    "from Employee where name='MaxName8'").getResultList();

            // get all employees by name and salary
            List <Employee> emps = session.createQuery(
                    "from Employee where name like 'MaxName%' and salary>5").getResultList();

            for (Employee e: emps ){
                System.out.println(e);
            }

            session.getTransaction().commit();

            System.out.println("__________________________________");


        } finally {
            factory.close();
        }
    }
}
