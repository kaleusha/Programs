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
