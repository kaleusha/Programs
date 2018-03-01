package com.bridgeit.program;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class Sum3Integers {
	
	
	public static void main(String[] args) {
		
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter number of Elements in array");
	    int number=scanner.nextInt();
	    int array[]=new int [number];
	    System.out.println("Enter Array Elements:");
	    for(int i=0;i<number;i++) 
	    {
	    	array[i]=scanner.nextInt();
	    }
	    
	     Utility.sumOf3Int(array,number);
	}
	
}
