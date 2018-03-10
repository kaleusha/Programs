/******************************************************************************
 *  Purpose: Check Entered Year is Leap or Not
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
package com.bridgeit.program;

import com.bridgeit.utility.Utility;

public class LeaPYear {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter year");
		int year = utility.inputInteger();
		Utility.leapYear(year);

	}

}
