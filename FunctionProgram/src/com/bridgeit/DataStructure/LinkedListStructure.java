/******************************************************************************  
 *  Purpose: Linked list Structure And Implementation
 *  @author  
 *  @version 1.0
 *  @since   07-03-2018
 ******************************************************************************/
package com.bridgeit.DataStructure;

class Node<T>
{
	T data;
	Node<T> next;
	public Node(T data)
	{
		this.data = data;
		next = null;
	}
}
public class LinkedListStructure<T>
{
		Node<T> root;
		Node<T> end;
		int size;
		
		/**
		 * public constructor 
		 */
		public LinkedListStructure()
		{
			root = null;
			end = null;
			size = 0;
		}
		
		
		/**
		 * @param add the data into the list
		 */
		public void add(T hasharray)
		{
			Node<T> node = new Node<T>(hasharray);
			if(root == null) 
			{
				root = node;
			}
			else
			{
				//end.next = node;
				Node<T> temp =root;
				while(temp.next != null)
				{
					temp = temp.next;
				}
				temp.next = node;
			}
			//end = node;
		}
		
		/**
		 * @param search the data from the file
		 * @return
		 */
		public boolean search(T data)
		{
			Node<T> temp =root;
			while(temp != null)
			{
				if(temp.data.equals(data))
				{
					 return true;
				
				}
				temp = temp.next;
			}
			return false;
		}

		/**
		 * @if list is empty then return true otherwise false
		 */
		public boolean isEmpty()
		{
			if(root == null)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		/**
		 * @param insert the data at appropriate position
		 * @param data
		 */
		public void insert(int pos,T data)
		{
			int tempPos=0;
			Node<T> node = new Node<T>(data);
			Node<T> currNode,prevNode;
			currNode = prevNode = root;
			if(size < pos)
			{
				add(data);
			}
			else
			{
				while(pos != tempPos)
				{
					prevNode = currNode;
					currNode = currNode.next;
					tempPos++;
				}
				prevNode.next = node;
				node.next = currNode;
			}
		}
		/**
		 * @param remove the data
		 */
		public void remove(T data)
		{

			Node<T> temp = root;
			
			if(root.data.equals(data)) 
			{
				root = root.next;
			}
			
			else
			{
				Node<T> prev = null;
				while(temp.next != null && temp.data!=data)
				{
					prev = temp;
					temp = temp.next;
				}
				if(temp.data.equals(data))
				{
					prev.next = temp.next;
				
				}
			}
			
		}
		
		/**
		 * @param remove the data from appropriate position
		 */
		public void removeAt(int pos)
		{
			int tempPos=0;
			Node<T> prevNode=root;
			Node<T> currNode = root;
			if(pos == 0)
			{
				root = root.next;
			}
			else if(pos==(this.size()-1))
			{
				while(currNode.next != null)
				{
					prevNode = currNode;
					currNode = currNode.next;
				}
				prevNode.next = prevNode.next.next;
				end=prevNode;
			}
			else if(pos < this.size())
			{
				while(currNode.next != null)
				{
					if(pos == tempPos)
					{
						prevNode.next = prevNode.next.next;
						break;
					}
					prevNode = currNode;
					currNode = currNode.next;
					tempPos++;
				}
			}
			else
			{
				System.out.println("Given index does not exist");
			}
		}
		
		/**
		 * @return the size of list
		 */
		public int size()
		{
			Node<T> temp = root;
			int size=0;
			while(temp != null)
			{
				temp = temp.next;
				size++;
			}
			return size;
		}
		
		/**
		 * Print the list
		 */
		public void printlist()
		{
			Node<T> temp = root;
			//System.out.println("YOUR FILE DATA IS:==>>");
			while(temp != null)
			{
				System.out.println(temp.data+" ");
				temp = temp.next;
			}
		}
		public void append(T data)
		{
			add(data);
		}
		
		public int index(T data)
		{
			Node<T> temp =root;
			int index=0;
			while(temp != null)
			{
				if(temp.data.equals(data))
				{
					return index;
				}
				temp = temp.next;
				index++;
			}
			return index;
		}
		public T pop()
		{
			T data=end.data;
			removeAt(this.size()-1);
			return data;
		}
		public T pop(int pos)
		{
			T tempData=get(pos);
			removeAt(pos);
			return tempData;
		}
		public T get(int index)
		{
			Node<T> tempCurrent=new Node<T>(null);
			if(index>=0 && index<this.size())
			{
				tempCurrent=root;
				for(int i=0;i<index;i++)
				{
					tempCurrent=tempCurrent.next;
				}
			}
			else
			{
				System.out.println("Invalid index");
			}
			
			return tempCurrent.data;
		}
	}

