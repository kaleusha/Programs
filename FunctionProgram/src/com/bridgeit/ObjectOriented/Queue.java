/******************************************************************************
 *  Purpose: Queue Structure Implementation.
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   17-03-2018
 ******************************************************************************/
package com.bridgeit.ObjectOriented;

import java.util.NoSuchElementException;

public class Queue {
	 protected Node front, rear;
	    public int size;
	 
	   
	    public Queue()
	    {
	        front = null;
	        rear = null;
	        size = 0;
	    }    
	   
	    public boolean isEmpty()
	    {
	        return front == null;
	    }    
	   
	   
	    public void insert(String symbol)
	    {
	        Node nptr = new Node(symbol, null);
	        if (rear == null)
	        {
	            front = nptr;
	            rear = nptr;
	        }
	        else
	        {
	            rear.setLink(nptr);
	            rear = rear.getLink();
	        }
	        size++ ;
	    }    
	   
	    public Object remove()
	    {
	        if (isEmpty() )
	            throw new NoSuchElementException("Underflow Exception");
	        Node ptr = front;
	        front = ptr.getLink();        
	        if (front == null)
	            rear = null;
	        size-- ;        
	        return ptr.getData();
	    }    
	     
	    public void display()
	    {
	        System.out.print("\nQueue = ");
	        if (size == 0)
	        {
	            System.out.print("Empty\n");
	            return ;
	        }
	        Node ptr = front;
	        while (ptr != rear.getLink() )
	        {
	            System.out.print(ptr.getData()+" ");
	            ptr = ptr.getLink();
	        }
	        System.out.println();        
	    }

}
