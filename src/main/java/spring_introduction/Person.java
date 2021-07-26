package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component ("personBean")
public class Person {

//    @Autowired // in this case injection will be using reflection NOT setPet!!!
//    @Qualifier("catBean")   // this annotation uses to allow Spring to choose correct bean from all possible for injection
    private Pet pet;
//    @Value("MMM")   // value will be assigned using reflection
    @Value("${person.surname}")   // value will be assigned using reflection from myApp.properties
    private String surname;
//    @Value("18")    // value will be assigned using reflection
    @Value("${person.age}")    // value will be assigned using reflection from myApp.properties
    private int age;

    //this constructor is for creating bean via Constructor
    @Autowired // this annotation injects dependency Pet in constructor
//    public Person(@Qualifier("catBean") Pet pet) {   //for constructors @Qualifier used directly in parameter list
    public Person(Pet pet) {   //for constructors @Qualifier used directly in parameter list
        System.out.println("person is created");
        this.pet = pet;
    }

//    //this constructor is for creating bean via Setter
//    public Person() {
//        System.out.println("person is created");
//    }

//    @Autowired  // this annotation set Pet in method below
//    @Qualifier ("dog") // this annotation uses to allow Spring to choose correct bean from all possible for injection
//    public void setPet(Pet pet) {
//            System.out.println("set pet");
//        this.pet = pet;
//    }

//    //we can use any name of method to inject object
//    @Autowired  // this annotation set Pet in method below
//    public void anyName(Pet pet) {
//        System.out.println("set any");
//        this.pet = pet;
//    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("set age");
        this.age = age;
    }

    public void callYourPet (){
        System.out.println("Hello, my lovely pet!!");
        pet.say();
    }
}
