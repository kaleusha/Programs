package com.bridgeit.DataStructure;

import java.util.NoSuchElementException;

class ListNode1 {

	public int data;
	public ListNode1 next;
	
	public ListNode1(int data2){
		
		this.data = data2;
		this.next = null;
	}

}
public class QueueStructure {
	private ListNode1 front;
	private ListNode1 rear;
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
	public void insert(int data)
	{
		ListNode1 temp = new ListNode1(data);
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
	}
	public int delete()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}	
		int result = front.data;
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
		ListNode1 current = front;
		while(current != null)
		{
			System.out.print(current.data+"   ");
			current = current.next;
		}
		
	
	}
}
