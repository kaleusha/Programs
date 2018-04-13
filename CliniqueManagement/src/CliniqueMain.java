/******************************************************************************
 *  Purpose: Clinique Management 
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   12-04-2018
 ******************************************************************************/
import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgeit.controller.AddDetails;
import com.bridgeit.controller.DisplayMethods;
import com.bridgeit.controller.SearchDetails;
public class CliniqueMain {
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		int choice;
		AddDetails addDetails=new AddDetails();
		SearchDetails searchDetails=new SearchDetails();
		DisplayMethods displayMethods=new DisplayMethods(); 
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter Your Choice: ");
			System.out.println("\n1.add \n2.search \n3.display \n4.famous Doctor \n5.exit");
			choice=scanner.nextInt();
		switch(choice)
		{
		case 1:
			addDetails.add();
			break;
			
		case 2:
			searchDetails.search();
			break;
			
		case 3:
			displayMethods.display();
			break;
			
		case 4:
			displayMethods.famousDoctor();
			
			break;
		case 5:
			break;
			
		}scanner.close();
		}
		
	}

}
