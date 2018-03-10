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
		char chArray1[] = string1.toCharArray();
		char chArray2[] =string2.toCharArray();
		
		int string1length=string1.length();
		int string2length=string2.length();
		boolean result=Utility.anagram(chArray1,chArray2,string1length,string2length);
		if(result)
		{
			System.out.println(string1 + " and " + string2 + " are anagrams");  
		}else
		{
			System.out.println(string1 + " and " + string2 + " are not anagrams");  
		}
	}

}
