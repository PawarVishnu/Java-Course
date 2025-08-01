package com.pawar.assignment;

import java.util.Scanner;

public class Tester {

	public static void main(String [] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Enter Employee First Name :");
		String Fname = sc.nextLine();
		
		System.out.print("Enter Employee Last Name :");
		String Lname = sc.nextLine();
		
		System.out.print("Enter Employee Id :");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter Employee salary :");
		double sal = Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter Employee noofproject :");
		int Noofproject = Integer.parseInt(sc.nextLine());
		
		
		emp.setEmployeeData(Fname, Lname, id, sal, Noofproject);
		emp.calculateSalary();
		emp.displayDetails();
		
		sc.close();
	}
}
