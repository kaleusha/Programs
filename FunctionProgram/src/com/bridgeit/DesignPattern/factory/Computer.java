/******************************************************************************
 *  Purpose: Factory Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.factory;

public abstract class Computer 
{
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	public String toString()
	{
		return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
		
	}

}
