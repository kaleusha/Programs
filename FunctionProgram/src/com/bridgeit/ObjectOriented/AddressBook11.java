package com.bridgeit.ObjectOriented;

import com.bridgeit.utility.Utility;


public class AddressBook11 {
		public static void main(String[] args) {
			Utility utility = new Utility();

			try {
				
				while (true) {
					System.out.println("Enter your choice:");
					System.out.println("1. Add New Person");
					System.out.println("2. Delete Person");
					System.out.println("3. Edit Details");
					System.out.println("4. Sort");
					System.out.println("5. Display Details");
					System.out.println("6. Exit");
					int choice = utility.inputInteger();
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
				}
			} catch (Exception e) {
				e.getMessage();
			}
		}

}
