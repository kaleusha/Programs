package com.bridgeit.DesignPattern;

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
