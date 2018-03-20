/******************************************************************************
 *  Purpose: How Many Ways To Create Binary Search Tree
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   15-03-2018
 ******************************************************************************/
package com.bridgeit.DataStructure;

import com.bridgeit.utility.Utility;

public class BST 
{
	public static void main(String[] args) {
		//Utility utility=new Utility();
		
		System.out.println("Enter the number of node: ");
		int number = Utility.inputInteger();
		
		System.out.println("Possible Ways Are Arrange BST");
		Utility.NumberOfBinarySearchTree(number);
		
	}

}
