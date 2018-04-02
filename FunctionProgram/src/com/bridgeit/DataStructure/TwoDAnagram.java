/******************************************************************************
 *  Purpose: Print Anagram Numbers in Two D Array
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DataStructure;

import java.util.ArrayList;
import java.util.TreeSet;

import com.bridgeit.utility.Utility;

public class TwoDAnagram 
{
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = Utility.primeNumber();
		TreeSet<Integer> treeSet = Utility.anagramInArraylist(arrayList);
		Utility.twoDimentionlPrimeAnagramNumber(treeSet);
	}


}
