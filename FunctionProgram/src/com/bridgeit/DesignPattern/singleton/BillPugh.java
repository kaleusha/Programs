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
