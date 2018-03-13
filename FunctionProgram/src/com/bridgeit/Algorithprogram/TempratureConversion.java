/******************************************************************************
 *  Purpose: Temperature Conversion 
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   12-03-2018
 ******************************************************************************/
package com.bridgeit.Algorithprogram;

import com.bridgeit.utility.Utility;

public class TempratureConversion
{
	
	public static void main(String[] args)
	{
            Utility utility=new Utility();
		    System.out.println("1.Celsius->Fahrenheit \n2.Fahrenheit->Celsius");
		    System.out.println("Select choice: ");
		    int ch= utility.inputInteger();
		    
		    if (ch == 1) 
		    {
		    	 System.out.print("\nEnter celsius temperature : ");
	                double cel=utility.inputDouble();
	                utility.celTofar(cel);
		    }
		    else
            {
                System.out.print("\nEnter fahrenheit temperature : ");
                double far=utility.inputDouble();
                utility.farTocel(far);
            }
		        
		    
    }


	

}
