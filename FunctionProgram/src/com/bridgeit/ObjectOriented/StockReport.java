/******************************************************************************
 *  Purpose:Print the Stock Report.
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   14-03-2018
 ******************************************************************************/
package com.bridgeit.ObjectOriented;

import com.bridgeit.utility.Utility;

public class StockReport {
	public static void main(String[] args) {
	//Utility utility=new Utility();
	System.out.println("Enter Number of companys");
	int number = Utility.inputInteger();
	Utility.stockReport(number);
}

}
