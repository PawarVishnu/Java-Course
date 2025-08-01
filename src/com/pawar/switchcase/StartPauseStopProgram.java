package com.pawar.switchcase;

import java.util.Scanner;

public class StartPauseStopProgram {

	public static void main(String[] args) {
		
		int action2 = 4;
		
		Scanner sc = new Scanner(System.in);
		
		String power = switch(action2) {
		
		case 1 -> "Start";
		case 2 -> "Pause";
		case 3 -> "Stop";
		default -> "Invalid Option";
		};
		
		System.out.println("Enter Action :"+power);
		
		sc.close();
	}

}
