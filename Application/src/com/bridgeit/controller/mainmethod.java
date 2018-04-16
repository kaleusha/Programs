package com.bridgeit.controller;

import java.util.Scanner;

public class mainmethod {
	
	public static void main(String[] args) throws InterruptedException {
		Scanner scanner=new Scanner(System.in);
		int choice;
		System.out.println("Enter your Choice: ");
		do {
		System.out.println(" \n1.add  \n2.printDetails \n3.viewStudent \n4.displayBook \n5.exit ");
		 choice=scanner.nextInt();
		 Manager manager=new Manager();
		 switch(choice)
		 {
		case 1:
			 manager.add();
			 break; 
			
		 case 2:
			 manager.printDetails();
				 break;
			 
		 case 3:
			 manager.viewStudent();
			
			 break; 
			 
		 case 4:
			 manager.displayBook();
			 break;
			 
		 case 5:
			 break;
		 }
		 
		}while(true);
		//scanner.close();
		
	}
	
	
}
