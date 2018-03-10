/******************************************************************************
 *  Purpose: Flip Coin And Find Out Percentage Of Tail And Head
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/

package com.bridgeit.program;

import com.bridgeit.utility.Utility;

public class FlipCoin {
	public static void main(String[] args) {

		Utility utility = new Utility();
		System.out.println("Enter How Many Times Flip Coin");
		int number = utility.inputInteger();
		Utility.flipCoin(number);

	}

}
