package com.pawar.switchcase;

import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Marks :");
		
		int Marks = sc.nextInt();
		
		int Percentege = Marks / 10; 
		
		String grade = switch(Percentege) {
		
		case 9,10 -> {
			yield "A";
			
		}
		
		case 8 -> {
			yield "B";
			
		}
		
		case 7 -> {
			
			yield "C";
			
		}
		
		case 6 -> {
			yield "D";
			
		}
		
		case 5 -> {
			yield "E";
			
		}
		
		case 4 -> {
			yield "F";
			
		}
		
		default -> "Fail";
		};
		
		System.out.println("the grade is :"+grade);
		
		sc.close();

	}

}
