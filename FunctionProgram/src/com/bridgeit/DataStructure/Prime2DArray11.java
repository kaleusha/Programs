/******************************************************************************
 *  Purpose: Store the prime numbers in a 2D Array
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   15-03-2018
 ******************************************************************************/
package com.bridgeit.DataStructure;

import java.util.ArrayList;
import com.bridgeit.utility.Utility;

public class Prime2DArray11 {
	public static void main(String[] args) {
	Utility utility=new Utility();
	ArrayList<Integer> al=Utility.primeNumber();
	System.out.println("prime numbers are");
	utility.prime2D(al);
	   
	}
}
	    
	


