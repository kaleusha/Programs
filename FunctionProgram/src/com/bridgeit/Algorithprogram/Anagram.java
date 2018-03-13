/******************************************************************************
 *  Purpose: Read Two String And Check Anagram or Not
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   06-03-2018
 ******************************************************************************/

package com.bridgeit.Algorithprogram;

import com.bridgeit.utility.Utility;

public class Anagram {
	public static void main(String[] args)
	{
		Utility utility=new Utility();
		System.out.println("Enter First String");
		String string1=utility.inputString();
		System.out.println("Enter second String");
		String string2=utility.inputString();
		boolean result=Utility.anagram(string1,string2);
		if(result)
		{
			System.out.println(string1 + " and " + string2 + " are anagrams");  
		}else
		{
			System.out.println(string1 + " and " + string2 + " are not anagrams");  
		}
	}

}
