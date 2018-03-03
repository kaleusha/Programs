package com.bridgeit.Algorithprogram;

import java.util.Scanner;

public class InsertionSort {
	 static void sort(int arr[])
	    {
	        int n = arr.length;
	        for (int i=1; i<n; ++i)
	        {
	            int key = arr[i];
	            int j = i-1;
	 
	            while (j>=0 && arr[j] > key)
	            {
	                arr[j+1] = arr[j];
	                j = j-1;
	            }
	            arr[j+1] = key;
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
