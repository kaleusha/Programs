package com.bridgeit.program;

import java.sql.Timestamp;

public class StopWatch2 {
	long startTime;
	long stopTime;
	
	public void start() 
	{
	    startTime = System.currentTimeMillis();
	   
	    System.out.println("Start time is:"+startTime);
	}
    public void stop() 
	{
	    stopTime = System.currentTimeMillis();
	   
	    System.out.println("Stop time is:"+stopTime);
    }
    
	public void elapseTime()
	{
		long elapseTimes=startTime-stopTime;
		System.out.println("elapseTime:"+elapseTimes);
	}
	public static void main(String[] args) {
		
		
		StopWatch sw=new StopWatch();
		sw.start();
	  
	    sw.stop();
	    sw.elapseTime();
	}

}
