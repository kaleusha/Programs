/******************************************************************************
 *  Purpose: Calculate The Power Of two
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
package com.bridgeit.program;

import com.bridgeit.utility.*;

public class Power {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter number of times you need power ");
		int number = utility.inputInteger();
		Utility.power(number);

	}
}