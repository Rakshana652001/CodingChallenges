package com.chainsys.demo;

import java.sql.Array;
import java.util.Arrays;

public class Company
{
	private String companyName;
	private Array[] employees;
	private int numEmployees;
	
	public Company()
	{
		
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Array[] getEmployees() {
		return employees;
	}

	public void setEmployees(Array[] employees) {
		this.employees = employees;
	}

	public int getNumEmployees() {
		return numEmployees;
	}

	public void setNumEmployees(int numEmployees) {
		this.numEmployees = numEmployees;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", employees=" + Arrays.toString(employees) + ", numEmployees="
				+ numEmployees + "]";
	}

	
	public double getAverageSalary(Employee[] employees)
	{
        double sum = 0;
        for (Employee employee : employees) 
        {
            sum += employee.getSalary();
        }
        return sum / employees.length;
    }

    public double getMaximumSalary(Employee[] employees) 
    {
        double max = employees[0].getSalary();
        for (Employee employee : employees) 
        {
            if (employee.getSalary() > max) 
            {
                max = employee.getSalary();
            }
        }
        return max;
    }
    
    

}
