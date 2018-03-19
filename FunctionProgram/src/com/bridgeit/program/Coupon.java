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
		System.out.println("Enter number of element");
		int number = Utility.inputInteger();
		Utility.couponRandom(number);

	}
}
