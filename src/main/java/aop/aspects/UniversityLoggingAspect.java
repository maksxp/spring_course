package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice (){
//        System.out.println("beforeGetStudentsLoggingAdvice: logging getting of student list BEFORE method getStudents()");
//    }

//    //simple AfterReturning
//    @AfterReturning("execution(* getStudents())")
//    public void afterReturningGetStudentsLoggingAdvice (){
//        System.out.println("afterReturningGetStudentsLoggingAdvice: logging getting of student list AFTER method getStudents()");
//    }

//    //AfterReturning with additional parameters
//    // this annotation will update list of students which should return method getStudents()
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice (List <Student> students){
//        Student firstStudent = students.get(0);
//
//        String nameSurname = firstStudent.getNameAndSurname();
//        firstStudent.setNameAndSurname("Mr. "+nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        firstStudent.setAvgGrade(avgGrade+1);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: logging getting of student list AFTER method getStudents()");
//    }

//    //simple AfterThrowing
//    @AfterThrowing("execution(* getStudents())")
//    public void afterThrowingGetStudentsLoggingAdvice () {
//
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: exception logging in method getStudents()");
//    }

//    //AfterThrowing with parameters
//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice (Throwable exception) {
//
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: exception logging in method getStudents()   "+exception);
//    }

    //simple after
    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice () {

        System.out.println("afterGetStudentsLoggingAdvice: exception or normal ending logging in method getStudents()   ");
    }

}
