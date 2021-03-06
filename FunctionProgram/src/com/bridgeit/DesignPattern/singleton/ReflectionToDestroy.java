/******************************************************************************
 *  Purpose: Singleton Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.singleton;

import java.lang.reflect.Constructor;

public class ReflectionToDestroy {
	
	public static void main(String[] args) {
		EagerInitialization insatce1= EagerInitialization.getinstance();
		EagerInitialization insatnce2=null;
		
		try {
			Constructor[] constructors=EagerInitialization.class.getDeclaredConstructors();
			for(Constructor constructor: constructors)
			{
				//Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				insatnce2=(EagerInitialization) constructor.newInstance();
				break;
			}
		 } catch (Exception e) {
	         e.printStackTrace();
	     }
		System.out.println(insatce1.hashCode());
		System.out.println(insatnce2.hashCode());
	}

}
