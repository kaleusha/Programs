/******************************************************************************
 *  Purpose: Check String is Palindrome or not.
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   14-03-2018
 ******************************************************************************/
package com.bridgeit.DataStructure;

import com.bridgeit.utility.Utility;

public class PalindromeChecker 
{
	public static void  main(String[]args)
	{	
		System.out.println("Enter to check palindrome or not");
		String string=Utility.inputString();
		Utility.pallindrom(string);

}
}
