package com.pawar.switchcase;

import java.util.Scanner;

public class DayNameByNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number (1 to 7):");
		
		int days = sc.nextInt();
		
		String day = switch(days) {
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		case 7 -> "Sunday";
		default -> "Invalid Input";
		};
		
		System.out.println(day);
		
		sc.close();
	}

}
