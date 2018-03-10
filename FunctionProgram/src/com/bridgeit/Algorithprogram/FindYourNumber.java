/******************************************************************************
 *  Purpose: Find The Number
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   06-03-2018
 ******************************************************************************/
package com.bridgeit.Algorithprogram;

import com.bridgeit.utility.Utility;

public class FindYourNumber {
	
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		int range,count,low,high,middle;
		System.out.println("Enter any number: ");
		int num = utility.inputInteger();
		range = (int) Math.pow(2, num-1);
		System.out.println("Take number between '0' to "+range);
		count=0;
		
		low=0;
		high=range;
		middle=(low+high/2);
		Utility.binarySearch(low,high,middle,count,num);
		
		
		
	}
	
		

	
}
