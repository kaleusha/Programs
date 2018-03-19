/******************************************************************************
 *  Purpose: Convert Decimal To Binary And Add Padding For Converting 8-Bit
 *           And Swap Nibbles
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   12-03-2018
 ******************************************************************************/

package com.bridgeit.Algorithprogram;

import com.bridgeit.utility.Utility;


public class Binary {
	public static void main(String[] args) 
	{
	        System.out.println("Enter Decimal number :");
	        int decimal=Utility.inputInteger();
	        String binary=Utility.binaryAddPadding(decimal);
	        System.out.println("8 bit Binary number is : "+binary);
	        String nibbles=Utility.swapNibbles(binary);
	        System.out.println("After swaping of the nibbles are : ");
	        System.out.println(nibbles);
       
	}

}
