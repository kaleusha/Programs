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
		// TODO Auto-generated method stub
		Utility utility=new Utility();
		
		System.out.println("Enter size of array: ");
		int size = utility.inputInteger();
		int array[] = new int[size];
		System.out.println("Enter the array element: ");
		for(int i=0; i<array.length;i++)
		{
			array[i] = utility.inputInteger();
		}
		int low=0;
		Utility.mergesort(array, low, size);
		System.out.println("Array after merge sort");
		for(int k=0;k<array.length;k++)
		{
			System.out.print(array[k] +" ");
		}
		
	}

}
