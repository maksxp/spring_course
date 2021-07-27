package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List <Student> students = new ArrayList<>();

    public void addStudents () {
        Student st1 = new Student("Student 1", 4, 7.5);
        Student st2 = new Student("Student 2", 2, 8.3);
        Student st3 = new Student("Student 3", 1, 9.1);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List <Student> getStudents (){
        System.out.println("start working of method getStudents()");
//        System.out.println(students.get(3));
        System.out.println("info from method getStudents:");
        System.out.println(students);
        return students;
    }
}
