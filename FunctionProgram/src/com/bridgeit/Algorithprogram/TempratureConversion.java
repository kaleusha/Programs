package com.bridgeit.Algorithprogram;

import java.util.Scanner;

public class TempratureConversion
{
	public void celTofar(double cel) 
	{
         
        double far=(cel*(9/5))+32;
        System.out.println("\nFahrenheit : "+far);
    }
    public void farTocel(double far) 
    {
        double cel=((far-32)*(5/9));
        System.out.println("\nCelsius Temperature : "+cel);
    }

	public static void main(String[] args)
	{
		TempratureConversion tc=new TempratureConversion();
		    Scanner scan = new Scanner (System.in);
		    System.out.println("1.C->F \n2.F->C");
		    System.out.println("Select choice: ");
		    int ch= scan.nextInt();
		    
		    if (ch == 1) 
		    {
		    	 System.out.print("\nEnter celsius temperature : ");
	                double cel=scan.nextDouble(); 
	                tc.celTofar(cel);
		    }//if(ch == 2)
		    else
            {
                System.out.print("\nEnter fahrenheit temperature : ");
                double far=scan.nextDouble();
                tc.farTocel(far);
            }
		        
		    
    }


	

}
