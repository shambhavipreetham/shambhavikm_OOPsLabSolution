package com.Employee;


public class Employee {
	
	private String firstName;
	private String lastName;
	
	// access modifier private is used for Encapsulation
	
	//using getter and setter method to access firstName & lastName
	
	public String getfirstName() {
		return firstName;
	}
	
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Employee (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
