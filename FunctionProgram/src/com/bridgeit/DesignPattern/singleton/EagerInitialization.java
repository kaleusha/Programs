/******************************************************************************
 *  Purpose: Singleton Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.singleton;

public class EagerInitialization {
			
	private static final  EagerInitialization instance=new EagerInitialization();
	
	//constructor
	private EagerInitialization() {	}
	
	//method
	public static EagerInitialization getinstance()
	{
		return instance;
	}
	

}
