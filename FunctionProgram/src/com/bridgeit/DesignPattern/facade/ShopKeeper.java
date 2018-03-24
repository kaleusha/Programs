package com.bridgeit.DesignPattern.facade;

public class ShopKeeper 
{
	private MobileShop redmi;
	private MobileShop samsung;
	
	public ShopKeeper()
	{
		 redmi=new Redmi();
		 samsung=new Samsung();
	}
	public void redmiSale()
	{
		redmi.mobileName();
		redmi.price();
	}
	public void samsungSale()
	{
		samsung.mobileName();
		samsung.price();
	}

}
