/******************************************************************************
 *  Purpose: Queue Structure
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   15-03-2018
 ******************************************************************************/
package com.bridgeit.DataStructure;

import java.util.NoSuchElementException;
class ListNode1<T> {

	public ListNode1() {
		
	}
	public T data;
	@SuppressWarnings("rawtypes")
	public ListNode1 next;
	
	/*public ListNode1(T data2){
		
		this.data = data2;
		this.next = null;
	}*/

}
public class QueueStructure<T> {
	private ListNode1<T> front;
	private ListNode1<T> rear;
	private int length;


	public QueueStructure()
	{
		this.front = null;
		this.rear = null;
		this.length = 0;
	}
	public boolean isEmpty()
	{
		return length == 0;
	}
	
	public void insert(T data)
	{
		ListNode1<T> temp = new ListNode1<T>();
		temp.data=data;
		temp.next=null;
		if(isEmpty())
		{
			front = temp;
		}
		else
		{
			rear.next =temp;
		}
		rear = temp;
		length++;
		//System.out.println(data);
	}
	public T delete()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}	
		T result = (T) front.data;
		front = front.next;
		if(front == null)
		{
			rear = null;
		}
		length--;
		return result;
	}

	public void print(){
		if(isEmpty()){
			return;
		}
		ListNode1<T> current = front;
		while(current != null)
		{
			System.out.print(current.data+"   ");
			current = current.next;
		}
		
	
	}


public void push(T data)
{
	ListNode1<T> temp = new ListNode1<T>();
	temp.data=data;
	temp.next=null;
	if(isEmpty())
	{
		front = temp;
	}
	else
	{
		rear.next =temp;
	}
	rear = temp;
	length++;
	System.out.println(data);
}
}
