package com.bridgeit.Algorithprogram;

import java.util.Scanner;

public class ToBinary {
	public void DecimalTOBinary(int num){
	     int binary[] = new int[40];
	     int index = 0;
	     while(num > 0){
	       binary[index++] = num%2;
	       num = num/2;
	     }
	     for(int i = index-1;i >= 0;i--){
	       System.out.print(binary[i]);
	     }
	}
	
	public void convertBinaryToDecimal(String binary){
        int result = 0;

        for(int j = 0; j < binary.length();j++){
            char currentChar = binary.charAt(binary.length() - j - 1);
            int numericValue = Character.getNumericValue(currentChar);
            result+=Math.pow(2, j) * numericValue;
            
        }System.out.println(result);

	}

       

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToBinary con=new ToBinary();
		Scanner scanner=new Scanner(System.in);
		System.out.println("\n1.D->B \n2.B->D");
		System.out.println("Enter your Choice");
		int ch=scanner.nextInt();
		if(ch==1)
		{
		System.out.println("Enter Decimal Number");
		int num=scanner.nextInt();
		System.out.println("Binary number of " +num+ " is: ");
	    con.DecimalTOBinary(num);
		}else
		{
			System.out.println("Enter Binary Number is");
			String binary=scanner.next();
			System.out.println("Binary number of " +binary+ " is: ");
		    con.convertBinaryToDecimal(binary);
	   
		}
		

	}

}
