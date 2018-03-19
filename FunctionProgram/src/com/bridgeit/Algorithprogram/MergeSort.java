/******************************************************************************
 *  Purpose: Read N Integers And Print Sorted  
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   06-03-2018
 ******************************************************************************/
package com.bridgeit.Algorithprogram;

import com.bridgeit.utility.Utility;

public class MergeSort {
   public static void main(String[] args) {
		System.out.println("Enter size of array: ");
		int size = Utility.inputInteger();
		int array[] = new int[size];
		System.out.println("Enter the array element: ");
		for(int i=0; i<array.length;i++)
		{
			array[i] = Utility.inputInteger();
		}
		int low=0;
		int high=size-1;
		Utility.sort(array, low, high);
		System.out.println("Array after merge sort");
		for(int k=0;k<array.length;k++)
		{
			System.out.print(array[k] +" ");
		}
		
	}

}
