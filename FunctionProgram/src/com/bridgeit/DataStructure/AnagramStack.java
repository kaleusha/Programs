/******************************************************************************
 *  Purpose: Print the Anagrams from the Stack.
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   14-03-2018
 ******************************************************************************/

package com.bridgeit.DataStructure;

import java.util.ArrayList;
import java.util.Iterator;
import com.bridgeit.utility.Utility;

public class AnagramStack {
	public static void main(String[] args) {
		 ArrayList<Integer> arrayList=Utility.primeNumber();
         int strArray[]=new int[arrayList.size()];
         Iterator<Integer> iterator=arrayList.iterator();
                           
         for(int i=0;i<strArray.length;i++)
         {
          strArray[i]=iterator.next();	  
         }
         
        System.out.println(strArray);
         
         Utility.stackAnagram(strArray);
	}
}
