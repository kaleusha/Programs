package com.bridgeit.program;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class PrimeFactors {
	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any Number to find Prime Factors "); 
		int number=scanner.nextInt();
		
		Utility.primeFactor(number);
		 
		       // if (number < 1) System.out.println(number);
    }
		 
	

}
