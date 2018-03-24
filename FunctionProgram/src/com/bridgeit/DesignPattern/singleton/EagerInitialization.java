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
