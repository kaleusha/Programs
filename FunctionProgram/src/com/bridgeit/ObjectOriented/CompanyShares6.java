/******************************************************************************
 *  Purpose: Maintain the List of CompanyShares
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   15-03-2018
 ******************************************************************************/
package com.bridgeit.ObjectOriented;

import com.bridgeit.DataStructure.LinkedListStructure;
import com.bridgeit.utility.Utility;

public class CompanyShares6 {
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		LinkedListStructure list = new LinkedListStructure();
	    System.out.println(); System.out.println("********* Company Shares ********");
	    while(true) {
			System.out.println("1. add the shares");
			System.out.println("2. remove the shares");
			System.out.println("3. Display the shares");
			System.out.println("4. total shares");
			System.out.println("5. Exit");
			int choice = Utility.inputInteger();          
			switch (choice)
			{
			case 1 :
				System.out.println("enter position ");
				int pos=Utility.inputInteger();
				System.out.println("Enter element to insert");
				int data=Utility.inputInteger();
				list.insert(pos,data);
				break;      
	
			case 2 : 
				System.out.println("Enter position");
				int position = Utility.inputInteger();
				list.removeAt(position);
				System.out.println("remove successfuly");
				break;
				
			case 3:
				System.out.print("Shares are: ");
				list.printlist();
			
				break;                  
			case 4 : 
				System.out.println("Size = "+ list.size() +" \n");
				break;   
			case 5: System.exit(0);
			default : 
				System.out.println("Wrong Entry \n ");
				break;   
			}

	}  
	}


}
