/******************************************************************************
 *  Purpose: Read Three Inputs And Print Day
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   06-03-2018
 ******************************************************************************/
package com.bridgeit.Algorithprogram;

import com.bridgeit.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println("Enter Month");
		int m=utility.inputInteger();
		System.out.println("Enter date");
		int d=utility.inputInteger();
		System.out.println("Enter Year");
		int y =utility.inputInteger();
		int d0=Utility.dayOfWeek(m,d,y);
		String weekDay;
		switch(d0) 
		{  

		case 0 :
			weekDay = " Sunday ";
			System.out.println(weekDay);
			break;


		case 1:  
			weekDay = " Monday ";
			System.out.println(weekDay);
			break;


		case 2:  
			weekDay = " Tuesday ";
			System.out.println(weekDay);
			break;


		case 3:  
			weekDay = " Wednesday ";
			System.out.println(weekDay);
			break;


		case 4:  
			weekDay = " Thursday ";
			System.out.println(weekDay);
			break;


		case 5:  
			weekDay = " Friday ";
			System.out.println(weekDay);
			break;


		case 6:  
			weekDay = " Saturday "; 
			System.out.println(weekDay);
			break;




		}

	}

}
