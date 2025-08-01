package com.pawar.switchcase;

import java.util.Scanner;

public class OddOrEvenNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number :");
		
		int num = sc.nextInt();
		
		
		
		int remainder = num % 2 ;
		
		String calculate = switch(remainder) {
		 
		case 0 -> "Even";
		case 1 -> "Odd";
		
		
		default -> "This is not a Number";
		};
				System.out.println("num"+ " is "+calculate);
				sc.close();
	}

}
