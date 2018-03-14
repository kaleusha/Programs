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
