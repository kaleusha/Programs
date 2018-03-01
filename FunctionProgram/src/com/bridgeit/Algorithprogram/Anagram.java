package com.bridgeit.Algorithprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args)
	{
		boolean status=true;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter First String");
		String s1=scanner.nextLine();
		System.out.println("Enter second String");
		String s2=scanner.nextLine();
		char ch[]=s1.toCharArray();
		Arrays.sort(ch);
		if(s1.length()!=s2.length())
		{
			status=false;
		}
		else
		{
			char ArrayS1[]=s1.toCharArray();
			Arrays.sort(ArrayS1);
			char ArrayS2[]=s2.toCharArray();
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);  
			
		}
		  if (status) 
		  {  
	            System.out.println(s1 + " and " + s2 + " are anagrams");  
	      } else 
	        {  
	            System.out.println(s1 + " and " + s2 + " are not anagrams");  
	        }  
	}

}
