package com.bridgeit.program;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args)
	{
		double t,v,w;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Temprature");
		t=scanner.nextDouble();
		System.out.println("Enter wind speed");
		v=scanner.nextDouble();
		if(t>50 && (v>3&&v<120))
		{
			w=35.74+0.6215*t+(0.4275*t-35.75)* Math.pow(v,0.16);
			System.out.println("Temprature: "+t);
			System.out.println("speed: "+v);
			System.out.println("windchill: "+w);
		}else
		{
			System.out.println("Invalid Temprature or Speed");
		}
		
	}

}
