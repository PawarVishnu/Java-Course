package com.pawar.blc;

public class Employee {
	
	private int employeeNumber;
	private String employeeName;
	private double employeeSalary;
	
	
	public void setEmployeeDetails(int employeeNumber, String employeeName, double employeeSalary)
	{
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		calculateSalaryIncrement();
		getEmployeeDetails();
	}
	
	public void calculateSalaryIncrement()
	{
		double increment;
		double update;
		
		if(employeeSalary <= 50000)
		{
			increment = employeeSalary / 10 ;
			update = employeeSalary + increment; 
			System.out.println("Salary increment amount :"+ increment);
		}
		else if(employeeSalary >= 50000 && employeeSalary <= 80000)
		{
			increment = employeeSalary / 7 ;
			update = employeeSalary + increment;
			System.out.println("Salary increment amount :"+ increment);
		}
		else
		{
			increment = employeeSalary / 5 ;
			update = employeeSalary + increment; 
			System.out.println("Salary increment amount :"+ increment);
		}
		
		System.out.println("After increment, Updated salary :" + update );
		employeeSalary = update;
	}
	
	public void getEmployeeDetails()
	{
		
		System.out.println("[Employee Number :"+employeeNumber+", Employee Name :"+employeeName+", Employee Salary :"+employeeSalary+"]");
	}
	
}
