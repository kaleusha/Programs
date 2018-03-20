/******************************************************************************
 *  Purpose: List of Numbers from a file and arrange it ascending Order
 *           And If Element Found In List Then Remove It Otherwise Add It
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   14-03-2018
 ******************************************************************************/
package com.bridgeit.DataStructure;

import com.bridgeit.utility.Utility;

public class OrderedList 
{
	public static void main(String[] args) {
	String filepath="/home/bridgeit/Programs/files/orderList";
	String words[] = Utility.readFile(filepath);
	for(int i=0;i<words.length;i++)
	{
		System.out.print(Integer.parseInt(words[i])+" ");
	}
	Utility.orderList(words);
	}
}
