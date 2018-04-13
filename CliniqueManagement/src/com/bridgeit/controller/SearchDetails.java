/******************************************************************************
 *  Purpose: Search doctor by id ,name and specialization
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   12-04-2018
 ******************************************************************************/
package com.bridgeit.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgeit.pojo.Doctor;

public class SearchDetails {
	ObjectMapper objectMapper = new ObjectMapper();
    Scanner scanner=new Scanner(System.in);
    List< Doctor> doctors=new ArrayList<>();
    File file = new File("/home/bridgeit/Programs/CliniqueManagement/files/doctor.json");
    Doctor doctor=new Doctor();
    int choice;
	public void search() {
		System.out.println("Enter your choice");
		do {
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
		}while(choice<4);
				
	}
	/**
	 * Purpose:Search Doctor by Specialization
	 * 
	 */
	private void searchBySpecialization() {
		readFile();
		System.out.println("Enter the doctor Specialization to search doctor: ");
	    String doctorName = scanner.next();
		for(int i=0; i <doctors.size();i++)
		{
			doctor = doctors.get(i);
			if(doctorName.equals(doctor.getSpecialization()))
			{
				System.out.println(doctor);
				System.out.println("doctor avilable");
				break;
			}
			else {
				System.out.println("No doctor avilable.");
			}

		}
		
	}
	/**
	 * Purpose:Search Doctor by name
	 * 
	 */
	private void searchByName() {
		readFile();
		System.out.println("Enter the doctor name to search doctor: ");
	    String doctorName = scanner.next();
		for(int i=0; i <doctors.size();i++)
		{
			doctor = doctors.get(i);
			if(doctorName.equals(doctor.getName()))
			{
				System.out.println(doctor);
				System.out.println("doctor avilable");
				break;
			}
			else {
				System.out.println("No doctor avilable.");
			}

		}
		
	}
		
	/**
	 * Purpose:Search Doctor by id
	 * 
	 */
	private void searchById() {
		
		readFile();
		System.out.println("Enter the doctor id to search doctor: ");
		int doctorId = scanner.nextInt();
		for(int i=0; i <doctors.size();i++)
		{
			doctor = doctors.get(i);
			if(doctorId==(doctor.getId()))
			{
				System.out.println(doctor );
				System.out.println("doctor avilable");
				break;
			}
			else {
				System.out.println("No doctor avilable.");
			}

		}
		
		
	}
	/**
	 * Purpose:Read file
	 * 
	 */
	private void readFile() {
		try
		{
			
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			if((line = reader.readLine()) != null)
			{
				TypeReference<ArrayList<Doctor>> type = new TypeReference<ArrayList<Doctor>>() {};
				doctors = objectMapper.readValue(line, type);
				
			}System.out.println(doctors);
			reader.close();
		
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
