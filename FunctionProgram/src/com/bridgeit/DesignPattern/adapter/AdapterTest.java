/******************************************************************************
 *  Purpose: Adapter Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.adapter;

public class AdapterTest
{
	public static void main(String[] args) 
    {
		
		ClassAdapter();
		ObjectAdapter();
	}

	private static void ObjectAdapter() 
	{
		SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
		Volt v3 = getVolt(socketAdapter,3);
		Volt v12 = getVolt(socketAdapter,12);
		Volt v120 = getVolt(socketAdapter,120);
		System.out.println("Object Adapter v3 volts ="+v3.getVolts());
		System.out.println("Object Adapter v12 voltsr="+v12.getVolts());
		System.out.println("Object Adapter v120 volts="+v120.getVolts());
	}

	private static void ClassAdapter() {
		SocketAdapter socketAdapter = new SocketClassAdapterImpl();
		Volt v3 = getVolt(socketAdapter,3);
		Volt v12 = getVolt(socketAdapter,12);
		Volt v120 = getVolt(socketAdapter,120);
		System.out.println("Class Adapter v3 volts="+v3.getVolts());
		System.out.println("Class Adapter v12 volts="+v12.getVolts());
		System.out.println("Class Adapter v120 volts="+v120.getVolts());
	}
	
	private static Volt getVolt(SocketAdapter socketAdapter, int i) {
		switch (i)
		{
		case 3: 
			return socketAdapter.get3Volt();
		case 12: 
			return socketAdapter.get12Volt();
		case 120: 
			return socketAdapter.get120Volt();
		default: 
			return socketAdapter.get3Volt();
		}
	}

}
