/******************************************************************************
 *  Purpose: Find Out Wind  
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
package com.bridgeit.program;

import com.bridgeit.utility.Utility;

public class WindChill {
	public static void main(String[] args)
	{
		Utility utility=new Utility();
		double temprature,speed;
		System.out.println("Enter Temprature");
		temprature=utility.hashCode();
		System.out.println("Enter wind speed");
		speed=utility.hashCode();
		Utility.windChill(temprature,speed);
		
		
	}

}
