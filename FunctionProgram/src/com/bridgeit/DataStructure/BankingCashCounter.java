package com.bridgeit.DataStructure;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class BankingCashCounter
{
	public static void main(String[] args) 
	{
		
		Utility utility=new Utility();
		int ch;
		BankingQueueStructure qs=new BankingQueueStructure();
		do {
			System.out.println("\n1.For enter to Queue\n2.Procede with Transaction");
			System.out.println("Enter choice");
			 ch=utility.inputInteger();
			if(ch==1)
		    qs.add();
			if(ch==2&&qs.empty())
				System.out.println("First Enter into Queue");
		
		
			int option;
		if(ch==2)
		{
			do
			{
		     System.out.println("Select your operation in Bank \n1.Deposite \n.2 WithDraw \n3.Check Balance \n4.Exit ");
		     System.out.println("Enter option");
		      option =utility.inputInteger();
		
		switch (option)
		{
		case 1:
			    System.out.println("Enter the amount to deoposite");
			    double amunt=utility.hashCode();
			    qs.exit();
			    Utility.enqueue(amunt);
			    break;
		
		case 2:
			   System.out.println("Enter the amount to withdraw");
			   double amuntw=utility.hashCode();
			   qs.exit();
			   Utility.dequeue(amuntw);
			   break;
		
		case 3:
			   Utility.checkbalance();
			   break;
			   
		case 4:
			//qs.add();
			  System.exit(option);
			  
		
		
	  default:
		      System.out.println("Invalid choice");
			}
			
			}while(option<4);
		}
		}while(ch<3);
			
	}

}