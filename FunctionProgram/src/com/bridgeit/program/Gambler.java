package com.bridgeit.program;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class Gambler {
	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter stake ");/*starting bankamt */
		 int stake=scanner.nextInt();
		 System.out.println("Enter goal ");/*desired bankamt */
		 int goal=scanner.nextInt();
		 System.out.println("Enter trials ");/*no.of time try  */
		 int trials=scanner.nextInt();
		 Utility.grambler(stake,goal,trials);
		
	}
		 
}
