package com.bridgeit.Algorithprogram;

import com.bridgeit.utility.Utility;


public class Binary {
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		 
	        System.out.println("Enter Decimal number :");
	        int decimal=utility.inputInteger();
	        String binary=Utility.binaryAddPadding(decimal);
	        System.out.println("8 bit Binary number is : "+binary);
	        
	        String nibbles=Utility.swapNibbles(binary);
	        System.out.println("After swaping of the nibbles are : ");
	        System.out.println(nibbles);
       
	}

}
