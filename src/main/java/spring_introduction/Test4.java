package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
//        myDog.setName("Belka");
//        Dog yourDog = context.getBean("myPet", Dog.class);
//        yourDog.setName("Strelka");

         //sout below again shows that object is the same for scope singleton
//        System.out.println("are myDog and your Dog the same objects? " +(myDog==yourDog));
//        //souts below again shows that object is the same for scope singleton
//        System.out.println("myDog name is: "+myDog.getName());
//        System.out.println("myDog name is: "+yourDog.getName());

//        //sout below again shows that object is the same for scope prototype
//        System.out.println("are myDog and your Dog the same objects? " +(myDog==yourDog));
//        //souts below again shows that objects are different for scope prototype
//        System.out.println("myDog name is: "+myDog.getName());
//        System.out.println("myDog name is: "+yourDog.getName());

        context.close();
    }
}
