package task.university;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import task.university.database.service.department.DepartmentService;
import task.university.database.service.employee.EmployeeService;

@SpringBootApplication
public class UniversityApplication {

	private final DepartmentService departmentService;
	private final EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(UniversityApplication.class, args);
	}

	@Autowired
	public UniversityApplication(DepartmentService departmentService, EmployeeService employeeService) {
		this.departmentService = departmentService;
		this.employeeService = employeeService;
	}

	@EventListener(ApplicationReadyEvent.class)
	public void application() {
		UniversityConsole universityConsole = new UniversityConsole(departmentService, employeeService);
		universityConsole.run();
	}
}
