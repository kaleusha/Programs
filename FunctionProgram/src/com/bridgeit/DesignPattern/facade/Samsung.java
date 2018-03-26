/******************************************************************************
 *  Purpose: Facade Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
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
