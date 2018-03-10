/******************************************************************************
 *  Purpose: Read N Integers And Print Sorted  
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   06-03-2018
 ******************************************************************************/
package com.bridgeit.Algorithprogram;

import com.bridgeit.utility.Utility;

public class MonthlyPayment {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println("Enter The Value Of principal");
		int P=utility.inputInteger();
		System.out.println("Enter The Value Of Rate");
		double R=utility.inputInteger();
		System.out.println("Enter the Year");
		int Y=utility.inputInteger();
		Utility.monthlyPayment(P,R,Y);
	}

}
