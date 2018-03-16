/******************************************************************************
 *  Purpose: Inventory Data Management 
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   14-03-2018
 ******************************************************************************/
package com.bridgeit.ObjectOriented;

import java.io.File;
import com.bridgeit.utility.Utility;

public class DataManagement {
	public static void main(String[] args) {
		Utility utility=new Utility();
	    File file = new File("/home/bridgeit/Programs/files/dataManagement.json");
	    utility.writeFile(file);
	    utility.readFile(file);
	}

}
