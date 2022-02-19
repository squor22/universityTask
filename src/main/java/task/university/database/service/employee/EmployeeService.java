package task.university.database.service.employee;

import task.university.database.model.Employee;

public interface EmployeeService {

    int getCountOfAssistants();

    int getCountOfAssociateProfessors();

    int getCountOfProfessors();

    int getAverageSalaryOfDepartment(String department);

    int getCountOfEmployeeForDepartment(String department);

    String globalSearchBy(String str);
}
