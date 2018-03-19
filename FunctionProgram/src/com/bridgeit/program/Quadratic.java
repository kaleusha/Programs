/******************************************************************************
 *  Purpose: Find Out Roots Of Non-negative Numbers 
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
package com.bridgeit.program;

import com.bridgeit.utility.Utility;

public class Quadratic {
	public static void main(String[] args) {
		int a, b, c;
		System.out.println("Given Quadratic Equation is:ax^2+bx+c");
		System.out.println("Enter Value of a");
		a = Utility.inputInteger();
		System.out.println("Enter Value of b");
		b = Utility.inputInteger();
		System.out.println("Enter Value of c");
		c = Utility.inputInteger();
		Utility.quadratic(a, b, c);

	}

}
