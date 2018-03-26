/******************************************************************************
 *  Purpose: Singleton Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.singleton;

public enum EnumInitialization {
	instance;
	
	public static EnumInitialization add()
	{
		return instance;
		
	}

}
