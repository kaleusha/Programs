package com.bridgeit.program;

import java.util.Random;
import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class Coupon
{	
	
	public static void main(String[] args)
	{
		
	     Scanner scanner=new Scanner(System.in);
	     System.out.println("Enter number of element");
	     int number=scanner.nextInt();
	     Utility.couponRandom(number);
	     
	}
    }

	
