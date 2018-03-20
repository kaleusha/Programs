/******************************************************************************
 *  Purpose: Read Two String And Check Anagram or Not
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   06-03-2018
 ******************************************************************************/

package com.bridgeit.Algorithprogram;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String");
		String string1=sc.nextLine();
		System.out.println("Enter second String");
		String string2=sc.nextLine();
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
