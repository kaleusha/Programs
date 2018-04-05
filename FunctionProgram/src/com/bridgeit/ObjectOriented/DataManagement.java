/******************************************************************************
 *  Purpose: Inventory Data Management 
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   14-03-2018
 ******************************************************************************/
package com.bridgeit.ObjectOriented;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgeit.utility.Utility;

public class DataManagement {
	public static void main(String[] args) throws IOException, ParseException {
		Utility.writefile();
	
		Utility.dataManagement();

	    
	}

}
