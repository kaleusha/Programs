/******************************************************************************
 *  Purpose: Search Word From File
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   12-03-2018
 ******************************************************************************/

package com.bridgeit.Algorithprogram;

import com.bridgeit.utility.Utility;



public class BinarySearch1 
{
	
	public static void main(String[] args)
	{
		
		String words[],search;
		Utility utility=new Utility();
		words =Utility.readFile("/home/bridgeit/Programs/files/FileForBinarySearch");
		System.out.println("Enter word to search");
		search=utility.inputString();
		Utility.bubblesortString(words);
	int result = Utility.binarySearchString(search, words, 0, words.length-1);
		   if(result>-1)
		   {
			   System.out.println("Element found @ "+result);
		   }
		   else
		   {
			   System.out.println("not found");
		   }
		  
	}

}
