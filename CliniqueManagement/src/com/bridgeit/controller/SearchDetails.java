package com.bridgeit.controller;

import java.util.Scanner;

public class SearchDetails {
	
    Scanner scanner=new Scanner(System.in);
    int choice;
	public void search() {
		System.out.println("Enter your choice");
		System.out.println("search Doctor by: \n1.id \n2.name \n3.specialization \n4.exit");
		choice=scanner.nextInt();
		switch(choice)
		{
		case 1:
			searchById();
			break;
			
		case 2:
			searchByName();
			break;
			
		case 3:
			searchBySpecialization();
			break;
			
		case 4:
			break;
			
		}
				
	}
	private void searchBySpecialization() {
		// TODO Auto-generated method stub
		
	}
	private void searchByName() {
		// TODO Auto-generated method stub
		
	}
	private void searchById() {
		// TODO Auto-generated method stub
		
	}

}
