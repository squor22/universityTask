package task.university.database.repository.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import task.university.database.model.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findEmployeeByDegree(String degree);
    List<Employee> findEmployeeByDepartment(String department);
    List<Employee> findByNameContaining(String str);
}
