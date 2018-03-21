/******************************************************************************
 *  Purpose: Print the Anagrams from the Queue.
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   14-03-2018
 ******************************************************************************/

package com.bridgeit.DataStructure;

import java.util.ArrayList;
import java.util.Iterator;

import com.bridgeit.utility.Utility;

public class AnagramQueue {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=Utility.primeNumber();
        int strArray[]=new int[al.size()];
        Iterator<Integer> iterator=al.iterator();
                          
        for(int i=0;i<strArray.length;i++)
        {
         strArray[i]=iterator.next();	  
        }
        
       System.out.println(strArray);
        Utility.queueAnagram(strArray);
		
	}
 }
