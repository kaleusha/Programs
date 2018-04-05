/******************************************************************************
 *  Purpose: Clinic Management
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   17-03-2018
 ******************************************************************************/
package com.bridgeit.ObjectOriented;

import com.bridgeit.utility.Utility;

public class CliniqueManagement
{
	public static void main(String[] args) throws Exception {
	    Utility utility = new Utility();
	    int choice;
		while (true) {
			do {
			System.out.println("Enter 1 to Add Doctors");
			System.out.println("Enter 2 to Add Patients");
			System.out.println("Enter 3 to Search Doctor");
			System.out.println("Enter 4 to Search Patient by name");
			System.out.println("Enter 5 to Take an appoitment");
			System.out.println("Enter 6 display details");
			System.out.println("Enter 7 to Exit");
			choice =Utility.inputInteger();
			switch (choice) {
			case 1:
				utility.addDoctors();
				break;
			case 2:
				utility.addPatients();
				break;
			case 3:
				utility.searchDoctorm();
				break;
			case 4:
				utility.searchPatient();
				break;
			case 5:
				utility.takeAppointment1();
				break;
			case 6:
				utility.displayDoctorDetails();
				break;
			case 7:
				System.exit(0);
			default:
				System.out.println("Invalid case");

			}
			
		}while(choice<7);
		}
	}
		
	}