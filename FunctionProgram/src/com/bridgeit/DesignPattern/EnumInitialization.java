package com.bridgeit.DesignPattern;

public enum EnumInitialization {
	instance;
	
	public static EnumInitialization add()
	{
		return instance;
		
	}

}
