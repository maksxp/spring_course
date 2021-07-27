package aop;

public class Student {
    private String nameAndSurname;
    private int course;
    private double avgGrade;

    public Student(String nameAndSurname, int course, double avgGrade) {
        this.nameAndSurname = nameAndSurname;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameAndSurname='" + nameAndSurname + '\'' +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
