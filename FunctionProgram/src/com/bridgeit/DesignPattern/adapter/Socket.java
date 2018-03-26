/******************************************************************************
 *  Purpose: Adapter Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.adapter;

public class Socket {
	public Volt getVolt()
	{
		return new Volt(120);
	}

}
