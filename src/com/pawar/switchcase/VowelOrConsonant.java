package com.pawar.switchcase;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Alphabet:");
		
		char charecter = sc.next().charAt(0);
		
		String Alphabet = switch(charecter) {
		
		case 'a','e','i','o','u' ->{
			yield "Vowel";
		}
		
		case 'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z' ->{
			yield "Consonant";
		}
		
		default -> "Not An Alphabet";
		};
		
		System.out.println(Alphabet);
		
		sc.close();
		
	}

}
