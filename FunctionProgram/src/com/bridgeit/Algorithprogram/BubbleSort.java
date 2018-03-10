/******************************************************************************
 *  Purpose: Read N Integer Values And Print In Sorted Order 
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   06-03-2018
 ******************************************************************************/
package com.bridgeit.Algorithprogram;

import com.bridgeit.utility.Utility;

public class BubbleSort {
	 


	public static void main(String[] args) 
	{
		int i;
		  Utility utility=new Utility();
	      System.out.println("Enter How many Elements in Array");
	      int number=utility.inputInteger();
	      System.out.println("Enter Array Elements:");
	      int arr[]=new int[number];
	      for(i=0;i<number;i++)
	      {
	    	  arr[i]=utility.inputInteger();
	      }
	      utility.bubbleSort(arr,number);
	      System.out.println("Sorted Elements Are: ");
	      utility.printArray(arr,number);
	     

	}

}
