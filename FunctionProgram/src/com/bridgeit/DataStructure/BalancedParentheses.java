package com.bridgeit.DataStructure;

import com.bridgeit.utility.Utility;

public class BalancedParentheses 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println("Enter max size: ");
		int n=utility.inputInteger();
	

		//Creating Stack 
		StackStructure stack = new StackStructure(n);
		

		System.out.println("Enter expression: ");
		String exp = utility.inputString();        
		int len = exp.length();

		for (int i = 0; i < len; i++)
		{    
		    char ch = exp.charAt(i);

			if (ch == '(')
			{
			   stack.push(i);
			}
				else if (ch == ')')
				{
					try
					{
					    long p = (stack.pop() + 1);
					    System.out.println("')' at index "+(i+1)+" Balanced with '(' at index "+p);
					}
					catch(Exception e)
					{
					    System.out.println("')' at index "+(i+1)+" is UnBalanced");
					}
				}            
		}
		while (!stack.isEmpty() )
		{
		     System.out.println("'(' at index "+(stack.pop() +1)+" is UnBalanced");
		}                          
    }

}
