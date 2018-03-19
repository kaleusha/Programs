/******************************************************************************
 *  Purpose: Clinic Management
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   17-03-2018
 ******************************************************************************/
package com.bridgeit.ObjectOriented;

import com.bridgeit.utility.Utility;

public class CliniqueManagement {
	public static void main(String[] args) 
	{
		try
		{
			Utility utility=new Utility();
			while(true)
			{	
				System.out.println("Enter your choice:");
				System.out.println("1. Add Doctor.");
				System.out.println("2. Add Patient.");
				System.out.println("3. Display Details.");
				System.out.println("4. Fix Appointments.");
				System.out.println("5. Appointment Details.");
				System.out.println("6. Exit");
				int choice = Utility.inputInteger();
				switch(choice)
				{
				case 1 :	
					Utility.addDoctor();
				    break;
				case 2 :	
					Utility.addPatient();
				    break;
				case 3 :	 
					System.out.println("Enter D for doctor and P for Patient ");
					char ch = Utility.inputString().charAt(0);
					if(ch=='D')
					{
						Utility.doctorsDetails();
					}
					if(ch=='P')
					{
						Utility.patientDetails();
					}
				    break;
				case 5 	:	
					utility.appointmentDetails();
				    break;
				case 4: 	
					utility.fixAppointment();
				    break;
				default : 
					return;
				}
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
