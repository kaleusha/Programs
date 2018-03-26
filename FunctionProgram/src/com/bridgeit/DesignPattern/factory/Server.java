/******************************************************************************
 *  Purpose: Factory Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.factory;

public class Server extends Computer {
	private String ram;
	private String hdd;
	private String cpu;
	
	public Server(String ram, String hdd, String cpu)
	{
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	
	@Override
	public String getRAM() {
		return this.ram;
	}
	@Override
	public String getHDD() {
		return this.hdd;
	}
	@Override
	public String getCPU() {
		return this.cpu;
	}

}
