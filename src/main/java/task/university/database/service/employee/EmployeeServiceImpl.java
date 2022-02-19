package task.university.database.service.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import task.university.database.model.Employee;
import task.university.database.repository.employee.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public int getCountOfAssistants() {
        return employeeRepository.findEmployeeByDegree("assistant").size();
    }

    @Override
    public int getCountOfAssociateProfessors() {
        return employeeRepository.findEmployeeByDegree("associate professor").size();
    }

    @Override
    public int getCountOfProfessors() {
        return employeeRepository.findEmployeeByDegree("professor").size();
    }

    @Override
    public int getAverageSalaryOfDepartment(String department) {
        List<Employee> employees = employeeRepository.findEmployeeByDepartment(department);
        int average = 0;

        for (Employee employee : employees) {
            average += employee.getSalary();
        }

        return average / employees.size();
    }

    @Override
    public int getCountOfEmployeeForDepartment(String department) {
        List<Employee> employees = employeeRepository.findEmployeeByDepartment(department);

        return employees.size();
    }

    @Override
    public String globalSearchBy(String str) {
        List<Employee> employees = employeeRepository.findByNameContaining(str);

        StringBuilder result = new StringBuilder();

        for (Employee employee : employees) {
            result.append(employee.getName()).append(", ");
        }

        return result.toString();
    }
}
