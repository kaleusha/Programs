/******************************************************************************
 *  Purpose: Print Calendar Using Stack
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   14-03-2018
 ******************************************************************************/
package com.bridgeit.DataStructure;

import com.bridgeit.utility.Utility;

public class WeekDaysStack10 {
	public static void main(String[] args) {
		System.out.println("Enter the month");
		int month = Utility.inputInteger();
		System.out.println("Enter the year");
		int year = Utility.inputInteger();
		Utility.calenderWithStack(month,year);
	}

}
