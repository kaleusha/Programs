import java.util.Scanner;
import com.bridgeit.controller.*;
public class CliniqueMain {
	public static void main(String[] args) {
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
