package com.bridgeit.Algorithprogram;

import java.util.Scanner;

public class Sqrt /* Newtons law is used finding the root of nonnegative numbers */
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Value of c");
        double c=scanner.nextInt();
        double epsilon = 1e-15;    
        double t = c;              
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }
       
        System.out.println(t);  //print the square root

        
        
	}

}
