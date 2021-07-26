package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("start");

//        // without Spring
//        Pet pet = new Cat();
//        Person person = new Person(pet);
//        person.callYourPet();

//        // with Spring for Pet
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        Pet pet = context.getBean("myPet", Pet.class);
//        Person person = new Person(pet);
//        person.callYourPet();

        // with Spring for all (bean with id="myPerson " was added to XML configuration file)
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("before getting");

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.println("age is: "+person.getAge()+", surname is "+person.getSurname());
        context.close();
    }
}
