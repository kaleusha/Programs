package com.bridgeit.Algorithprogram;

import com.bridgeit.utility.Utility;

public class ToBinary {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility=new Utility();
		
		System.out.println("\n1.Decimal To Binary Conversion \n2.Binary to Decimal Conversion");
		System.out.println("Enter your Choice");
		int ch=utility.inputInteger();
		if(ch==1)
		{
		System.out.println("Enter Decimal Number");
		int num=utility.inputInteger();
		System.out.println("Binary number of " +num+ " is: ");
		utility.DecimalTOBinary(num);
		}else
		{
			System.out.println("Enter Binary Number is");
			String binary=utility.inputString();
			System.out.println("Binary number of " +binary+ " is: ");
			utility.convertBinaryToDecimal(binary);
	   
		}
		

	}

}
