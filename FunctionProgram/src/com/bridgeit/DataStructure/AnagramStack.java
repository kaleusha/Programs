package com.bridgeit.DataStructure;

public class AnagramStack {
	public static void main(String[] args) {
		
	
		StackStructure stack = new StackStructure(0);
	int count=0;
	for(int i=11; i<1000; i++)
	{
		boolean temp=true;
		for(int j=2; j<i; j++)
		{
			if(i%j==0)
			{
				temp=false;
				break;
			}
		}
		if(temp==true)
		{
			count++;
		}
	}
	
	int arr1[]=new int[count];
	int arr2[]=new int[count];
	int n=0;
	for(int i=11; i<1000; i++)
	{
		boolean temp=true;
		for(int j=2; j<i; j++)
		{
			if(i%j==0)
			{
				temp=false;
				break;
			}
		}
		if(temp==true)
		{
			arr1[n]=i;
			int m=i;
			int sum=0,rem;
			while(m>0)
			{
				rem=m%10;
				sum=(sum*10)+rem;
				m=m/10;
			}
			arr2[n]=sum;
			n++;
		}
	}
	for(int i : arr2)
	{
		System.out.print(i+" ");
		
	}
	System.out.println();
	
	for(int i : arr1)
	{
		System.out.print(i+" ");
		
	}
	System.out.println();
	System.out.println("Anagram numbers are: ");
	for(int i=0; i<arr1.length; i++)
	{
		for(int j=0; j<arr2.length; j++)
		{
			if(arr1[i]==arr2[j])
			{
				int digit=arr1[i];
				
				stack.push(digit);
			}
		}
	}
	stack.print();
	}
}
