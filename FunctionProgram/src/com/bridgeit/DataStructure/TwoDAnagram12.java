package com.bridgeit.DataStructure;

import java.util.ArrayList;
import java.util.Arrays;

import com.bridgeit.utility.Utility;

public class TwoDAnagram12 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		int size;  
		int number = size;
		boolean status2;
		ArrayList<Integer> status1;
		ArrayList<Integer> status;
		int k = 1;
		int temp =100;
		for (int i = 11; i < size; i++)
		{
			for (int j = i + 1; j < number - 1; j++)
			{
				status2 = Utility.anagram(i+"", j+"");
				status1 = Utility.primeNumber();
				status = Utility.primeNumber();
				 


				if (status && status1 &&  status1)
				{

					if(j>temp){
						System.out.println();
						temp = temp+100;
					}
					System.out.println(" " + i + " ");
					System.out.println(" " + j + " ");
					
				}

			}
		}
		System.out.println();
	
	  
	}

}