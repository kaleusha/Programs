/******************************************************************************
 *  Purpose: Check Sum Of Three Integers Is Equal To Zero  
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
package com.bridgeit.program;

import com.bridgeit.utility.Utility;

public class Sum3Integers {

	public static void main(String[] args) {
		System.out.println("Enter number of Elements in array");
		int number = Utility.inputInteger();
		int array[] = new int[number];
		System.out.println("Enter Array Elements:");
		for (int i = 0; i < number; i++) {
			array[i] = Utility.inputInteger();
		}
		Utility.sumOf3Int(array, number);

	}

}
