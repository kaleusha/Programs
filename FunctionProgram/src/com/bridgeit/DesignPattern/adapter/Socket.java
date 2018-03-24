package com.bridgeit.DesignPattern.adapter;

public class Socket {
	public Volt getVolt()
	{
		return new Volt(120);
	}

}
