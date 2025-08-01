package com.pawar.assignment;

public class Employee {

	
	String firstName;
	String lastName;
	int employeeId;
	double Salary;
	int noOfProject;
	
	public void setEmployeeData(String fname, String lname, int Id, double salary, int noofproject )
	{
		firstName = fname;
		lastName = lname;
		employeeId = Id;
		Salary = salary;
		noOfProject = noofproject;
		calculateSalary();
		
	}
	
	public void displayDetails()
	{
		System.out.println("Employee first Name :"+firstName);
		System.out.println("Employee last Name :"+lastName);
		System.out.println("Employee Id  :"+employeeId);
		System.out.println("Employee salary :"+Salary);
		System.out.println("Employee noOfProject:"+noOfProject);
	}
	
	public void calculateSalary()
	{
		if(noOfProject > 5 && noOfProject < 10){
			Salary += 5000;
		}
		else if(noOfProject > 10 && noOfProject < 20) {
			Salary += 10000;
		}
		else if(noOfProject > 20)
		{
			Salary += 15000;
		}
	}
	
}
