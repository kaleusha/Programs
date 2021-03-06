/******************************************************************************
 *  Purpose: Factory Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.factory;

public class TestFactory {
	
	public static void main(String[] args) 
	{
		Computer pc = ComputerFactory.getComputer("pc","4 GB","500 GB","2.4 GHz");
		Computer server = ComputerFactory.getComputer("server","8 GB","1 TB","2.9 GHz");
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
	}


}
