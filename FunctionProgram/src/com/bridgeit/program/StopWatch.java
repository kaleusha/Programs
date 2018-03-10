/******************************************************************************
 *  Purpose: Read Start And End Time And Print Elapsed Time 
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
package com.bridgeit.program;

import com.bridgeit.utility.Utility;

public class StopWatch {

	public static void main(String[] args) {

		Utility utility = new Utility();
		System.out.println("Press 1 to start the time: ");
		int choice = utility.inputInteger();
		double START_TIMER = Utility.start();
		while (choice == 1) {

			System.out.println("Press 2 to stop the time: ");
			choice = utility.inputInteger();
		}
		double STOP_TIMER = Utility.stop();
		double time = Utility.getElapsedTime(START_TIMER, STOP_TIMER);
		System.out.println("Total Time Elapsed(in millisec) is:" + time);
		System.out.println("Converting millisec to seconds: " + (time % 1000) + " sec");

	}
}
