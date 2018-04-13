/******************************************************************************
 *  Purpose: Add doctor,Patient and take Appointment
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
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;


import com.bridgeit.pojo.Appointment;
import com.bridgeit.pojo.Doctor;
import com.bridgeit.pojo.Patient;


public class AddDetails {
	
	Scanner scanner=new Scanner( System.in);
	ObjectMapper objectMapper = new ObjectMapper();
	List<Doctor> doctorlist=new ArrayList<>();
	List<Patient> patientlist=new ArrayList<>();
	List<Appointment> appoinmentList=new ArrayList<>();
	DisplayMethods display=new DisplayMethods();
	Doctor doctor=new Doctor();
	public void add() throws JsonGenerationException, JsonMappingException, IOException {

	    boolean flag=true;
		System.out.println("Enter Your Choice: ");
		while(flag)
		{
		System.out.println("\n1.addPatient \n2.addDoctor \n3.takeAppointment  \n4.exit");
		int choice=scanner.nextInt();
		switch(choice)
		{
		case 1:
			addPatient();
			break;
		
		case 2:
			addDoctor();
			break;
			
		case 3:
			takeAppointment();
			break;
			
		
		case 4:flag=false;
			break;
		}
		}
	

	
	}
	/**
	 * Purpose:Take Appointment from Doctor
	 *  
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	private void takeAppointment() throws JsonParseException, JsonMappingException, IOException {
		display.doctorDetails();
		File appoinmentFile = new File("/home/bridgeit/Programs/CliniqueManagement/files/appointment.json");		
		try
		{
		BufferedReader bufferreader = new BufferedReader(new FileReader(appoinmentFile));
		String line;
		if((line = bufferreader.readLine()) != null)
		{
			TypeReference<ArrayList<Appointment>> type = new TypeReference<ArrayList<Appointment>>() {};
			appoinmentList = objectMapper.readValue(line, type);
			
		}bufferreader.close();
		Patient patient = new Patient();
	
		Appointment appoinment = new Appointment();
				File file = new File("/home/bridgeit/Programs/CliniqueManagement/files/doctor.json");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String arrayToJson;
			if((arrayToJson = reader.readLine()) != null)
			{
				TypeReference<ArrayList<Doctor>> type = new TypeReference<ArrayList<Doctor>>() {};
				doctorlist = objectMapper.readValue(arrayToJson, type);
				
			}reader.close();
			System.out.println("Enter doctor name to take appoinment ");
			String doctorName = scanner.next();
			
			System.out.println("Enter the appoinment date: ");
			String date = scanner.next();
			appoinment.setDate(date);
			

			for(int i=0;i<doctorlist.size();i++)
			{
				doctor = doctorlist.get(i);
				if(doctorName.equals(doctor.getName()))
				{
					if(doctor.getNoOFPatients()==0)
					{
						patient = addPatient();
						doctor.setNoOFPatients(1);	
						objectMapper.writeValue(file, doctorlist);
						appoinment.setDoctorName(doctorName);
						appoinment.setPatient(patient);
						appoinmentList.add(appoinment);
						
						objectMapper.writeValue(appoinmentFile, appoinmentList);
					}
					else if(doctor.getNoOFPatients()>0 && doctor.getNoOFPatients()<5)
					{
				
						patient = addPatient();
						doctor.setNoOFPatients(doctor.getNoOFPatients()+1);
						objectMapper.writeValue(file, doctorlist);
						appoinment.setDoctorName(doctorName);
						appoinment.setPatient(patient);
						appoinmentList.add(appoinment);
						objectMapper.writeValue(appoinmentFile, appoinmentList);
					}
					else
					{
						System.out.println("Doctor with name="+doctorName+" is Not Available");
					}
				}
			
			}
		
	}catch(IOException e)
		{
		e.printStackTrace();
		}
	
		
	}

	/**
	 * Purpose:Add Doctor 
	 * 
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	private void addDoctor() throws JsonGenerationException, JsonMappingException, IOException {
		
		File file = new File("/home/bridgeit/Programs/CliniqueManagement/files/doctor.json");
		BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
		String jsonarray;
		if((jsonarray=bufferedReader.readLine()) != null)
		{
			System.out.println(jsonarray);
			TypeReference<ArrayList<Doctor>> typeReference=new TypeReference<ArrayList<Doctor>>() {};
			doctorlist=objectMapper.readValue(jsonarray,typeReference);
			
			
		}bufferedReader.close();
		System.out.println("Enter name of doctor");
		String name = scanner.next();
		System.out.println("Enter I.D doctor");
		int id = scanner.nextInt();
		System.out.println("Enter Specialization of doctor");
		String specilization = scanner.next();
		System.out.println("Enter Availablity of doctor");
		String available = scanner.next();
		doctor.setId(id);
		doctor.setName(name);
		doctor.setSpecialization(specilization);
		doctor.setAvailability(available);
		doctorlist.add(doctor);
		objectMapper.writeValue(file,doctorlist);
		System.out.println("doctor added");
		
	}

	/**
	 * Purpose:Add Patient 
	 * 
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	private Patient addPatient() throws JsonGenerationException, JsonMappingException, IOException {
		
		Patient patient=new Patient();
		File file = new File("/home/bridgeit/Programs/CliniqueManagement/files/patients.json");
		BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
		String jsonarray;
	
		if((jsonarray=bufferedReader.readLine()) != null)
		{
			System.out.println(jsonarray);
			TypeReference<ArrayList<Patient>> typeReference=new TypeReference<ArrayList<Patient>>() {};
			patientlist=objectMapper.readValue(jsonarray,typeReference);
			
		}bufferedReader.close();
		System.out.println("Enter name of patient");
		String name = scanner.next();
		System.out.println("Enter I.D patients");
		int id = scanner.nextInt();
		System.out.println("Enter mobile number of patients");
		long mobilenumber = scanner.nextLong();
		System.out.println("Enter age of patient");
		int age = scanner.nextInt();
		patient.setId(id);
		patient.setName(name);
		patient.setMobileNumber(mobilenumber);
		patient.setAge(age);
		patientlist.add(patient);	
		
		objectMapper.writeValue(file,patientlist);
		System.out.println("patient added");
		
		return patient;

	}
}
