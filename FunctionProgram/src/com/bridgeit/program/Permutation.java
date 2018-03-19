/******************************************************************************
 *  Purpose: Find How Many Ways To Arrange One String
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
package com.bridgeit.program;

import com.bridgeit.utility.Utility;

public class Permutation 
{
	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		String str = Utility.inputString();
		int n = str.length();
		Utility.permute(str, 0, n-1);
	}


}
