/******************************************************************************
 *  Purpose: Design Simple Address Book Problem
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   19-03-2018
 ******************************************************************************/
package com.bridgeit.ObjectOriented;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgeit.utility.Utility;


public class AddressBook {
		public static void main(String[] args) {
			Utility utility = new Utility();
			int choice=0;
			do {
				
					System.out.println("Enter your choice:");
					System.out.println("1. Add New Person");
					System.out.println("2. Delete Person");
					System.out.println("3. Edit Details");
					System.out.println("4. Sort");
					System.out.println("5. Display Details");
					System.out.println("6. Exit");
					 choice = Utility.inputInteger();
					try {
						switch (choice) {
						case 1:
							utility.addPerson();
							break;
						case 2:
							utility.deletePerson();
							break;
						case 3:
							utility.editDetails();
							break;
						case 4:
							utility.sort();
							break;
						case 5:
							utility.displayDetails();
							break;
						default:
							return;
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}while(choice<6);
		}
		
			
}


