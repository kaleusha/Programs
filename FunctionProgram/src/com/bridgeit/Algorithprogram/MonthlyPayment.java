/******************************************************************************
 *  Purpose: Read N Integers And Print Sorted  
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   09-03-2018
 ******************************************************************************/
package com.bridgeit.Algorithprogram;

import com.bridgeit.utility.Utility;

public class MonthlyPayment {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println("Enter The Value Of principal");
		int principal=utility.inputInteger();
		System.out.println("Enter The Value Of Rate");
		double rate=utility.inputInteger();
		System.out.println("Enter the Year");
		int year=utility.inputInteger();
		Utility.monthlyPayment(principal,rate,year);
	}

}
