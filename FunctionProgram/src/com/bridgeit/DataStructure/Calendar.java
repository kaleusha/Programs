/******************************************************************************
 *  Purpose: Print Calendar
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   14-03-2018
 ******************************************************************************/
package com.bridgeit.DataStructure;

import com.bridgeit.utility.Utility;

public class Calendar {
	public static void main(String[] args)
	{
		//Utility utility=new Utility();
		System.out.println("Enter Month");
		int month=Utility.inputInteger();
		System.out.println("Enter Year");
		int year=Utility.inputInteger();
		Utility.calender(month, year);
		
		
	}

}
