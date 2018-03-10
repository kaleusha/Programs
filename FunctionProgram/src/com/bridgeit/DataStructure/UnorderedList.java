package com.bridgeit.DataStructure;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class UnorderedList{
	
	public static void main(String[] args)
	{
		//String words[]={};
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		String ReadPath ="/home/bridgeit/Programs/files/FileForBinarySearch";
		String words[] = Utility.readFile(ReadPath);
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
		LinkedListStructure<String> linkedlist = new LinkedListStructure<>();

		for(int i=0;i<words.length;i++)
		{
			linkedlist.add(words[i]);
		}
		
		//System.out.println("Your list size: "+linkedlist.size());
		
		
		System.out.println("Enter the word to search: ");
		String search = scanner.next();

		if(linkedlist.search(search))
		{
			System.out.println("Word is present in the linked list");
			linkedlist.remove(search);
		}
		else
		{
			linkedlist.append(search);
			System.out.println("Word added");
			
		}
		linkedlist.printlist();
		scanner.close();
	}

}
