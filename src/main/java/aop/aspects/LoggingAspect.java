package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order (10) //good practice to set order not one by one (1, 2, 3). It will help to add new Aspect between exists
public class LoggingAspect {
    //below annotation will call beforeGetBookAdvice before methods in
    // class aop.UniLibrary only with data: public void aop.UniLibrary.getBook())
//    @Before("execution(public void aop.UniLibrary.getBook())")
//    //below annotation will call beforeGetBookAdvice before all methods (from all classes) with data: public void getBook())
//    @Before("execution(public void getBook())")
    //below annotation will call beforeGetBookAdvice before all methods (from all classes) with data:
    // public void get(any other continuation of method name)*())
//    @Before("execution(public void get*())")
//    public void beforeGetBookAdvice (){
//        System.out.println("beforeGetBookAdvice: try to get book");
//    }

//    //below annotation will call beforeGetBookAdvice before all methods getBook with String parameter
//    @Before("execution(public void getBook(String))")
//    public void beforeGetBookAdvice (){
//        System.out.println("beforeGetBookAdvice: try to get book");
//    }

//    //below annotation will call beforeGetBookAdvice before all public void methods with any name and any one parameter
//    @Before("execution(public void *(*))")
//    public void beforeGetBookAdvice (){
//        System.out.println("beforeGetBookAdvice: try to get book");
//    }

//    //below annotation will call beforeGetBookAdvice before all public void methods with any name and any one number of parameters
//    @Before("execution(public void *(..))")
//    public void beforeGetBookAdvice (){
//        System.out.println("beforeGetBookAdvice: try to get book");
//    }

//    //below annotation will call beforeGetBookAdvice before all public void methods with name getBook and parameter Book
//    @Before("execution(public void getBook(aop.Book))")
////    @Before("execution(public void getBook(Book))")
//    public void beforeGetBookAdvice (){
//        System.out.println("beforeGetBookAdvice: try to get book");
//    }

//    @Before("execution(public void returnBook())")
//    @Before("execution(public * returnBook())") // will work for methods with any return type
//    @Before("execution( * returnBook())") // will work for methods with any return type and any access modifiers
//      @Before("execution( * * ())") // will work for all methods without any parameters
//    public void beforeReturnBookAdvice (){
//        System.out.println("beforeReturnBookAdvice: try to return book");
//    }

//    //creating Pointcut to avoid copy/paste in annotations of aspect class methods
//    @Pointcut ("execution(* get*())")
//    private void allGetMethods (){}  // we can use method name instead of expression in brackets above "execution(* get*())"


    //below annotation will call beforeGetLoggingAdvice before all methods with name get* without parameters
//    @Before("execution(* get*())")
    @Before("aop.aspects.MyPointCuts.allAddMethods ()")  // the same as above but with using pointcut
//    public void beforeGetLoggingAdvice (){
    public void beforeAddLoggingAdvice (JoinPoint joinPoint){

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = "+methodSignature);
        System.out.println("methodSignature.getMethod() = "+methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = "+methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = "+methodSignature.getName());

        if (methodSignature.getName().equals("addBook")){
            Object [] args = joinPoint.getArgs();
            for (Object obj: args){
                if (obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("book info. Book name = "+myBook.getName()+", Book author = "+myBook.getAuthor()+
                            ", year of publishing = "+myBook.getYearOfPublishing());
                } else if (obj instanceof String){
                    System.out.println(obj + " is adding book to UniLibrary");
                }
            }
        }

    }

////   // below annotation will call beforeGetSecurityAdvice before all methods with name get* without parameters
////    @Before("execution(* get*())")
//    @Before("allGetMethods ()")  // the same as above but with using pointcut
//    public void beforeGetSecurityAdvice (){
//        System.out.println("beforeGetSecurityAdvice: check authority to get book/magazine");
//    }

//    @Pointcut ("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary (){}
//
//    @Pointcut ("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary (){}
//
//    //combined pointcut from two previous
//    @Pointcut ("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetOrReturnMethodsFromUniLibrary (){}
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice () {
//        System.out.println("beforeGetLoggingAdvice: writing GetLog #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice () {
//        System.out.println("beforeReturnLoggingAdvice: writing ReturnLog #2");
//    }
//
//    @Before("allGetOrReturnMethodsFromUniLibrary()")
//    public void beforeAddOrReturnLoggingAdvice () {
//        System.out.println("beforeAddOrReturnLoggingAdvice: writing Log #3");
//    }

//    //creating pointcut for all methods from UniLibrary except "returnMagazine"
//    // we will use combination of pointcuts to catch it up
//
//    // this pointcut matches all methods from UniLibrary
//    @Pointcut ("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){}
//
//    // this pointcut matches method returnMagazine only from UniLibrary
//    @Pointcut ("execution(* aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary(){}
//
//    //this combined pointcut is for all methods from UniLibrary except "returnMagazine"
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary(){}
//
//        @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice () {
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: writing Log #10");
//    }

}
