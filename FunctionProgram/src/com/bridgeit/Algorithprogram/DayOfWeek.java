package com.bridgeit.Algorithprogram;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Month");
		int m=scanner.nextInt();
		System.out.println("Enter day");
		int d=scanner.nextInt();
		System.out.println("Enter Year");
		int y =scanner.nextInt();
		int y0,x,m0,d0;
		y0=y-(14-m)/12;
		x=y0+y0/4-y0/100+y0/400;
		m0=m+12*((14-m)/12)-2;

		d0 =  Math.floorMod((d + x + 31*m0 / 12), 7);
		String weekDay;
		
		 switch(d0) 
	        {  

	            case 0 :
	            weekDay = " Sunday ";
	            System.out.println(weekDay);
	            break;
	           // return  weekDay;

	            case 1:  
	            weekDay = " Monday ";
	            System.out.println(weekDay);
	            break;
	         //   return  weekDay;

	            case 2:  
	            weekDay = " Tuesday ";
	            System.out.println(weekDay);
	            break;
	          //  return  weekDay;

	            case 3:  
	            weekDay = " Wednesday ";
	            System.out.println(weekDay);
	            break;
	         //   return  weekDay;

	            case 4:  
	            weekDay = " Thursday ";
	            System.out.println(weekDay);
	            break;
	        //    return weekDay;

	            case 5:  
	            weekDay = " Friday ";
	            System.out.println(weekDay);
	            break;
	        //    return weekDay;

	            case 6:  
	            weekDay = " Saturday "; 
	            System.out.println(weekDay);
	            break;
	       //     return weekDay;
	            
	            default:
	           // 	return error;
	        }

	}

}
