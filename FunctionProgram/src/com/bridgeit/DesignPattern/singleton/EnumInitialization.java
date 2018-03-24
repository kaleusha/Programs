package com.bridgeit.DesignPattern.singleton;

public enum EnumInitialization {
	instance;
	
	public static EnumInitialization add()
	{
		return instance;
		
	}

}
