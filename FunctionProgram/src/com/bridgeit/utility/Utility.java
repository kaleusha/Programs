package com.bridgeit.utility;

import java.util.Random;
import java.util.Scanner;

public class Utility {

	public static void leapYear(int year) {

		if(year%100==0)
		{
			if(year%400==0)
			{
				System.out.println(+year+" Is Leap Year");
			}else
			{
				System.out.println(+year+" Is Not Leap Year");
			}
		}else
			{
				if(year%4==0)
				{
					System.out.println(+year+" Is Leap Year");
				}else
				{
					System.out.println(+year+" Is Not Leap Year");
				}
			}
	}

	public static void power(int number)
	{
		int mult=2;
		for(int i=0;i<number;i++)
		{
			if(i==0)
			{
				System.out.println("2^0=1");
			}
			else
			{
				int j=1;
				j=j*mult;
				System.out.println("2^"+i+ "="+j);
				mult=mult*2;
			}
		}
		
		/*for(int i=0;i<number;i++)
		 {
			 if(i==0)
			 {
				 System.out.println("2^0=1");
			 }else
			 {
				 double result=Math.pow(2, i);  
				 System.out.println(result);
			 }
		 }*/
	}
	
	public static void grambler(int stake,int goal,int trials)
	{
		int win=0;
		int loss=0;
	   for(int t=0;t<trials;t++)
	   {
		 int cash=stake;
		 while (cash > 0 && cash < goal)
		 {
                
                if (Math.random() < 0.5)
                {
                	cash--;     //loss
                    loss++;
                }
                else                     
                	cash++;     // win
                    win++;
         }
           /* if (cash == goal) 
            	win++; */
     }
	 int lossper=(loss*100)/trials;
	 int winper=(win*100)/trials;
	 System.out.println("loss is:"+lossper);
	 System.out.println("win is:"+winper);
	 }
	
	
	public static void couponRandom(int number)
	{
		int array[]=new int[number];
	    
	     Random rand = new Random();
	     //System.out.println("Random Elements are:");
	     for(int i=0;i<array.length;i++)
	     {
		    int r=rand.nextInt(number);
		    array[i]=r;
		   
		     for(int j=0;j<i;j++)
		    	 {
		    		 if(array[i]==array[j])
		    		 {
		    			i--;
		    			break;
		    		 }
		    	}
		     }
	       System.out.println("unique Elements Are:");
	     for(int i=0;i<number;i++)
	     {
	    	 System.out.println(array[i]);
	     }
	}
	
	
	public static void harmonic(int number)
	{
		double result = 0.0;
		if(number==0){
			System.out.println("   ");
		}
		else
			{
		      for(int i=1;i<=number;i++)
		       {
		
			    result = result + ( 1.0 / i);
		      }
			}
		
		
	   
		System.out.println("Harmonic Series is "+result);
	}
   
	
	
	public static void flipCoin(int number)
	{
		int tailcount=0;
		int headcount=0;
		float array[]=new float[number];
		for(int i=0;i<number;i++)
		{
			array[i]=(float) Math.random();
			System.out.println(array[i]);
		
		}
		for(int i=0;i<number;i++)	
		{
			if(array[i]<0.5)
			{
				tailcount++;
			}
			else
			{
				headcount++;
				
			}
		}
		System.out.println("The number of tails is"+tailcount);
		System.out.println("The number of head us"+headcount);
		int tailper =tailcount*100/number ;
		int headper = headcount*100/number;
		System.out.println("The percentage of tail is"+tailper);
		System.out.println("The percentage of head is"+headper);
	}
	
	
	
	public static void primeFactor(int number)
	{
		System.out.print("Prime Factors are : " );
        for (int i = 2; i <= number; i++)
        {
 
            while (number % i == 0)
            {
                System.out.print(i + " ");
                number = number / i;
            }
        }
	}
	
	
	public static void sumOf3Int(int[] array,int number)
	{
	        int count=0;
			boolean found=false;
			System.out.println("Triple Elements is:");
			for(int i=0;i<number-2;i++)
			{
				for(int j=i+1;j<number-1;j++)
				{
					for(int k=j+1;k<number;k++)
					{
						
					if(array[i]+array[j]+array[k]==0)
					{
						System.out.println(+array[i]);
						System.out.println(+array[j]);
						System.out.println(+array[k]);
						found=true;
						count++;
					}
					
					}
			
				}
			}
			{
			if(found==false)
				System.out.println("Triple not exist");
			}
			System.out.println("Triples Are: "+count);
		}
	
	
	public static void quadratic(int a,int b,int c)
	{
		int delta = b*b - 4*a*c;
		if(delta>0)
		{
			System.out.println("Roots Are Unequal");
			double root1=(-b + Math.sqrt(delta))/(2*a);
			double root2=(-b - Math.sqrt(delta))/(2*a);
			System.out.println("Roots are:"+root1);
			System.out.println("Roots are:"+root2);
			
		}else if(delta==0)
		{
			System.out.println("Roots Are Equal");
			double root1=(-b + Math.sqrt(delta))/(2*a);
			System.out.println("Roots are:"+root1);
		}else
		{
			System.out.println(" Roots Are Imaginary ");
		}
	}
	
	
	public static void matrix(int ch,int row,int colum )
	{
		Scanner scanner = new Scanner(System.in);
		switch(ch)
		{
		case 1:
			
		      int array[][]=new int[row][colum];
		      System.out.println("Enter Array Element:");
		      for(int i=0;i<row;i++)
		      {
			     for(int j=0;j<colum;j++)
			     {
				     array[i][j]=scanner.nextInt();
			     }
		      }
	          System.out.println("Matrix Elements Are:");
		      for(int i=0;i<row;i++)
		      {
			     for(int j=0;j<colum;j++)
			     {
				    System.out.print(array[i][j]);
				
			     }System.out.println("  ");
		      }break;
		      
		case 2:
			float array1[][]=new float[row][colum];
		      System.out.println("Enter Array Element:");
		      for(int i=0;i<row;i++)
		      {
			     for(int j=0;j<colum;j++)
			     {
				     array1[i][j]=scanner.nextFloat();
			     }
		      }
	          System.out.println("Matrix Elements Are:");
		      for(int i=0;i<row;i++)
		      {
			     for(int j=0;j<colum;j++)
			     {
				    System.out.print(array1[i][j]);
				
			     }System.out.println("  ");
		      }break;
			
		case 3:
			  boolean array2[][]=new boolean[row][colum];
		      System.out.println("Enter Array Element:");
		      for(int i=0;i<row;i++)
		      {
			     for(int j=0;j<colum;j++)
			     {
				     array2[i][j]=scanner.nextBoolean();
			     }
		      }
	          System.out.println("Matrix Elements Are:");
		      for(int i=0;i<row;i++)
		      {
			     for(int j=0;j<colum;j++)
			     {
				    System.out.print(array2[i][j]);
				
			     }System.out.println("  ");
		      }break;
		
	
}

	}
}


