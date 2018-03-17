/******************************************************************************
 *  Purpose: Stack Structure Implementation.
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   17-03-2018
 ******************************************************************************/
package com.bridgeit.ObjectOriented;

import java.util.NoSuchElementException;

public class Stack {
	 protected Node top ;
	    protected int size ;
	 
	    /*  Constructor  */
	    public Stack()
	    {
	        top = null;
	        size = 0;
	    }    
	   
	    public boolean isEmpty()
	    {
	        return top == null;
	    }    
	       
	   
	    public void push(String symbol)
	    {
	        Node nptr = new Node (symbol, null);
	        if (top == null)
	            top = nptr;
	        else
	        {
	            nptr.setLink(top);
	            top = nptr;
	        }
	        size++ ;
	    }    
	    
	    public Object pop()
	    {
	        if (isEmpty() )
	            throw new NoSuchElementException("Underflow Exception") ;
	        Node ptr = top;
	        top = ptr.getLink();
	        size-- ;
	        return ptr.getData();
	    }    
	     
	    
	    public void display()
	    {
	        System.out.print("\nStack = ");
	        if (size == 0) 
	        {
	            System.out.print("Empty\n");
	            return ;
	        }
	        Node ptr = top;
	        while (ptr != null)
	        {
	            System.out.print(ptr.getData()+" ");
	            ptr = ptr.getLink();
	        }
	        System.out.println();        
	    }

}
