package com.bridgeit.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;

import com.bridgeit.pojo.Doctor;
import com.bridgeit.pojo.Patients;

public class AddDetails {
	Scanner scanner=new Scanner( System.in);

	public void add() {
		
		int choice;
		System.out.println("Enter Your Choice: ");
		do {
		System.out.println("\n1.addPatient \n2.addDoctor \n3.takeAppointment \n4.save \n5.exit");
		choice=scanner.nextInt();
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
			
		case 4:
			save();
			break;
			
		case 5:
			break;
		}
		}while(choice<4);
		
	

	
	}

	private void save() {
		ArrayList< > List=AddressBookImpl.arraylist;
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		System.out.println(file);
		
		objectMapper.writeValue(new FileOutputStream(file),List);
		System.out.println("Save Successfully.");
		
	}

	private void takeAppointment() {
		System.out.println("Enter name of doctor");
		String name = scanner.next();
		System.out.println("Enter Specialization of doctor");
		String specilization = scanner.next();
		
	}

	private void addDoctor() {
		
		ArrayList<Doctor> arrayList=new ArrayList<Doctor>();
		Doctor doctor=new Doctor();
		File file = new File("/home/bridgeit/Programs/CliniqueManagement/files/doctor.json");
		System.out.println("Enter name of doctor");
		String name = scanner.next();
		System.out.println("Enter I.D doctor");
		String id = scanner.next();
		System.out.println("Enter Specialization of doctor");
		String specilization = scanner.next();
		System.out.println("Enter Availablity of doctor");
		String available = scanner.next();
		doctor.getId();
		doctor.getName();
		doctor.getSpecialization();
		doctor.getAvailability();
		doctor.getNoOFPatients();
		arrayList.add(doctor);	
	}

	private void addPatient() {
		ArrayList<Patients> arrayList1=new ArrayList();
		Patients patients=new Patients();
		File file = new File("/home/bridgeit/Programs/CliniqueManagement/files/patients.json");
		System.out.println("Enter name of patient");
		String name = scanner.next();
		System.out.println("Enter I.D patients");
		String id = scanner.next();
		System.out.println("Enter mobile number of patients");
		String mobilenumber = scanner.next();
		System.out.println("Enter Availablity of doctor");
		String available = scanner.next();
		patients.getId();
		patients.getName();
		patients.getMobileNumber();
		patients.getAge();
		
		arrayList1.add(patients);	
		
	}

}
