/******************************************************************************
 *  Purpose: Read Prime Numbers And Print Anagrams As Well AS Pallindrom 
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   12-03-2018
 ******************************************************************************/

package com.bridgeit.Algorithprogram;

import java.util.ArrayList;
import java.util.Iterator;


import com.bridgeit.utility.Utility;

public class ExtendPrime {
	


	public static void main(String[] args) { 
          ArrayList<Integer> al=Utility.primeNumber();
          int strArray[]=new int[al.size()];
          Iterator<Integer> iterator=al.iterator();
                            
          for(int i=0;i<strArray.length;i++)
          {
           strArray[i]=iterator.next();	  
          }
          
         
          
          Utility.extendPrime(strArray);
          
         

	}

}
