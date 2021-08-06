package hibernate_many_to_one_bi;

import hibernate_many_to_one_bi.entity.Department;
import hibernate_many_to_one_bi.entity.Employee;
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
//            Department department = new Department("dep1", 300, 1200);
//            Employee emp1 = new Employee("name1", "surname1", 800);
//            Employee emp2 = new Employee("name2", "surname2", 1000);
//            Employee emp3 = new Employee("name2", "surname2", 900);
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//            department.addEmployeeToDepartment(emp3);

            session.beginTransaction();

            System.out.println("Get Department");
            Department department = session.get(Department.class, 3);
            System.out.println("Show Department");
            System.out.println(department);
            System.out.println("preloading");
            department.getEmps().get(0);
//            System.out.println("Show emps of the dep-t");
//            System.out.println(department.getEmps());

//            Employee employee = session.get(Employee.class, 1);
//            session.delete(employee);

//            employee = session.get(Employee.class, 2);
//            Employee employee = session.get(Employee.class, 2);
//
//            System.out.println(employee);
//
//            session.delete(employee);
//
//            System.out.println(employee.getSalary());
//
//            session.save(department);
//            session.update(department);

            session.getTransaction().commit();
            System.out.println("Show emps of the dep-t");
            System.out.println(department.getEmps());
//            session.close();

            System.out.println("__________________________________");

        } finally {
            session.close();
            factory.close();
        }

    }
}
