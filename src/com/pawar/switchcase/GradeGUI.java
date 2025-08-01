package com.pawar.switchcase;

	import javax.swing.JOptionPane;

	public class GradeGUI {
	    public static void main(String[] args) {
	        String input = JOptionPane.showInputDialog("Enter your percentage:");
	        int percentage = Integer.parseInt(input);

	        int gradeGroup = percentage / 10;

	        String grade = switch (gradeGroup) {
	            case 10, 9 -> "A";
	            case 8 -> "B";
	            case 7 -> "C";
	            case 6 -> "D";
	            case 5 -> "E";
	            case 4, 3, 2, 1, 0 -> "F";
	            default -> "Invalid Percentage";
	        };

	        JOptionPane.showMessageDialog(null, "You got Grade: " + grade);
	    }
	}


