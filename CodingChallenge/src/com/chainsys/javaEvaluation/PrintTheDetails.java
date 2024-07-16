package com.chainsys.javaEvaluation;

import java.util.Scanner;

public class PrintTheDetails 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		Employeee[] employee = new Employeee[2];
		for(int initial=0;initial<2;initial++)
		{
			employee[initial] = new Employeee();
			System.out.println("Enter the name: ");
			String name = scan.next();
			employee[initial].setName(name);
			
			System.out.println("Enter age: ");
			String age = scan.next();
			employee[initial].setAge(age);
			
			System.out.println("Enter phone number: ");
			long num = scan.nextLong();
			employee[initial].setPhoneNumber(num);
			
			System.out.println("Enter address: ");
			String add = scan.next();
			employee[initial].setAddress(add);
			
			System.out.println("Enter salary: ");
			double salary = scan.nextDouble();
			employee[initial].setSalary(salary);
			
			System.out.println("Enter Specilization: ");
			String spc = scan.next();
			employee[initial].setSpecialization(spc);
			
			System.out.println("Enter Department: ");
			String dept = scan.next();
			employee[initial].setDepartment(dept);
		}
		for(Employeee employee1:employee)
		{
			System.out.println("\nName: "+employee1.getName());
			System.out.println("Age: "+employee1.getAge());
			System.out.println("Phone Number: "+employee1.getPhoneNumber());
			System.out.println("Address: "+employee1.getAddress());
			System.out.println("Salary: "+employee1.getSalary());
			System.out.println("Specilization: "+employee1.getSpecialization());
			System.out.println("Department: "+employee1.getDepartment());
		}
		
		
		scan.close();
	}

}
