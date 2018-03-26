/******************************************************************************
 *  Purpose: Adapter Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.adapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter
{

	@Override
	public Volt get120Volt()
	{
		return getVolt();
	}

	@Override
	public Volt get12Volt()
	{
		Volt v= getVolt();
		return convertVolt(v,10);
	}

	private Volt convertVolt(Volt v, int i) 
	{
		return new Volt(v.getVolts()/i);
		
	}

	@Override
	public Volt get3Volt() 
	{
		Volt v= getVolt();
	    return convertVolt(v,40);
	}

}
