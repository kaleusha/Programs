/******************************************************************************
 *  Purpose: Read List of Numbers from a file
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   14-03-2018
 ******************************************************************************/
package com.bridgeit.DataStructure;

import com.bridgeit.utility.Utility;

public class UnorderedList{
	
	public static void main(String[] args) {
		String ReadPath ="/home/bridgeit/Programs/files/FileForBinarySearch";
		String words[] = Utility.readFile(ReadPath);
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
		Utility.unorderList(words);
		
	}

}
