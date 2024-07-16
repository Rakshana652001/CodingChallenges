package com.chainsys.javaEvaluation;

public class Employee 
{
	private int employeeld;
	private String name;
	private String branch;
	private double rating;
	private boolean companyTransport;
	
	public Employee()
	{
		
	}

	public int getEmployeeld() {
		return employeeld;
	}

	public void setEmployeeld(int employeeld) {
		this.employeeld = employeeld;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public boolean isCompanyTransport() {
		return companyTransport;
	}

	public void setCompanyTransport(boolean companyTransport) {
		this.companyTransport = companyTransport;
	}

	@Override
	public String toString() {
		return "Employee [employeeld=" + employeeld + ", name=" + name + ", branch=" + branch + ", rating=" + rating
				+ ", companyTransport=" + companyTransport + "]";
	}
	

}
