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
		Utility utility = new Utility();
		System.out.println("Enter any Number to find Prime Factors ");
		int number = utility.inputInteger();
        Utility.primeFactor(number);

	}

}
