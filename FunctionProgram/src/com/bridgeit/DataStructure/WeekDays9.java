/******************************************************************************
 *  Purpose: Print Calendar Using Queue
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   14-03-2018
 ******************************************************************************/
package com.bridgeit.DataStructure;

import com.bridgeit.utility.Utility;

public class WeekDays9 {
	public static void main(String[] args) 
	{
		System.out.println("Enter the month");
		int month = Utility.inputInteger();
		System.out.println("Enter the year");
		int year = Utility.inputInteger();
		int start = Utility.dayOfWeek(month,1, year);
		int maxDay = Utility.maxDay(month, year);
		Utility.weekDay(month,year,start,maxDay);
	}
}
