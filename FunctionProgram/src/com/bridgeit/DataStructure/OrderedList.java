/******************************************************************************
 *  Purpose: List of Numbers from a file and arrange it ascending Order
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   14-03-2018
 ******************************************************************************/
package com.bridgeit.DataStructure;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class OrderedList 
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String filepath="/home/bridgeit/Programs/files/hashing";
	String words[] = Utility.readFile(filepath);
	for(int i=0;i<words.length;i++)
	{
		System.out.print(Integer.parseInt(words[i])+" ");
	}
	OrderedListStructure<Integer> orderlist = new OrderedListStructure<>();
	for(int i=0;i<words.length;i++)
	{
		orderlist.add(Integer.parseInt(words[i]));
	}
	System.out.println("\nYour list size:==>>" +orderlist.size()); 
	
	
	orderlist.sortList(orderlist);  
	
	System.out.println("\nEnter the value to search: ");
	int search = scanner.nextInt();
	if(orderlist.search(search))
	{
		System.out.println("Integer is present");
		orderlist.remove(search);
		System.out.println("Your list size:==>>" +orderlist.size());
		Utility.writeFileinteger(orderlist);
	}
	else
	{
		System.out.println("Enter the position: ");
		int pos = scanner.nextInt();
		orderlist.insert( search,pos);
		System.out.println("Integer added");
		System.out.println("Your list size:==>>" +orderlist.size());
		Utility.writeFileinteger(orderlist);
		orderlist.printlist();
	}
	scanner.close();
	}
}
