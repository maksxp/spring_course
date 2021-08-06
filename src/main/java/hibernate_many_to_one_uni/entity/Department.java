package hibernate_many_to_one_uni.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;

    @Column (name = "name")
    private String departmentName;

    @Column (name = "max_salary")
    private int MaxSalary;

    @Column (name = "min_salary")
    private int MinSalary;

//    @OneToMany (cascade = CascadeType.ALL, mappedBy = "department")
    //if we don't want to delete linked objects
    @OneToMany (cascade = CascadeType.ALL)
    @JoinColumn (name = "department_id")
    private List <Employee> emps;

    public Department() {
    }

    public Department(String departmentName, int maxSalary, int minSalary) {
        this.departmentName = departmentName;
        MaxSalary = maxSalary;
        MinSalary = minSalary;
    }

    public void addEmployeeToDepartment (Employee employee){
        if (emps==null){
           emps = new ArrayList<>();
        }
        emps.add(employee);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getMaxSalary() {
        return MaxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        MaxSalary = maxSalary;
    }

    public int getMinSalary() {
        return MinSalary;
    }

    public void setMinSalary(int minSalary) {
        MinSalary = minSalary;
    }

    public List<Employee> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", MaxSalary=" + MaxSalary +
                ", MinSalary=" + MinSalary +
                '}';
    }
}
