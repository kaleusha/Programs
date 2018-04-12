package com.bridgeit.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgeit.pojo.Appointment;
import com.bridgeit.pojo.Doctor;
import com.bridgeit.pojo.Patient;


public class AddDetails {
	
	Scanner scanner=new Scanner( System.in);
	ObjectMapper objectMapper = new ObjectMapper();
	List<Doctor> doctorlist=new ArrayList<>();
	List<Patient> patientlist=new ArrayList<>();
	List<Appointment> appoinmentList=new ArrayList<>();
	Doctor doctor=new Doctor();
	public void add() throws JsonGenerationException, JsonMappingException, IOException {
		
		int choice;
		System.out.println("Enter Your Choice: ");
		do {
		System.out.println("\n1.addPatient \n2.addDoctor \n3.takeAppointment  \n4.exit");
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
			break;
		}
		}while(choice<4);
		
	

	
	}
	private void takeAppointment() throws JsonParseException, JsonMappingException, IOException {
        String doctorName;
        boolean flag;
        DisplayMethods display=new DisplayMethods();
        display.doctorDetails();
        Patient patient = new Patient();
        File fileAppontment = new File("/home/bridgeit/Programs/CliniqueManagement/files/appointment.json");
        Appointment appoinment = new Appointment();
        System.out.println("Please enter Patient_Name");
		String patient_name = scanner.next();
		System.out.println("Enter the date for appointment");
		String stringDate = scanner.next();
		System.out.println("Enter Doctor name for to take an Appointment");
		String doctername = scanner.next();
        
        String doctorInfo = null;
		try {
		//JSONArray array = (JSONArray) parser.parse(new FileReader(file));
		Iterator iterator = appoinmentList.iterator();

		
		while (iterator.hasNext()) {
		//JSONObject jsonobject = (JSONObject) iterator.next();
		if (doctorName.equals(doctor.getName())) {

		System.out.println("Doctor_founded" + doctorName);

		}

		flag = false;
		}
		doctorInfo = doctorName;
		HashMap<Appointment, Doctor> hashMap=new HashMap<>();
		
		if ((hashMap.containsKey(doctorName)) && (appoinmentList.size() < 5)) {

			hashMap.put("Doctorname", doctorName);

			hashMap.put("Patient_Name", patient_name);
			doctor.put("Booking Date ", (stringDate));
			appoinmentList.add(doctor);
		   // jsonobject.put("Doctor_name", appoinmentList);
		   /* FileWriter filewriter = new FileWriter("/home/bridgeit/Programs/files/Appointment.json");
		    filewriter.write(JSONObject.toJSONString(jsonobject));
		    filewriter.flush();
		    filewriter.close();*/
		}
		System.out.println("hello " + patient_name + " Your Appointment is fixed With Doctor " + doctorInfo + " on: "
		+ (stringDate));

		} catch (IOException e) {
		System.out.println("exception");
		}
        
       /*/*System.out.println("Enter doctor name to take appoinment ");
        doctorName = scanner.next();
        
        System.out.println("Enter the appoinment date: ");
        String date = scanner.next();
        appoinment.setDate(date);
        *  try
        {
        	File file = new File("/home/bridgeit/Programs/CliniqueManagement/files/doctor.json");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String arrayToJson;
            if((arrayToJson = reader.readLine()) != null)
            {
                TypeReference<ArrayList<Doctor>> type = new TypeReference<ArrayList<Doctor>>() {};
                doctorlist = objectMapper.readValue(arrayToJson, type);
                
            }reader.close();
            
            //System.out.println(doctorList);
            for(int i=0;i<doctorlist.size();i++)
            {
                doctor = doctorlist.get(i);
                if(doctorName.equals(doctor.getName()))
                {
                    if(doctor.getNoOFPatients()!=0)
                    {
                        patient = addPatient();
                        System.out.println("hii");
                        doctor.setNoOFPatients(1);    
                        appoinment.setDoctorName(doctorName);
                        appoinment.setPatient(patient);
                        appoinmentList.add(appoinment);
                        
                        objectMapper.writeValue(fileAppontment, appoinmentList);
                        System.out.println("fix appointment");
                    }
                    else if(doctor.getNoOFPatients()>0 && doctor.getNoOFPatients()<5)
                    {
                
                        patient = addPatient();
                        System.out.println("xyz");
                        //appoinmentList=appoinment.get(doctor.toString()); 
                        //appointments.remove(doctor.toString());
                        doctor.setNoOFPatients(doctor.getNoOFPatients()+1);
                        appoinment.setPatient(patient);
                        appoinmentList.add(appoinment);
                        objectMapper.writeValue(fileAppontment, appoinmentList);
                    }
                    else
                    {
                        System.out.println("Doctor with name="+doctorName+" is Not Available");
                    }
                }*/
            
        }
        
    }catch(IOException e)
        {
        e.printStackTrace();
        }
		
	}

	private void addDoctor() throws JsonGenerationException, JsonMappingException, IOException {
		
		File file = new File("/home/bridgeit/Programs/CliniqueManagement/files/doctor.json");
		BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
		String jsonarray;
	
		if((jsonarray=bufferedReader.readLine()) != null)
		{
			System.out.println(jsonarray);
			TypeReference<ArrayList<Doctor>> typeReference=new TypeReference<ArrayList<Doctor>>() {};
			doctorlist=objectMapper.readValue(jsonarray,typeReference);
			System.out.println(doctorlist);	
			
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
		System.out.println(doctorlist);
		
	}

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
			System.out.println(patientlist);	
			
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
		System.out.println(patientlist);
		
		return patient;

	}
}
