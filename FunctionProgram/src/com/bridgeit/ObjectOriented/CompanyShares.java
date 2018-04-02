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

public class CompanyShares {
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		LinkedListStructure list = new LinkedListStructure();
	    System.out.println("********* Company Shares ********");
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
				
				System.out.println("Enter share amount to insert");
				int data=Utility.inputInteger();
				list.add(data);
				System.out.println("Add successfuly");
				System.out.println(list);
				break;      
	
			case 2 : 
				System.out.println("Enter share to remove ");
				int data1 = Utility.inputInteger();
				list.remove(data1);
				System.out.println("remove successfuly");
				System.out.println(list);
				break;
				
			case 3:
				System.out.print("Shares are: ");
				list.printlist();
			
				break;                  
			case 4 : 
				System.out.println("Size = "+ list.size() +" \n");
				break;   
			case 5:
				System.exit(0);
			default : 
				System.out.println("Wrong Entry \n ");
				break;   
			}

	}  
	}


}
