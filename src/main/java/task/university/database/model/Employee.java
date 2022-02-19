package task.university.database.model;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "degree")
    private String degree;

    @Column(name = "salary")
    private int salary;

    @Column(name = "department")
    private String department;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDegree() {
        return degree;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}
