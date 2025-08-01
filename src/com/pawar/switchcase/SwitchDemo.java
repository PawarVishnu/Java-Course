package com.pawar.switchcase;

public class SwitchDemo {

	public static void main(String[] args) {

		int temp1 = 40;
		
		String weather = switch(temp1) 
		{
		
		case 40 -> {
			System.out.println("hello");
			yield "first";
		}
		default -> "other";
		};
		
		System.out.println("enter weather :"+weather);

	}

}
