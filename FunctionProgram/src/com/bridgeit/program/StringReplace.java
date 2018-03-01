package com.bridgeit.program;

import java.util.Scanner;
public class StringReplace {
		public static void main(String[] args) {

			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter user Name");
			String input=scanner.nextLine();
			if(input.length()>3)
			{
				System.out.println("valid string");
				System.out.println("hello "  +input+ "," +"how are you");
			}
			
			else
				System.out.println("enter greter than 3 char in string");
			
		}
}
