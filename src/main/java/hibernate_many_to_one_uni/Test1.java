package hibernate_many_to_one_uni;

import hibernate_many_to_one_uni.entity.Department;
import hibernate_many_to_one_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
//        Employee employee =null;
        try {
            session = factory.getCurrentSession();
//            Department department = new Department("dep2", 500, 1500);
//            Employee emp1 = new Employee("name3", "surname3", 800);
//            Employee emp2 = new Employee("name4", "surname4", 1000);

//            department.addEmployeeToDepartment(emp2);



            session.beginTransaction();

//            Department department1 = session.get(Department.class,2);
//            System.out.println(department1.getEmps());
//            Employee employee = session.get(Employee.class,3);
//
//            session.delete(employee);

            session.delete(session.get(Department.class,2));

            session.getTransaction().commit();

            System.out.println("__________________________________");

        } finally {
            session.close();
            factory.close();
        }

    }
}
