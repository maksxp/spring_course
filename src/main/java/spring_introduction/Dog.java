package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope ("prototype")
public class Dog implements Pet{

//    private String name;

    Dog () {
        System.out.println("dog is created");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    @PostConstruct // from java 11 we need to add library javax.annotation-api-1.3.2
//    public void init () {
//        System.out.println("class Dog init method!");
//    }
//
//    @PreDestroy // from java 11 we need to add library javax.annotation-api-1.3.2
//    public void destroy () {
//        System.out.println("class Dog destroy method!");
//    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
