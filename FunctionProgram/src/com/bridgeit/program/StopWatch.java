package com.bridgeit.program;

import java.sql.Timestamp;

public class StopWatch {
	
		long startTime;
		long stopTime;
		boolean running;
		public void start() 
		{
		    this.startTime = System.currentTimeMillis();
		    this.running = true;
		    System.out.println("Start time is:"+new Timestamp(startTime));
		}
        public void stop() 
		{
		    this.stopTime = System.currentTimeMillis();
		    this.running = false;
		    System.out.println("Stop time is:"+new Timestamp(stopTime));
	    }
        
		public void elapseTime()
		{
			long elapseTimes=startTime-stopTime;
			System.out.println("elapseTime:"+new Timestamp(elapseTimes));
		}
		public static void main(String[] args) {
			
			long starttime=System.currentTimeMillis();
			System.out.println("Time Chek"+new Timestamp(System.currentTimeMillis()));
			StopWatch sw=new StopWatch();
			sw.start();
		   /* for(int i=0;i<40;i++)
		    {
		    	System.out.print("i valie is:"+i);
		    }*/
		    sw.stop();
		    sw.elapseTime();
		}
		/*Scanner scanner=new Scanner(System.in);
		System.out.println("Enter StartTime in hours ");
		 int startTime=scanner.nextInt();
		 System.out.println("Enter EndTime in hours ");
		 int endTime=scanner.nextInt();
		 int elapseTime=endTime-startTime;
		 System.out.println("Elapses Time is:"+elapseTime);*/
		
	

}
