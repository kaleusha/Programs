package com.bridgeit.controller;

import java.util.Scanner;

public class DisplayMethods {
	Scanner scanner=new Scanner(System.in);
	int choice;

	public void display() {
		System.out.println("Enter your choice: ");
		System.out.println("\n1.display Doctor Details \n2.display Patient details \n3.appointment details \n4.exit");
		choice=scanner.nextInt();
		switch(choice)
		{
		case 1:
			doctorDetails();
			break;
			
		case 2:
			patientDetails();
			break;
			
		case 3:
			appointmentDetails();
			break;
			
		case 4:
			break;
		}
		
		

		
	}

	private void appointmentDetails() {
		// TODO Auto-generated method stub
		
	}

	private void patientDetails() {
		// TODO Auto-generated method stub
		
	}

	private void doctorDetails() {
		// TODO Auto-generated method stub
		
	}

}
