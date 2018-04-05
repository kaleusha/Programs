/******************************************************************************
 *  Purpose: List Structure
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   14-03-2018
 ******************************************************************************/
package com.bridgeit.DataStructure;

import com.bridgeit.utility.Utility;

class OrderNode<T> 
{
	T data;
	OrderNode<T> next;
	public OrderNode(T data)
	{
		this.data = data;
		next = null;
	}
}
public class OrderedListStructure<T> 
{
	OrderNode<T> root;
	OrderNode<T> end;
		int size;
		
		/**
		 * public constructor 
		 */
		public void OrderListStructure()
		{
			root = null;
			end = null;
			size = 0;
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
		 * @param add the data into the list
		 */
		public void add(T data)
		{
			OrderNode<T> node = new OrderNode<T>(data);
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
			OrderNode<T> temp =root;
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
		 * @param insert the data at appropriate position
		 * @param data
		 */
		public void insert(T data,int pos)
		{
			
			OrderNode<T> node = new OrderNode<T>(data);
			OrderNode<T> temp = root;
			
			if(size < pos)
			{
				add(data);
			}
			else
			{
				int count=1;
				while(count<=pos)
				{
					temp=temp.next;
					count++;
				}
				node.next=temp.next.next;
				temp.next=node;
				
			}
		}
		/**
		 * @param remove the data
		 */
		public void remove(T data)
		{
			OrderNode<T> temp = root;
			
			if(root.data.equals(data)) 
			{
				root = root.next;
			}
			
			else
			{
				OrderNode<T> prev = null;
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
			OrderNode<T> prevNode=root;
			OrderNode<T> currNode = root;
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
			OrderNode<T> temp = root;
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
			OrderNode<T> temp = root;
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
			OrderNode<T> temp =root;
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
		public int pop(int pos)
		{
			int tempData=get(pos);
			removeAt(pos);
			return tempData;
		}
		public int get(int index)
		{
			OrderNode<T> tempCurrent=new OrderNode<T>(null);
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
			
			return index;
		}
		
		public String toString()
		{
			String string="";
			
			OrderNode<T> temp=root;
			while(temp !=  null)
			{
				string = string+temp.data+" ";
				temp = temp.next;
			}
			return string;
		}
		
		public String[] sort(String arr[])
		{
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i].compareToIgnoreCase(arr[j]) > 0)
					{
						String temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.println("Array After Bubble Sort");  
	        for(int i=0; i < arr.length; i++)
	        {  
	                System.out.print(arr[i] + " ");  
	        }
			return arr;  
				
		}
		public String[] sortList(OrderedListStructure<T> list)
		{
			String string = list.toString();
			String array[] = string.split(" ");
			String array1[]=sort(array);
			//Utility.writeFileinteger(list);
			return array1;
		}
		
		

}
