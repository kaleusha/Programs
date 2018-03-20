/******************************************************************************
 *  Purpose: Show Arithmetic Expression is balanced or not.
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   12-03-2018
 ******************************************************************************/
package com.bridgeit.DataStructure;

import com.bridgeit.utility.Utility;

public class BalancedParentheses 
{
	public static void main(String[] args) 
	{
		//Utility utility=new Utility(); 
		
		System.out.println("Enter expression: ");
		String expression = Utility.inputString();        
		Utility.balenced(expression);
    }

}
