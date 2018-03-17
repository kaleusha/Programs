/******************************************************************************
 *  Purpose: Show Arithmetic Expression is balanced or not.
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   12-03-2018
 ******************************************************************************/
package com.bridgeit.DataStructure;

import com.bridgeit.utility.Utility;

public class BalancedParentheses 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility(); 
		StackStructure stack = new StackStructure();
		System.out.println("Enter expression: ");
		String exp = Utility.inputString();        
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
