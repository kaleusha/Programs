package com.bridgeit.DataStructure;

import java.util.ArrayList;

import com.bridgeit.utility.Utility;

public class Prime2DArray {
	
		
	

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		ArrayList<Integer> list=Utility.primeNumber();
	    
	  
	    int array2D[][]=new int[10][30];
	    
	    for(int i=0;i<10;i++)
	    {
	    	for(int j=0;j<30;j++)
	    	{
	    		array2D[i][j]=list[i];
	    	}
	    }
	
	
	    for(int i=0;i<10;i++)
	    {
	    	for(int j=0;j<30;j++)
	    	{
	    		System.out.println(" "+array2D[i][j]);
	    	}
	    }
	 }
	   
	    
}
	    
	


