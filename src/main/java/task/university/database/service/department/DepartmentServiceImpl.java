package task.university.database.service.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import task.university.database.model.Department;
import task.university.database.repository.department.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    private DepartmentRepository departmentRepository;

    @Autowired
    public void setDepartmentRepository(DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }

    @Override
    public String getHeadOfDepartment(String department) {
        Department dep = departmentRepository.findFirstByDepartment(department);
        return dep.getHeadOfDepartment();
    }
}
