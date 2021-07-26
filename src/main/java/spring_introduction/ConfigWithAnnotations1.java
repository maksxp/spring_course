package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

//        // line below will work if class Cat has annotation with parameter  = @Component("catBean")
//        Cat myCat = context.getBean("catBean", Cat.class);
//        // line below will work if class Cat has has annotation without parameter  = @Component()
////        Cat myCat = context.getBean("cat", Cat.class);
//        myCat.say();

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println("age "+person.getAge());
        System.out.println("surname "+person.getSurname());
        context.close();

    }
}
