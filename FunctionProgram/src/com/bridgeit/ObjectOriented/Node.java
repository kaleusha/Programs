/******************************************************************************
 *  Purpose: Node Structure 
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   17-03-2018
 ******************************************************************************/
package com.bridgeit.ObjectOriented;

public class Node {
	 protected Object data;
	    protected Node link;
	 
	   
	    public Node()
	    {
	        link = null;
	        data = 0;
	    }    
	   
	    public Node(Object data2,Node n)
	    {
	        data = data2;
	        link = n;
	    }    
	    
	    public void setLink(Node n)
	    {
	        link = n;
	    }    
	    
	    public void setData(int d)
	    {
	        data = d;
	    }    
	   
	    public Node getLink()
	    {
	        return link;
	    }    
	    
	    public   Object getData() {
	    	return  data;
	    }

}
