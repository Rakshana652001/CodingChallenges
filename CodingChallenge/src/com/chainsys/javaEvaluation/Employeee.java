package com.chainsys.javaEvaluation;

public class Employeee extends Manager
{
	private String specialization;
	public Employeee()
	{
		
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	@Override
	public String toString() {
		return "Employeee [specialization=" + specialization + "]";
	}
}
