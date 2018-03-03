package com.bridgeit.Algorithprogram;

import java.util.Scanner;

public class FindYourNumber {

	public static void main(String[] args) 
	{
		int first=0,mid=0,last;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter How Many Elements In Array");
		int number=scanner.nextInt();
		int Array[]=new int[number];
		System.out.println("Enter Array Elements:");
		for(int i=0;i<number;i++)
		{
			Array[i]=scanner.nextInt();
		}System.out.println("Enter Search Element: ");
		int search=scanner.nextInt();
		last=number-1;
		mid=(first+last)/2;
		while(first<last)
		{
			 if ( Array[mid] < search )
			 {
				 System.out.println("True");
			        first = mid + 1;
			        
			 }
			      else if ( Array[mid] == search ) 
			      {
			        System.out.println(search + " found at location " + (mid + 1) + ".");
			        break;
			      }
			      
			 if(Array[mid]>search)
			 {

			     System.out.println("True");
			     last = mid - 1;
			 
			 }
			 else if ( Array[mid] == search ) 
		      {
		        System.out.println(search + " found at location " + (mid - 1) + ".");
		        break;
		      }
			      mid = (first + last)/2;
			      
			   }
			   if ( first > last )
			      System.out.println(search + " is not present in the list.\n");
			  
		
	}	

	
}
