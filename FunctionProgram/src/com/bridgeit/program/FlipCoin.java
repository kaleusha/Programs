package com.bridgeit.program;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class FlipCoin {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter How Many Times Flip Coin");
		int number= scanner.nextInt();
		Utility.flipCoin(number);
	}
		
	

}
