/******************************************************************************
 *  Purpose: Read N Harming Number And  Print the Nth Harming Value
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
package com.bridgeit.program;

import com.bridgeit.utility.Utility;

public class HarmonicNumber {
	public static void main(String[] args) {
		System.out.println("Enter How Many Times Print");
		int number = Utility.inputInteger();
		Utility.harmonic(number);

	}
}
