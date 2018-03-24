package com.bridgeit.DesignPattern.behavioral;

public interface ShopingCartVisitor 
{
	public int visit(Book book);
	
	public int visit(Fruit fruit);
	

}
