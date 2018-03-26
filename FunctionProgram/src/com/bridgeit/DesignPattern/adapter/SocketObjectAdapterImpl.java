/******************************************************************************
 *  Purpose: Adapter Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter
{
	private Socket sock = new Socket();

	@Override
	public Volt get120Volt()
	{
		return sock.getVolt();
	}

	@Override
	public Volt get12Volt() 
	{
		Volt v= sock.getVolt();
		return convertVolt(v,10);
	}

	private Volt convertVolt(Volt v, int i) 
	{
		return new Volt(v.getVolts()/i);
	}

	@Override
	public Volt get3Volt()
	{
		Volt v= sock.getVolt();
		return convertVolt(v,40);
	}

}
