package com.bridgeit.DataStructure;
/******************************************************************************  
 *  Purpose: Linked list 
 * @author  
 *  @version 1.0
 *  @since   07-03-2018
 ******************************************************************************/
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
		public void add(T data)
		{
			Node<T> node = new Node<T>(data);
			if(root == null) 
			{
				root = node;
			}
			else
			{
				end.next = node;
			}
			end = node;
		}
		
		/**
		 * @param search the data from the file
		 * @return
		 */
		public boolean search(T data)
		{
			Node<T> temp =root;
			boolean isPresent=false;
			while(temp != null)
			{
				if(temp.data.equals(data))
				{
					isPresent=true;
				}
				temp = temp.next;
			}
			return isPresent;
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
			Node<T> currNode = root;
			Node<T> prevNode = root;
			if(root.data.equals(data)) 
			{
				root = root.next;
			}
			else if(end.data.equals(data))
			{
				while(currNode != null)
				{
					prevNode = currNode;
					currNode = currNode.next;
				}
				prevNode.next = prevNode.next.next;
				end = prevNode;
			}
			else
			{
				while(currNode != null)
				{
					if(currNode.data.equals(data))
					{
						prevNode.next = currNode.next;
						break;
					}
					prevNode = currNode;
					currNode = currNode.next;
				}
			}
			if(size != 0)
			{
				size--;
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
			System.out.println("YOUR FILE DATA IS:==>>");
			while(temp != null)
			{
				System.out.print(temp.data+" ");
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

