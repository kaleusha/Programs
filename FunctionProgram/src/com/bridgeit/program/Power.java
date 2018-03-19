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
		System.out.println("Enter number of times you need power ");
		int number = Utility.inputInteger();
		Utility.power(number);

	}
}