package com.chainsys.javaEvaluation;

import java.util.Scanner;

public class MyClass 
{
static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Enter four employee details: ");
		Employee[] employee = new Employee[4];
		
		for(int initial=0;initial<4;initial++)
		{
			employee[initial] = new Employee();
			System.out.println("Enter ID: ");
			employee[initial].setEmployeeld(scan.nextInt());
			scan.nextLine();
			
			System.out.println("Enter Name: ");
			employee[initial].setName(scan.next());
			
			System.out.println("Enter Branch: ");
			employee[initial].setBranch(scan.next());
			
			System.out.println("Enter rating: ");
			employee[initial].setRating(scan.nextDouble());
			scan.nextLine();
			
			System.out.println("Using Company Transport? (true/false) ");
			employee[initial].setCompanyTransport(scan.nextBoolean());
			scan.nextLine();
			
		}
		
		int employeeTrasportcount = findCountOfEmployeesUsingCompTransport(employee);
		System.out.println(employeeTrasportcount+" employees using office transport.\n");
		
		double secondHighestRating = findEmployeeWithSecondHighestRating(employee);
		for(Employee employees : employee)
		{
			if(secondHighestRating==employees.getRating())
			{
				System.out.println("Rating: "+employees.getRating());
				System.out.println("ID: "+employees.getEmployeeld());
				System.out.println("Name: "+employees.getName());
			}
		}
		
	}

	
	static boolean trasport;
	static int count = 0;
	public static int findCountOfEmployeesUsingCompTransport(Employee[] employee)
	{
		for(Employee employees : employee)
		{
			trasport = employees.isCompanyTransport();
			if(trasport==true)
			{
				count++;
			}
					
		}
		return count;
	}
	
	public static double findEmployeeWithSecondHighestRating(Employee[] employees) {
	    double firstHighest = Double.NEGATIVE_INFINITY;//1
	    double secondHighest = Double.NEGATIVE_INFINITY;//2

	    for (Employee employee : employees) 
	    {
	        if (!employee.isCompanyTransport())//false
	        {
	            double rating = employee.getRating();
	            if (rating > firstHighest) 
	            {
	                secondHighest = firstHighest;
	                firstHighest = rating;
	            } 
	            else if (rating > secondHighest && rating != firstHighest) 
	            {
	                secondHighest = rating;
	            }
	        }
	    }
	    return secondHighest == Double.NEGATIVE_INFINITY ? 0 : secondHighest;
	}

}
