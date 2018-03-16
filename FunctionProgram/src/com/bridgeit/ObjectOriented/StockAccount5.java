/******************************************************************************
 *  Purpose: 
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   14-03-2018
 ******************************************************************************/
package com.bridgeit.ObjectOriented;

import com.bridgeit.utility.Utility;

public class StockAccount5 {
	public static void main(String[] args) {
		
			Utility utility = new Utility();
			while(true)
			{	
				System.out.println("Enter your choice:");
				
				System.out.println("1. Create user");
				System.out.println("2. Buy Share");
				System.out.println("3. Sale Share");
				System.out.println("4. Display Details");
				System.out.println("5. Exit");
				int choice = Utility.inputInteger();
				switch(choice)
				{
				case 1:	 	
					Utility.createAcc();
				    break;
				case 2 :	
					Utility.buyShare();
					break;
				
				case 3 :	
					Utility.saleShare();
				    break;
				case 4 :	
					Utility.display();
				    break;
				case  5:
					System.exit(0);
				default : 
					System.out.println("wrong entry");
				}
			}
		}


}
