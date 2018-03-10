/******************************************************************************
 *  Purpose: Given N distinct Coupon Numbers, how many random 
 *  numbers do you need to generate that distinct coupon number?
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/

package com.bridgeit.program;

import com.bridgeit.utility.Utility;

public class Distance {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter Value of x ");
		int x = utility.inputInteger();
		System.out.println("Enter Value of y ");
		int y = utility.inputInteger();
		double distance;
		distance = Math.sqrt((x * x) + (y * y));
		System.out.println(distance);

	}

}
