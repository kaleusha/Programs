/******************************************************************************
 *  Purpose: Read Different Datatypes Elements Input And Print Matrix
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
package com.bridgeit.program;

import com.bridgeit.utility.Utility;

public class Matrix {
	public static void main(String[] args) {
		System.out.println("\n1.Integer \n2.float \n3.boolean ");
		System.out.println("enter your choice");
		int choice = Utility.inputInteger();
		System.out.println("Enter How Many Rows");
		int row = Utility.inputInteger();
		System.out.println("Enter How Many colums");
		int colum = Utility.inputInteger();
		Utility.matrix(choice, row, colum);
	}
}
