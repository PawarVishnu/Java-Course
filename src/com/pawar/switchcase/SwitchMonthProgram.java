package com.pawar.switchcase;

import java.util.Scanner;

public class SwitchMonthProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Month (1 to 12):");
		
		int month = sc.nextInt();
		
		 String Seasson = switch(month) {
		case 12,1,2 ->{
			
			System.out.print("This season is :");
			yield "Winter";
			
		}
		case 3,4,5 ->{
			 
			System.out.print("This season is :");
			yield "Spring";
		}
		case 6,7,8 ->{
			 
			System.out.print("This season is :");
			yield "Summer";
		}
		case 9,10,11 ->{
			 
			System.out.print("This season is :");
			yield "Autumn";
		}
		default -> "this is not a month";
		};
		System.out.println(Seasson);
		sc.close();
	}

}
