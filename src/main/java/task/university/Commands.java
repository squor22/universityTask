package task.university;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import task.university.database.model.Employee;
import task.university.database.service.department.DepartmentService;
import task.university.database.service.employee.EmployeeService;

import java.util.Scanner;

public class Commands {

    String department;
    Scanner scanner = new Scanner(System.in);

    private final DepartmentService departmentService;
    private final EmployeeService employeeService;

    public Commands(DepartmentService departmentService, EmployeeService employeeService) {
        this.departmentService = departmentService;
        this.employeeService = employeeService;
    }

    public void getHeadOfDepartmentCommand() {
        System.out.print("Print name of department: ");
        department = scanner.nextLine();
        try {
            System.out.println("Head of " + department + " is " + departmentService.getHeadOfDepartment(department));
        } catch (NullPointerException e) {
            System.out.println("There is no such department");
        }
    }

    public void showDepartmentStatisticsCommand() {
        System.out.print("Print name of department: ");
        department = scanner.nextLine();
        System.out.println("Assistants: " + employeeService.getCountOfAssistants());
        System.out.println("Associate professors: " + employeeService.getCountOfAssociateProfessors());
        System.out.println("Professors: " + employeeService.getCountOfProfessors());
    }

    public void showAverageSalaryOfDepartmentCommand() {
        System.out.print("Print name of department: ");
        department = scanner.nextLine();
        System.out.println("Average salary of" + department + " is: " + employeeService.getAverageSalaryOfDepartment(department));
    }

    public void showCountOfEmployeeForDepartmentCommand() {
        System.out.print("Print name of department: ");
        department = scanner.nextLine();
        System.out.println("Count of employee: " + employeeService.getCountOfEmployeeForDepartment(department));
    }

    public void searchByNameCommand() {
        System.out.print("Global search by: ");
        String str = scanner.nextLine();
        System.out.println("Result: " + employeeService.globalSearchBy(str));
    }
}
