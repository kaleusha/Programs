/******************************************************************************
 *  Purpose: Singleton Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.singleton;

public class LazyInitiolizatiion {
	private static LazyInitiolizatiion instance;
	
	private LazyInitiolizatiion() {}
	
	public static  LazyInitiolizatiion getinsatance() {
		if(instance==null)
		{
		instance= new LazyInitiolizatiion();
		}
		return instance;
	}

}
