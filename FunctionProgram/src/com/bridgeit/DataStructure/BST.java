package com.bridgeit.DataStructure;

import com.bridgeit.utility.Utility;

public class BST 
{
	public static void main(String[] args) {
		Utility utility=new Utility();
		
		System.out.println("Enter the number of node: ");
		int number = utility.inputInteger();
		
		System.out.println("Possible Ways Are Arrange BST");
		Utility.NumberOfBinarySearchTree(number);
		
	}

}
