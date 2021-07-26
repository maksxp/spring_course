package spring_introduction;

import org.springframework.stereotype.Component;

@Component("catBean")
//@Component()
public class Cat implements Pet {

    Cat () {
        System.out.println("cat is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
