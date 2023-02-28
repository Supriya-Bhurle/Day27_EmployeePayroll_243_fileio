package com.bridgelabz.employeepayroll;

public class EmployeePayrollMain {
    public static void main(String[] args) {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        System.out.println("Welcome to the Employee_Payroll_Services");
        employeePayrollService.readEmployeeDataFromConsole();
        employeePayrollService.writeEmployeeDataInConsole();
    }
}
