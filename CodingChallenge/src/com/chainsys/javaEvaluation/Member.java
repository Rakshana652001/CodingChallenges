package com.chainsys.javaEvaluation;

public class Member 
{
	private String name;
	private String age;
	private long phoneNumber;
	private String address;
	private double salary;
	
	public Member()
	{
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ ", salary=" + salary + "]";
	}
}
