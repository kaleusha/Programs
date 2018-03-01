package com.bridgeit.program;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) 
	{
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter Value of x "); 
		 int x=scanner.nextInt();
		 System.out.println("Enter Value of y "); 
		 int y=scanner.nextInt();
		 double distance;
		 distance=Math.sqrt((x*x)+(y*y));
		 System.out.println(distance);
		 
		 
	}

}
