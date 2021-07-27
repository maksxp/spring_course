package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspects {
    @Before("aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeGetExceptionHandlingAdvice (){
        System.out.println("beforeGetExceptionHandlingAdvice: catch and process exception while trying to get book/magazine");
        System.out.println("___________________________________________");
    }

}
