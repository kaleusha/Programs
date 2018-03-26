/******************************************************************************
 *  Purpose: Facade Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadeTest 
{
	private static int  choice;  
    public static void main(String args[]) throws NumberFormatException, IOException{  
        do{       
            System.out.print("= Mobile Shop =\n");  
            System.out.print("1. Redmi  \n");  
            System.out.print("2. SAMSUNG. \n");  
            System.out.print("3. Exit. \n");  
            System.out.print("Enter your choice: ");  
              
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
            choice=Integer.parseInt(br.readLine());  
            ShopKeeper shopkeeper=new ShopKeeper();  
              
            switch (choice) {  
               case 1:  
                	  shopkeeper.redmiSale();  
                    
                      break;  
               case 2:  
                 
                	shopkeeper.samsungSale();        
                    break;    
       
              default:  
                   
                   System.out.println("Nothing You purchased");  
                
                return;  
            }  
              
      }while(choice!=3);  
   }  

}
