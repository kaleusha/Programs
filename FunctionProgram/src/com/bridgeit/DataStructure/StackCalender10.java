/******************************************************************************
 *  Purpose: Print Calendar Using Stack
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   14-03-2018
 ******************************************************************************/
package com.bridgeit.DataStructure;

class Node1<T>
{
	@SuppressWarnings("rawtypes")
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
	/**
	 * @param dataToBeSearched
	 * @return
	 */
	public <T> boolean search(T dataToBeSearched) {
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
	
	public void itirate()
	{
		@SuppressWarnings("rawtypes")
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
	
}
