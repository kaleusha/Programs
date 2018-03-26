/******************************************************************************
 *  Purpose: Behavioral Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.behavioral;

public class Book implements ItemElement
{
	 private int price;
	 private String isbnNumber;
	public Book(int price,String isbnNumber)
	{
		this.price=price;
		this.isbnNumber=isbnNumber;
	}
	public int getPrice() {
		return price;
	}
	
	public String getIsbnNumber() {
		return isbnNumber;
	}
	@Override
	public int accept(ShopingCartVisitor visitor) {
		return visitor.visit(this);
		
	}

}
