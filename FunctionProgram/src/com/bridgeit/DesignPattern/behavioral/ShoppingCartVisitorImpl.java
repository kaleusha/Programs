/******************************************************************************
 *  Purpose: Behavioral Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.behavioral;

public class ShoppingCartVisitorImpl implements ShopingCartVisitor
{

	public int visit(Book book) {
		int cost=0;
		//apply discount if book price is greater than 50
		if(book.getPrice() > 50){
			cost = book.getPrice()-5;
		}else cost = book.getPrice();
		System.out.println("Book ISBN::"+book.getIsbnNumber() + " cost ="+cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPrice()*fruit.getWeight();
		System.out.println(fruit.getName() + " cost = "+cost);
		return cost;
	}

}