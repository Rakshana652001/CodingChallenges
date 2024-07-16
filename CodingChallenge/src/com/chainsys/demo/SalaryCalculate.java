
package com.chainsys.demo;

import java.util.Scanner;

public class SalaryCalculate 
{
    static Company company = new Company();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter company name: ");
        String companyName = scan.nextLine();
        company.setCompanyName(companyName);

        System.out.println("Enter number of employees: ");
        int employeeCount = scan.nextInt();
        scan.nextLine(); 

        Employee[] employees = new Employee[employeeCount];

        for (int initial = 0; initial < employeeCount; initial++) 
        {
            employees[initial] = new Employee();
            System.out.println("Employee " + (initial + 1) + ": ");
            System.out.print("Enter ID: ");
            employees[initial].setId(scan.nextInt());
            scan.nextLine();

            System.out.print("Enter name: ");
            employees[initial].setName(scan.nextLine());

            System.out.print("Enter designation: ");
            employees[initial].setDesignation(scan.nextLine());

            System.out.print("Enter salary: ");
            employees[initial].setSalary(scan.nextDouble());
            scan.nextLine(); 
        }

        double averageSalary = company.getAverageSalary(employees);
        double maximumSalary = company.getMaximumSalary(employees);

        System.out.println("\nCompany: " + company.getCompanyName());
        System.out.println("Average Salary: " + averageSalary);
        System.out.println("Maximum Salary: " + maximumSalary);

        System.out.println("\nEmployee Details:");
        
        System.out.println("Enter a Designation: ");
       
        String designation = scan.next();
        
        Boolean flag = false;
        
        for (Employee employee : employees) 
        {
           if(designation.equals(employee.getDesignation()))
           	{
              		System.out.println("ID: " + employee.getId());
                    System.out.println("Name: " + employee.getName());
                    System.out.println("Designation: " + employee.getDesignation());
                    System.out.println("Salary: " + employee.getSalary());
                    System.out.println();
                    flag = true;
           	}                     
        }
        if (!flag)
        {
        	System.out.println("No such designation found.");
        }
    }
}
