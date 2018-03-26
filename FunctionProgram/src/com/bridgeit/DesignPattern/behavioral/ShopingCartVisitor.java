/******************************************************************************
 *  Purpose: Behavioral Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.behavioral;

public interface ShopingCartVisitor 
{
	public int visit(Book book);
	
	public int visit(Fruit fruit);
	

}
