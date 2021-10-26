package com.cg.oct12.batch3.day5;
//Encapsulation - 
//bind data members with methods 
//to secure data 
//make fields as private 
//make public methods to access those fields 

public class Employee {

	private int eid;
	private String firstName;
	private double salary = 8000; // read-only field
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	}
