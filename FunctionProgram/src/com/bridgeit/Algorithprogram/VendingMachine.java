package com.bridgeit.Algorithprogram;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) 
	{
		int amount;
		int notes;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount=");
		amount = scanner.nextInt();
		
		/*if(amount%100 == 0)
		{
			System.out.println("Invalid amount");
		}
		else
		{*/
			if(amount >= 1000)
			{
			    notes = amount / 1000;
				amount = amount % 1000;
				System.out.println("No of 1000 notes="  +notes);
			}
			else if(amount >= 500)
			{
				notes = amount / 500;
				amount = amount % 500;
				System.out.println("No of 500 notes="  +notes);
			}
			 if(amount >= 100)
			{
				notes = amount / 100;
				amount = amount % 100;
				System.out.println("No of 100 notes="  +notes);
			}
			 if(amount >= 50)
			{
				notes = amount /50;
				amount = amount % 50;
				System.out.println("No of 50 notes= " +notes);
			}
			 if(amount >=10)
			{
				notes = amount /10;
				amount = amount % 10;
				System.out.println("No of 10 notes= " +notes);
			}
			 if(amount >=5)
			{
				notes = amount /5;
				amount = amount %5;
				System.out.println("No of 5 Rs coins= "+notes);
			}
		     if(amount >=2)
			{
				notes = amount/2;
				amount = amount%2;
				System.out.println("No of 2 Rs coins= " +notes);
			}
		    if(amount >=1)
			{
				notes = amount /1;
				amount = amount%1;
				System.out.println("No of 1 Rs coins= " +notes);
			}
			scanner.close();
			
		
	}		 

}
