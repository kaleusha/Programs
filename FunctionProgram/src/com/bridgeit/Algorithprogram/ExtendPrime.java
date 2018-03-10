package com.bridgeit.Algorithprogram;

import java.util.ArrayList;
import com.bridgeit.utility.Utility;

public class ExtendPrime {
	


	public static void main(String[] args) {
		
          ArrayList<Integer> al=Utility.primeNumber();
          String strArray[]=new String[al.size()];
          strArray=al.toArray(strArray);
          
          Utility.extendPrime(al);
          
         

	}

}
