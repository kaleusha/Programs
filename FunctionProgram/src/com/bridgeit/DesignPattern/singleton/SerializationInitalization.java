package com.bridgeit.DesignPattern.singleton;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SerializationInitalization implements Serializable
{
	private static final long serialid=-764538796L;
	
 	private SerializationInitalization() {}
 	private static class Helper
 	{
 		private static final SerializationInitalization instance=new SerializationInitalization();
 		
 	}
 	public static SerializationInitalization getinstance()
 	{
		return Helper.instance;
 		
 	}

}
