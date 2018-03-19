/******************************************************************************
 *  Purpose: Find The Roots Of Non-negative NUmbers 
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   12-03-2018
 ******************************************************************************/
package com.bridgeit.Algorithprogram;

import com.bridgeit.utility.Utility;

public class Sqrt /* Newtons law is used finding the root of nonnegative numbers */
{

	public static void main(String[] args) { 
        System.out.println("Enter The Value of c");
        double c=Utility.inputInteger();
        double epsilon = 1e-15;    
        double t = c;              
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }
       
        System.out.println(t);  //print the square root  
	}

}
