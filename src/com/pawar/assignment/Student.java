package com.pawar.assignment;

public class Student {

	int studentId;
	String studentName;
	int studentMarks;
	char studentGrade;
	
	public void setStudentData(int Id, String name, int marks) 
	{
	
		studentId = Id;
		studentName = name;
		studentMarks = marks;
		claculetGrade();
		
	}
	
	public void displayDetails()
	{
		System.out.println("Student [ name="+studentName+", studentId="+studentId+", marks="+studentMarks+", grade="+studentGrade+"]");
	}
	
	public void claculetGrade()
	{
		
		if(studentMarks > 90) 
		{
			studentGrade = 'A';
		}
		else if (studentMarks <= 90 && studentMarks >= 81) 
		{
			studentGrade = 'B';
		}
		else if(studentMarks <= 80 && studentMarks >= 71) 
		{
			studentGrade = 'C';
		}
		else if(studentMarks <= 70 && studentMarks >= 61) 
		{
			studentGrade = 'D';
		}
		else 
		{
			studentGrade = 'E';
		}
	}
}
