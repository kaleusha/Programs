/******************************************************************************
 *  Purpose: Read Three Inputs And Print Win Percentage
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
package com.bridgeit.program;

import com.bridgeit.utility.Utility;

public class Gambler {
	public static void main(String[] args) {

		Utility utility = new Utility();
		System.out.println("Enter stake ");/* starting bankamt */
		int stake = utility.inputInteger();
		System.out.println("Enter goal ");/* desired bankamt */
		int goal = utility.inputInteger();
		System.out.println("Enter trials ");/* no.of time try */
		int trials = utility.inputInteger();
		Utility.grambler(stake, goal, trials);

	}

}
