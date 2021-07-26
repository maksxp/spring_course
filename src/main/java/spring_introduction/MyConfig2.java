package spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//this option uses to configure spring without scanning, so there is no need @Component, @Autowired, @Qualifier etc
@Configuration
@PropertySource("classpath:myApp.properties")
public class MyConfig2 {

    @Bean // it will be bean
    public Pet catBean (){
        return  new Cat();
    }

    @Bean
    public Person personBean () {
        return new Person(catBean());
    }
}
