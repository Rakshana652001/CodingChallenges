package com.chainsys.stream;

import java.util.List;

public class Stream 
{
	class Students
	{
		private String name;
		private String age;
		private List<Numbers> phoneNumber;
		private Address address;
		
		public Students()
		{
			
		}
		
		public Students(String name, String age, List<Numbers> phoneNumber, Address address) {
			super();
			this.name = name;
			this.age = age;
			this.phoneNumber = phoneNumber;
			this.address = address;
		}


		public Students(String name2, String age2, List<Numbers> asList, com.chainsys.stream.Address address2) {
			// TODO Auto-generated constructor stub
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


		public List<Numbers> getPhoneNumber() {
			return phoneNumber;
		}


		public void setPhoneNumber(List<Numbers> phoneNumber) {
			this.phoneNumber = phoneNumber;
		}


		public Address getAddress() {
			return address;
		}


		public void setAddress(Address address) {
			this.address = address;
		}


		@Override
		public String toString() {
			return "Students [name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + ", address=" + address
					+ "]";
		}



		
	}
	
	class Numbers
	{
		private String mobileNumber;
		public Numbers(String mobileNumber)
		{
			this.mobileNumber = mobileNumber;
		}
		public String getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		@Override
		public String toString() {
			return "Numbers [mobileNumber=" + mobileNumber + "]";
		}
	}
	
	class Address
	{
		private String doorNo;
		public Address(String doorNo)
		{
			this.doorNo = doorNo;
		}
		public String getDoorNo() {
			return doorNo;
		}
		public void setDoorNo(String doorNo) {
			this.doorNo = doorNo;
		}
		@Override
		public String toString() {
			return "Addresss [doorNo=" + doorNo + "]";
		}
	}
}
