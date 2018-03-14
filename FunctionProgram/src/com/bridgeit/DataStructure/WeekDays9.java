/******************************************************************************
 *  Purpose: Print Calendar Using Queue
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   14-03-2018
 ******************************************************************************/
package com.bridgeit.DataStructure;

import java.util.LinkedList;
import java.util.Queue;

import com.bridgeit.utility.Utility;

public class WeekDays9 {
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter the month");
		int month = utility.inputInteger();
		System.out.println("Enter the year");
		int year = utility.inputInteger();
		int start = Utility.dayOfWeek(month,1, year);
		Queue week  = new LinkedList<>();
		int maxDay = Utility.maxDay(month, year);
		int numberOfObject;
		int date = 0;
		if (maxDay + start > 35) {
			numberOfObject = 6;
		} else {
			numberOfObject = 5;
		}
		for (int i = 0; i < numberOfObject; i++) {
			week.add(new LinkedList<>());
		}
		for (int i = 0; i < numberOfObject; i++) {
			Queue queue = (Queue) week.poll();
			if (i == 0) {
				for (int j = 0; j < start; j++)
				{
					queue.add(" ");
				}
				for(int j = start;j<7;j++)
				{
					queue.add(++date);
				}
			}
			else
			{
				for(int j = 0; j <7;j++)
				{
					queue.add(++date);
					if(date == maxDay)
					{
						break;
					}
				}
				
			}
			week.add(queue);
		}
		System.out.println("Sun"+"\t"+"Mon"+"\t"+"Tue"+"\t"+"Wed"+"\t"+"Thu"+"\t"+"Fri"+"\t"+"Sat");
		for(int i = 0; i < numberOfObject; i++)
		{
			Queue queue = (Queue) week.poll();
			int length = queue.size();
			for(int j = 0; j <length; j++)
			{
				System.out.print(queue.poll());
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
