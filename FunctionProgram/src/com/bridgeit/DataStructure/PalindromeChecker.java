package com.bridgeit.DataStructure;

import java.util.Scanner;

public class PalindromeChecker 
{
	public static void  main(String[]args)
	{	
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter to check palindrome or not");
		String st=sc.next();
		char[]ch=st.toCharArray();
		int n=ch.length-1;
		palindromeDequeueStructure m=new palindromeDequeueStructure(20);

		for(int i=0;i<ch.length;i++)
		{
			m.addFront(ch[i]);
		}

		String Str="";

		for(int i=0;i<=n;i++)
		{
			char c=m.removeFront();
			Str=Str+c;
		}
		System.out.println("Reversed - "+Str);
		if(st.equals(Str))
		{
			System.out.println("String is Palindrome ");
		}
		else
		{
			System.out.println(" String Is not a palindrome ");
		}
		
		
sc.close();
	}

}
