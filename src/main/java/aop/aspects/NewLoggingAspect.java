package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    // with annotation "@Around" we should call target method ourselves
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: book is trying to be returned to the unuLibrary");

////        long begin = System.currentTimeMillis();
//        // without catching exceptions
//        Object targetMethodResult = proceedingJoinPoint.proceed();
////        targetMethodResult = "__new book__";
////        long end = System.currentTimeMillis();

        Object targetMethodResult = null;
//      // option when we catch and process exception - not recommended
//        try {
//            targetMethodResult = proceedingJoinPoint.proceed();
//        } catch (Exception e){
//            System.out.println("aroundReturnBookLoggingAdvice got an exception "+e);
//            targetMethodResult = "__unknown book__";
//        }

        // option when we catch and rethrow exception - recommended
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e){
            System.out.println("aroundReturnBookLoggingAdvice got an exception "+e);
            throw e;
        }

        System.out.println("aroundReturnBookLoggingAdvice: book is successfully returned to the unuLibrary");
//        System.out.println("aroundReturnBookLoggingAdvice: method returnBook made it's work in "+(end-begin)+ " Millis");
        return targetMethodResult;
    }
}
