package com.chainsys.javaEvaluation;

public class Manager extends Member
{
	private String department;
	public Manager()
	{
		
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Manager [department=" + department + "]";
	}
}
