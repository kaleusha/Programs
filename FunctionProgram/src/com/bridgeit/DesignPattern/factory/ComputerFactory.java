/******************************************************************************
 *  Purpose: Factory Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.factory;

public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu)
	{
		if("PC".equalsIgnoreCase(type)) 
            return new PC(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type)) 
			return new Server(ram, hdd, cpu);
		
		return null;
	}
}
