package com.bridgeit.DesignPattern;

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
