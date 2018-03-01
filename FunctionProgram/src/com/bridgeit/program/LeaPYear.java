package com.bridgeit.program;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class LeaPYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year");

		int year = scanner.nextInt();
		Utility.leapYear(year);

	}

}
