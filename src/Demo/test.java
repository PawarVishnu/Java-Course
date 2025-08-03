package Demo;

import java.util.Scanner;

public class test {
	
	public static void main (String [] args ) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Student Full Name :");
		
		String name = sc.nextLine();
		
		System.out.print("enter your gender male/female :");
		
		char gender = sc.next().charAt(0);

		System.out.println("full name of the Student :" + name);
		
		System.out.println("Student Gender :" + gender);
		
		sc.close();
	}

}
