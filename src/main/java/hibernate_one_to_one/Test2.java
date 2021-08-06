package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();

//            Employee employee = new Employee("MaxName3", "MaxSurname3", "IT3", 3);
//            Detail detail = new Detail("city3", "phone3", "email3");
//            employee.setEmpDetail(detail);

//            detail.setEmployee(employee);

//            Employee employee = new Employee("MaxName7", "MaxSurname7", "IT7", 7);
//            Detail detail = new Detail("city7", "phone7", "email7");
//            employee.setEmpDetail(detail);

//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);

            session.beginTransaction();

            Detail detail = session.get(Detail.class, 8);
            detail.getEmployee().setEmpDetail(null);
//            System.out.println(detail.getEmployee());
            session.delete(detail);

//            session.save(employee);

            session.getTransaction().commit();

            System.out.println("__________________________________");

        } finally {
            session.close();
            factory.close();
        }
    }
}
