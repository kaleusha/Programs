/******************************************************************************
 *  Purpose: Stack Structure
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   14-03-2018
 ******************************************************************************/
package com.bridgeit.DataStructure;

import java.util.EmptyStackException;

public class StackStructure 
{
	public Node top;
	int length;
	
	public int length(){
		return length;
	}
	public boolean isEmpty(){
		return length == 0;	
	}
	public void push(int data)
	{
		Node temp = new Node(data);
		temp.next = top;
		top = temp;
		length++;
	}
	
	public int pop(){
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int result = top.data;
		top = top.next;
		length--;
		return result;	
	}
	public int peek()
	{
		if(isEmpty()){
			throw new EmptyStackException();	
		}
		return top.data;		
	}
	
	public void reverse()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
	}
		public void print(){
			if(isEmpty()){
				return;
			}
			Node current = top;
			while(current != null)
			{
				System.out.print(current.data+"   ");
				current = current.next;
			}
	
		}


}
