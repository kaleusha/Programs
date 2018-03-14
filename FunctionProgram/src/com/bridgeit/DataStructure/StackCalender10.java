package com.bridgeit.DataStructure;

class Node<T>
{
	Node next;
	T data;
	Node(T data1)
	{
		this.data = (T) data1;
	}
}
public class StackCalender10 {
	Node firstNode;
	Node lastNode;
	public <T> void add(T data)
	{
		Node newNode = new Node(data);
		if(firstNode==null)
		{
			firstNode = newNode;
		}
		else
		{
			lastNode.next = newNode;
		}
		lastNode = newNode;
	}
	public <T> boolean search(T dataToBeSearched)
	{
			Node current = firstNode;
			while(current != null)
			{
				if(current.data.equals(dataToBeSearched))
				{
					return true;
				}
				current = current.next;
			}
			return false;
	}
	public <T> boolean delete(T dataToBedeleted)
	{
		if(firstNode.data.equals(dataToBedeleted))
		{
			firstNode = firstNode.next;
			return true;
		}
		else if(lastNode.data.equals(dataToBedeleted))
		{
			Node currentNode = firstNode;
			Node prevNode = null;
			while(currentNode != lastNode)
			{
				prevNode = currentNode;
				currentNode = currentNode.next;
			}
			prevNode.next = null;
			return true;
		}
		else
		{
			Node prevrefrence = null;
			boolean status  = false;
			Node current = firstNode;
			
			while(current != lastNode && !(status=(current.data.equals(dataToBedeleted))))
			{
				prevrefrence = current;
				current = current.next;
			}
			if(status)
			{
				prevrefrence.next = current.next;
				return true;
			}
			
		}
		return false;
	}
	public void itirate()
	{
		Node currentNode = firstNode;
		while(currentNode != null)
		{
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	public int size()
	{
		int size = 0;
		Node currentNode = firstNode;
		while(currentNode != null)
		{
			size++;
			currentNode = currentNode.next;
		}
		return size;
	}
	public <T> T dataAtPosition(int position)
	{
		int location = 0;
		if(position >= this.size())
		{
			return null;
		}
		else
		{
			Node currentNode = firstNode;
			while(location != position)
			{
				currentNode = currentNode.next;
				location++;
			}
			
			return  (T) currentNode.data;
		}
	}
	public void deletelast()
	{
		if(this.size()==1)
		{
			firstNode = null;
		}
		else
		{
		Node prevNode=null;
		Node currentNode = firstNode;
		while(currentNode.next !=null)
		{
			prevNode = currentNode;
			currentNode = currentNode.next;
		}
		lastNode = prevNode;
		lastNode.next = null;
		}
	}
	public <T> void push(T data)
	{
		this.add(data);
	}
	public <T> T pop()
	{
		T data =(T) lastNode.data;
		this.deletelast();
		return data;
	}
public <T> T peek()
	{
		return (T) lastNode.data;
	}
	public boolean isEmpty()
	{
		if(this.size() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}	
	}

}
