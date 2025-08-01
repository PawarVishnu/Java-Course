package com.pawar.elc;

import com.pawar.blc.Employee;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee raj = new Employee();
		raj.setEmployeeDetails(202, "Mr. Raj", 50000);
		System.out.println("----------------------------------------------------------------\n");
		
		raj.setEmployeeDetails(102, "Mr. pawar", 80000);
		System.out.println("----------------------------------------------------------------\n");
		
		raj.setEmployeeDetails(125, "Mr.Ramesh", 90000);
		System.out.println("----------------------------------------------------------------\n");
		
		
	

	}

}
