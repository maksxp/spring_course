package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();

//            Employee employee = new Employee("MaxName1", "MaxSurname1", "IT1", 1);
//            Detail detail = new Detail("city1", "phone1", "email1");
//            employee.setEmpDetail(detail);

//            Employee employee = new Employee("MaxName2", "MaxSurname2", "IT2", 2);
//            Detail detail = new Detail("city2", "phone2", "email2");
//            employee.setEmpDetail(detail);

            session.beginTransaction();

            Employee emp = session.get(Employee.class,2);
            session.delete(emp);



//            session.save(employee);

            session.getTransaction().commit();

            System.out.println("__________________________________");

        } finally {
            session.close();
            factory.close();
        }
    }
}
