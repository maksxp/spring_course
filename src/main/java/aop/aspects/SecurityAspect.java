package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {

    //   // below annotation will call beforeGetSecurityAdvice before all methods with name get* without parameters
//    @Before("execution(* get*())")
    @Before("aop.aspects.MyPointCuts.allGetMethods()")  // the same as above but with using pointcut
    public void beforeGetSecurityAdvice (){
        System.out.println("beforeGetSecurityAdvice: check authority to get book/magazine");
        System.out.println("________________________________________________________");
    }
}
