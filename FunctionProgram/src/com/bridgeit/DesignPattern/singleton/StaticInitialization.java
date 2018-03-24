package com.bridgeit.DesignPattern.singleton;

public class StaticInitialization {
	private static StaticInitialization instance;
	private StaticInitialization() {}
	
	static {
		
			try {
				instance=new StaticInitialization();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public static StaticInitialization getinstance()
	{
		return instance;
	}

}
