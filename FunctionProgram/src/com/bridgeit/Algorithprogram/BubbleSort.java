package com.bridgeit.Algorithprogram;

import java.util.Scanner;

public class BubbleSort {
	 static void sort(int arr[])
	    {
		 int temp;
	        int n = arr.length;
	        for (int i=0; i<n-1; ++i)
	        {
	        	for(int j=i+1;j<n-2;j++)
	        	{
	        		if (arr[i] > arr[j])
	        		{
	        	
	        		temp=arr[i];
	        		arr[i]=arr[j];
	        		arr[j]=temp;
	        		}
	        	}
	            
	        }
	    }
	 static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	 
	        System.out.println();
	    }


	public static void main(String[] args) 
	{
		int i;
	      Scanner scanner=new Scanner(System.in);
	      System.out.println("Enter How many Elements in Array");
	      int number=scanner.nextInt();
	      System.out.println("Enter Array Elements:");
	      int arr[]=new int[number];
	      for(i=0;i<number;i++)
	      {
	    	  arr[i]=scanner.nextInt();
	      }
	      sort(arr);
	      System.out.println("Sorted Elements Are: ");
	      printArray(arr);

	}

}
