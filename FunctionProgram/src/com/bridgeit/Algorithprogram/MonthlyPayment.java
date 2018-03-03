package com.bridgeit.Algorithprogram;

import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter The Value Of principal");
		int P=scanner.nextInt();
		System.out.println("Enter The Value Of Rate");
		double R=scanner.nextInt();
		System.out.println("Enter the Year");
		int Y=scanner.nextInt();
		int n=12*Y;
		double r=R/(12*100);
		double payment=(P*r)/(1-Math.pow((1+r), (-1)));
		System.out.println("Monthly Payment Is: "+payment );
	}

}
