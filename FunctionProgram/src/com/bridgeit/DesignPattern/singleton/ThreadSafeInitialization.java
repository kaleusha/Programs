/******************************************************************************
 *  Purpose: Singleton Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.singleton;

public class ThreadSafeInitialization {
	private static ThreadSafeInitialization instance;
	
	private ThreadSafeInitialization() {
		
	}
	 public static synchronized ThreadSafeInitialization getinsatnce()
	 {
		 if(instance==null)
		 {
			 instance=new ThreadSafeInitialization();
		 }
		return instance;
	 }

}
