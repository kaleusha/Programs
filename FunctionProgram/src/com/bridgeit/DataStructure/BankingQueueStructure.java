package com.bridgeit.DataStructure;

public class BankingQueueStructure 
{
	int array[]=new int[20];
	int front=-1;
	int rear=-1;
	static int count=0;
	
	public void add()
	{
		count++;
		System.out.println("queue Size Is: "+count);
	}
	public void exit()
	{
		count--;
	}
	public boolean size()
	{
		return true;
	}
	public boolean empty()
	{
		return count==0;
	}
	
	public boolean full()
	{
		return count==20;
	}
	
}