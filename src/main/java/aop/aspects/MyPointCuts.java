package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {

//    //creating Pointcut to avoid copy/paste in annotations of aspect class methods
    @Pointcut("execution(* abc*())")
//    @Pointcut("execution(* get*())") // commented to avoid extra outputs
    public void allGetMethods (){}  // we can use method name instead of expression in brackets above "execution(* get*())"

    //creating Pointcut to avoid copy/paste in annotations of aspect class methods
    @Pointcut("execution(* qaz*(..))")
//    @Pointcut("execution(* add*(..))") // commented to avoid extra outputs
    public void allAddMethods(){}  // we can use method name instead of expression in brackets above "execution(* get*())"
}
