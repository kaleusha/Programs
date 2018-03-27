/******************************************************************************
 *  Purpose: Print the Modified Message.
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   14-03-2018
 ******************************************************************************/
package com.bridgeit.ObjectOriented;

import com.bridgeit.utility.Utility;

public class RegularExpression {
	public static void main(String[] args) {
        Utility.firstName();
		Utility.fullName();
		Utility.mobileNumber();
		Utility.Date();
		String msg=Utility.RegexReplace();
		System.out.println(msg);	
		
	}

}
