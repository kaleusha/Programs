/******************************************************************************
 *  Purpose: Read Input And Print Factors Of That Number
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
package com.bridgeit.program;

import com.bridgeit.utility.Utility;

public class PrimeFactors {

	public static void main(String[] args) {
		System.out.println("Enter any Number to find Prime Factors ");
		int number = Utility.inputInteger();
        Utility.primeFactor(number);

	}

}
