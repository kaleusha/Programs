/******************************************************************************
 *  Purpose: 
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   14-03-2018
 ******************************************************************************/
package com.bridgeit.ObjectOriented;

import com.bridgeit.utility.Utility;

public class StockAccount {
	public static void main(String[] args) {
		
			Utility utility = new Utility();
			while(true)
			{	
				System.out.println("Enter your choice:");
				
				System.out.println("1. Create user");
				System.out.println("2. Buy Share");
				System.out.println("3. Sale Share");
				System.out.println("4. Add Company symbol");
				System.out.println("5. remove company symbol");
				System.out.println("6. Display Details");
				System.out.println("7. Exit");
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
					
				case 4: 
					System.out.println("Enter the Symbol of Company to Add in File: ");
					String symbol=Utility.inputString();
					System.out.println("Enter no of Shares=");
					long noOfShares=utility.inputLong();
					System.out.println("Enter Price of Shares");
					long priceOfEachShare=utility.inputLong();
					//System.out.println(symbol+" "+noOfShares+" "+priceOfEachShare);
					Utility.addNewSymbol(symbol, noOfShares, priceOfEachShare);
					System.out.println("Company Added Successfully");
					break;
					

				case 5:
					System.out.println("Enter the Symbol of Company to Add in File: ");
					String symbol1=Utility.inputString();
					//System.out.println(symbol);
					utility.removeSymbol(symbol1);
					System.out.println("Company Removed Successfully");
					break;
				
				case 6 :	
					Utility.display();
				    break;
				case  7:
					System.exit(0);
				default : 
					System.out.println("wrong entry");
				}
			}
		}


}
