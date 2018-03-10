/******************************************************************************
 *  Purpose: Read N Coupon Numbers And Print The Distinct Coupon Number
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/

package com.bridgeit.program;

import com.bridgeit.utility.Utility;

public class Coupon {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter number of element");
		int number = utility.inputInteger();
		Utility.couponRandom(number);

	}
}
