/******************************************************************************
 *  Purpose: Adapter Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.adapter;

public interface SocketAdapter 
{
	public Volt get120Volt();
	
	public Volt get12Volt();
	
	public Volt get3Volt();

}
