package com.bridgelabz.employeepayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    private List<EmployeeData> employeePayrollList = new ArrayList<EmployeeData>();
    Scanner scanner = new Scanner(System.in);

    public void readEmployeeDataFromConsole() {
        System.out.println("Enter Employee Id");
        int id = scanner.nextInt();
        System.out.println("Enter Employee Name");
        String Name = scanner.next();
        System.out.println("Enter the salary");
        int salary = scanner.nextInt();
        employeePayrollList.add(new EmployeeData(id, Name, salary));
    }

    public void writeEmployeeDataInConsole() {
        System.out.println("Writing Employee Pay Roll Data \n" + employeePayrollList);
    }
}
