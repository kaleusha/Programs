/******************************************************************************
 *  Purpose: Read List of Numbers from a file
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   14-03-2018
 ******************************************************************************/
package com.bridgeit.DataStructure;

import com.bridgeit.utility.Utility;

public class UnorderedList{
	
	public static void main(String[] args) {
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
	    String search = Utility.inputString();
		if(linkedlist.search(search))
		{
			System.out.println("Word is present in the linked list");
			linkedlist.remove(search);
			Utility.writeFileinteger1(linkedlist);
			System.out.println("remove successfully");
		}
		else
		{
			linkedlist.append(search);
			Utility.writeFileinteger1(linkedlist);
			System.out.println("Word added");
			
		}
		linkedlist.printlist();
		
	}

}
