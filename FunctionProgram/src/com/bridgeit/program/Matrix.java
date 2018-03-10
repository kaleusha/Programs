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
		Utility utility = new Utility();
		System.out.println("\n1.Integer \n2.float \n3.boolean ");
		System.out.println("enter your choice");
		int choice = utility.inputInteger();
		System.out.println("Enter How Many Rows");
		int row = utility.inputInteger();
		System.out.println("Enter How Many colums");
		int colum = utility.inputInteger();
		Utility.matrix(choice, row, colum);
	}
}
