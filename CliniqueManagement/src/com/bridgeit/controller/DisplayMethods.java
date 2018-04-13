/******************************************************************************
 *  Purpose: Display Details of doctor,Patient and take Appointment
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   13-04-2018
 ******************************************************************************/
package com.bridgeit.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgeit.pojo.Doctor;

public class DisplayMethods {
	Scanner scanner=new Scanner(System.in);
	
	ObjectMapper objectMapper=new ObjectMapper(); 

	/**
	 * @throws IOException
	 */
	public void display() throws IOException {
	
		boolean status=true;
		while(status)
	    {
		System.out.println("\n1.display Doctor Details \n2.display Patient details \n3.appointment details \n4.exit");
		System.out.println("Enter your choice: ");
		int choice=scanner.nextInt();
		
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
			status=false;
			break;
		}
		}
	}

	/**
	 * Purpose:Display Appointment Details
	 * 
	 * @throws IOException
	 */
	public void appointmentDetails() throws IOException {
		File file = new File("/home/bridgeit/Programs/CliniqueManagement/files/appointment.json");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String line;
		while((line = bufferedReader.readLine()) != null)
		{
		    System.out.println(line);
		}bufferedReader.close();
	}

	/**
	 * Purpose:Display Patient Details
	 * 
	 * @throws IOException
	 */
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
		
	/**
	 * Purpose:Display doctor Details
	 * 
	 * @throws IOException
	 */
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

	
	/**
	 * Purpose:Display Famous Doctor
	 * 
	 */
	public void famousDoctor() {
		List<Doctor> doctorList = new ArrayList<>();
		Doctor doctor = new Doctor();
		try
		{
			File file = new File("/home/bridgeit/Programs/CliniqueManagement/files/doctor.json");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String arrayToJson;
			if((arrayToJson = reader.readLine()) != null)
			{
				TypeReference<ArrayList<Doctor>> type = new TypeReference<ArrayList<Doctor>>() {};
				doctorList = objectMapper.readValue(arrayToJson, type);
				
			}reader.close();
		System.out.println("Popular Doctors are");
		Iterator<Doctor>iterator=doctorList.iterator();
		while(iterator.hasNext())
		{
			doctor=(Doctor) iterator.next();
			if(doctor.getNoOFPatients()==5)
			{
				System.out.println(doctor);
			}
		}
		
	}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	

}
