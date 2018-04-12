package com.bridgeit.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DisplayMethods {
	Scanner scanner=new Scanner(System.in);
	int choice;

	public void display() throws IOException {
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

	public void appointmentDetails() throws IOException {
		File file = new File("/home/bridgeit/Programs/CliniqueManagement/files/appointment.json");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String line;
		while((line = bufferedReader.readLine()) != null)
		{
		    System.out.println(line);
		}bufferedReader.close();
	}

	public void patientDetails() throws IOException {
		File file = new File("/home/bridgeit/Programs/CliniqueManagement/files/patients.json");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String line;
		while((line = bufferedReader.readLine()) != null)
		{
		    System.out.println(line);
		}
		bufferedReader.close();
	}
		
	public void doctorDetails() throws IOException {
		File file = new File("/home/bridgeit/Programs/CliniqueManagement/files/doctor.json");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String line;
		while((line = bufferedReader.readLine()) != null)
		{
		    System.out.println(line);
		}
		bufferedReader.close();
	}

}
