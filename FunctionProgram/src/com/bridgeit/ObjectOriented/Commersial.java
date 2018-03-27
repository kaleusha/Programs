/******************************************************************************
 *  Purpose: maintains a list of CompanyShares object which has Stock Symbol 
 *           and Number of Shares as well as DateTime of the transaction
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   24-03-2018
 ******************************************************************************/
package com.bridgeit.ObjectOriented;

import com.bridgeit.utility.Utility;

public class Commersial 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		StockAccount stockAccount=new StockAccount();
		String name,symbol;
		long money,noOfShares,priceOfEachShare;
		long totalShare;
		int choice=0;
		do
		{
			System.out.println("1. Create Account");
			System.out.println("2. Buy Shares");
			System.out.println("3. Sell Shares");
			System.out.println("4. Add Company");
			System.out.println("5. Remove Company");
			System.out.println("6. Display Transaction Details");
			System.out.println("7. Display Report");
			System.out.println("8. Exit");
			System.out.println("Enter your choice: ");
			choice=Utility.inputInteger();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter your Name: ");
				name=Utility.inputString(); 
				System.out.println("Enter Initial Money:");
				money=utility.inputLong();
				System.out.println("Enter the Shares: ");
				totalShare=utility.inputLong();
				Customer customer = new Customer(name, money, totalShare);
				System.out.println(customer);
				stockAccount=new StockAccount(customer);
				System.out.println("Account created Sucessfully");
				break;
				
			case 2:
				System.out.println("Enter your Name=");
				name=Utility.inputString();
				System.out.println("Enter the Symbol of company to buy Shares=");
				symbol=Utility.inputString();
				System.out.println("Enter no of Shares=");
				noOfShares=utility.inputLong();
				//System.out.println(symbol + " "+ noOfShares + " "+name);
				stockAccount.buyShare(symbol, noOfShares, name);
				System.out.println("Share buy Successfully.....");
				break;
				
			case 3:
				System.out.println("Enter your Name=");
				name=Utility.inputString();
				System.out.println("Enter the Symbol of company to buy Shares=");
				symbol=Utility.inputString();
				System.out.println("Enter no of Shares=");
				noOfShares=utility.inputLong();
				//System.out.println(symbol + " "+ noOfShares + " "+name);
				stockAccount.sellShare(symbol, noOfShares, name);
				System.out.println("Share Sell Successfully");
				break;
			case 4:
				System.out.println("Enter the Symbol of Company to Add in File: ");
				symbol=Utility.inputString();
				System.out.println("Enter no of Shares=");
				noOfShares=utility.inputLong();
				System.out.println("Enter Price of Shares");
				priceOfEachShare=utility.inputLong();
				//System.out.println(symbol+" "+noOfShares+" "+priceOfEachShare);
				stockAccount.addNewSymbol(symbol, noOfShares, priceOfEachShare);
				System.out.println("Company Added Successfully");
				break;
				
			case 5:
				System.out.println("Enter the Symbol of Company to remove in File: ");
				symbol=Utility.inputString();
				//System.out.println(symbol);
				stockAccount.removeSymbol(symbol);
				System.out.println("Company Removed Successfully");
				break;
			case 6:
				System.out.println("Transaction Details");
				stockAccount.displayTransactionDetails();
				break;
			case 7:
				System.out.println("Report");
				stockAccount.displayReport();
				break;
			case 8:
				System.out.println("Thanks");
				System.exit(0);
				default:
					System.out.println("Invalid choice");
			}
		}
		while(choice > 0);
	}


}
