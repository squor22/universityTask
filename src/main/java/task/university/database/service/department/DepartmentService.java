package task.university.database.service.department;

import org.springframework.stereotype.Service;

@Service
public interface DepartmentService {

    String getHeadOfDepartment(String department);
}
