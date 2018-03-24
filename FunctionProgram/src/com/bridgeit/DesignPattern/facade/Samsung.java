package com.bridgeit.DesignPattern.facade;

public class Samsung implements MobileShop
{

	@Override
	public void mobileName() {
		System.out.println("Smasung Galaxy");
		
	}

	@Override
	public void price() {
		System.out.println("Rs.10000.00");
	}

}
