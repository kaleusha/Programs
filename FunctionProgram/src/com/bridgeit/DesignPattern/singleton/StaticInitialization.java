/******************************************************************************
 *  Purpose: Singleton Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.singleton;

public class StaticInitialization {
	private static StaticInitialization instance;
	private StaticInitialization() {}
	
	static {
		
			try {
				instance=new StaticInitialization();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public static StaticInitialization getinstance()
	{
		return instance;
	}

}
