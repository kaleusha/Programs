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
		System.out.println("Enter Your Choice: ");
		System.out.println("\n1.add \n2.search \n3.display \n4.exit");
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
			
			break;
			
		}
		scanner.close();
	}

}
