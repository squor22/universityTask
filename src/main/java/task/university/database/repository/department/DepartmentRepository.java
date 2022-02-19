package task.university.database.repository.department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import task.university.database.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    Department findFirstByDepartment(String department);
}
