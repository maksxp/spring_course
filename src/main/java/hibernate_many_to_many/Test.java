package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//            Section section1 = new Section("section1");
//            Child child1 = new Child("child1", 5);
//            Child child2 = new Child("child2", 7);
//            Child child3 = new Child("child3", 6);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.save(section1);
//
//            session.getTransaction().commit();
//            System.out.println("________________________________");

//            //*******************************************************
//
//            session = factory.getCurrentSession();
//            Section section2 = new Section("section2");
//            Section section3 = new Section("section3");
//            Section section4= new Section("section4");
//            Child child4 = new Child("child4", 10);
//            child4.addSectionToChild(section2);
//            child4.addSectionToChild(section3);
//            child4.addSectionToChild(section4);
//
//            session.beginTransaction();
//
//            session.save(child4);
//
//            session.getTransaction().commit();
//            System.out.println("________________________________");

//            //*******************************************************
//
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            session.delete(session.get(Section.class,1));
//
//            session.getTransaction().commit();
//            System.out.println("________________________________");

            //****************************************************
            //option below does not work without CascadeType.All
//
//            session = factory.getCurrentSession();
//            Section section1 = new Section("section1");
//            Child child1 = new Child("child1", 5);
//            Child child2 = new Child("child2", 7);
//            Child child3 = new Child("child3", 6);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.save(section1);
//
//            session.getTransaction().commit();
//            System.out.println("________________________________");

//            //*******************************************************

//            //without CascadeType.All we should SAVE all objects separately
//
//            session = factory.getCurrentSession();
//            Section section1 = new Section("section1");
//            Child child1 = new Child("child1", 5);
//            Child child2 = new Child("child2", 7);
//            Child child3 = new Child("child3", 6);
//
//
//            session.beginTransaction();
//
//            session.save(section1);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.save(child1);
//            session.save(child2);
//            session.save(child3);
//
//            session.getTransaction().commit();
//            System.out.println("________________________________");

         //*******************************************************

//            //without CascadeType.All we should use method persist() instead of save()
//
//            session = factory.getCurrentSession();
//            Section section1 = new Section("section5");
//            Child child1 = new Child("child5", 9);
//            Child child2 = new Child("child6", 9);
//            Child child3 = new Child("child7", 9);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit();
//            System.out.println("________________________________");

            //*******************************************************

            //deleting of section

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Section section1 = session.get(Section.class, 7);
//
//            session.delete(section1);
//
//            session.getTransaction().commit();
//            System.out.println("________________________________");

            //*******************************************************

            //deleting of child
            session = factory.getCurrentSession();

            session.beginTransaction();
            Child child = session.get(Child.class, 5);

            session.delete(child);

            session.getTransaction().commit();
            System.out.println("________________________________");





        } finally {
            session.close();
            factory.close();
        }
    }
}
