package com.bridgeit.DataStructure;

import java.io.FileNotFoundException;

import com.bridgeit.utility.Utility;

public class Hashing
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		String filepath="/home/bridgeit/Programs/files/hashing";
		String words[] = Utility.readFile(filepath);
		for(int i=0;i<words.length;i++)
		{
			System.out.print(Integer.parseInt(words[i])+" ");
		}
			System.out.println();
			Utility.hashing(words);
		
	}

} 