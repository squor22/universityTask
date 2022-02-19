package task.university;

import task.university.database.service.department.DepartmentService;
import task.university.database.service.employee.EmployeeService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UniversityConsole {

    private final DepartmentService departmentService;
    private final EmployeeService employeeService;

    public UniversityConsole(DepartmentService departmentService, EmployeeService employeeService) {
        this.departmentService = departmentService;
        this.employeeService = employeeService;
    }

    public void run() {
        boolean isRunning = true;

        while(isRunning) {
            int command = getInput();
            Commands commands = new Commands(departmentService, employeeService);

            switch (command) {
                case 1:
                    commands.getHeadOfDepartmentCommand();
                case 2:
                    commands.showDepartmentStatisticsCommand();
                case 3:
                    commands.showAverageSalaryOfDepartmentCommand();
                case 4:
                    commands.showCountOfEmployeeForDepartmentCommand();
                case 5:
                    commands.searchByNameCommand();
                default:
                    if(command > 5 || command < 1) {
                        System.out.println("\nwrong choose");
                    }
            }
        }

    }

    private int getInput() {
        System.out.println("\n\nSelect the action");
        System.out.println("1 - Who is head of department");
        System.out.println("2 - Show statistics");
        System.out.println("3 - Show the average salary for the department");
        System.out.println("4 - Show count of employee for department");
        System.out.println("5 - Global search by");

        Scanner in = new Scanner(System.in);
        System.out.print("Write command: ");
        try {
            return in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException");
        }
        return 0;
    }
}
