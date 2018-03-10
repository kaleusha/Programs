package com.bridgeit.Algorithprogram;

import com.bridgeit.utility.Utility;



public class BinarySearch1 
{
	
	public static void main(String[] args)
	{
		
		String words[],search;
		Utility utility=new Utility();
		words =utility.readFile("/home/bridgeit/Programs/files/FileForBinarySearch");
		System.out.println("Enter word to search");
		search=utility.inputString();
		utility.bubblesortString(words);
	int result = utility.binarySearchString(search, words, 0, words.length-1);
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
