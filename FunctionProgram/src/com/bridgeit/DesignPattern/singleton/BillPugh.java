/******************************************************************************
 *  Purpose: Singleton Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.singleton;

public class BillPugh {
	private BillPugh() {}
	
	private static class Helper
	{
		private static final BillPugh instance=new BillPugh();
	}
	public static BillPugh getinstance()
	{
		return Helper.instance;
	}

}
