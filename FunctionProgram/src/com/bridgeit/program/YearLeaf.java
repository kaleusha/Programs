package com.bridgeit.program;

import java.util.Scanner;

public class YearLeaf {
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year ");
		int year = scanner.nextInt();
		
		if ((year % 4 == 0) && (year % 100 != 0)) {
			System.out.println("This is leap year");
		} else if (year % 100 == 0) {
			System.out.println("This is not leap year");
		} else if (year % 400 == 0) {
			System.out.print("This is a Leap Year");
		} else {
			System.out.print("This is not a Leap Year");
		}
	}

}
