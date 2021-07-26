package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test7 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig2.class);

//        Pet cat = context.getBean("catBean", Cat.class);
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        System.out.println(person.getAge());
        System.out.println(person.getSurname());

        context.close();
    }
}