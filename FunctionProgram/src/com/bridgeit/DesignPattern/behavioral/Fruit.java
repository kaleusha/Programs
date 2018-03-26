/******************************************************************************
 *  Purpose: Behavioral Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.behavioral;


public class Fruit implements ItemElement {
	private int price;
	private int weight;
	private String name;
	public Fruit(int price,int weight,String name)
	{
		this.price=price;
		this.weight=weight;
		this.name=name;
	}
	public int getPrice() {
		return price;
	}
	public int getWeight() {
		return weight;
	}
	public String getName() {
		return name;
	}
	@Override
	public int accept(ShopingCartVisitor visitor)
	{
		return visitor.visit(this);	
		
	}

}
