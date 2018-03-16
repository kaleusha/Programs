package com.bridgeit.DataStructure;

class Node1<T>
{
	Node1 next;
	T data;
	Node1(T data1)
	{
		this.data = (T) data1;
	}
}
public class StackCalender10 {
	Node1 firstNode;
	Node1 lastNode;
	public <T> void add(T data)
	{
		Node1 newNode = new Node1(data);
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
		Node1 current = firstNode;
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
			Node1 currentNode = firstNode;
			Node1 prevNode = null;
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
			Node1 prevrefrence = null;
			boolean status  = false;
			Node1 current = firstNode;
			
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
		Node1 currentNode = firstNode;
		while(currentNode != null)
		{
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	public int size()
	{
		int size = 0;
		Node1 currentNode = firstNode;
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
			Node1 currentNode = firstNode;
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
			Node1 prevNode=null;
			Node1 currentNode = firstNode;
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
