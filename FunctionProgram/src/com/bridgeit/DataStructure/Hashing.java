/******************************************************************************
 *  Purpose: Read a set of numbers from a file and take user input to search
 *           a number
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   14-03-2018
 ******************************************************************************/
package com.bridgeit.DataStructure;

import java.io.IOException;

import com.bridgeit.utility.Utility;

public class Hashing
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		String filepath="/home/bridgeit/Programs/files/readhashing";
		String words[] = Utility.readFile(filepath);
		for(int i=0;i<words.length;i++)
		{
			System.out.print(Integer.parseInt(words[i])+" ");
		}
			System.out.println();
			Utility.hashing(words);
			
		
	}

} 