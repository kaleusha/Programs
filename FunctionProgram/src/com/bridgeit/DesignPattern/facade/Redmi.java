package com.bridgeit.DesignPattern.facade;

public class Redmi implements MobileShop
{

	@Override
	public void mobileName() {
		System.out.println("Redmi Prime 3s");
		
	}

	@Override
	public void price() {
		System.out.println("Rs.9999.00");
		
	}
	

}
