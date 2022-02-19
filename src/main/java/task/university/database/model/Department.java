package task.university.database.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "department_name")
    private String department;

    @Column(name = "head_of_department")
    private String headOfDepartment;

    @Column(name = "count")
    private String count;

    public Integer getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public String getHeadOfDepartment() {
        return headOfDepartment;
    }

    public String getCount() {
        return count;
    }

}
