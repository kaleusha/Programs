/******************************************************************************
 *  Purpose: Address Book main method 
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   10-04-2018
 ******************************************************************************/
import java.io.IOException;
import java.util.Scanner;

public class main {
	public static void main(String[] args) throws IOException {
		
		Scanner scanner=new Scanner(System.in);
		int choice;
		System.out.println("Enter your Choice: ");
		do {
		System.out.println("\n1.newAddressBook \n2.openFile \n3.closeFile \n4.saveFile \n5.saveAs \n6.exit ");
		 choice=scanner.nextInt();
		 Manager manager=new ManagerImpl();
		 switch(choice)
		 {
		 case 1:
			 manager.newAddressBook();
			 break;
			 
		 case 2:
			 manager.openFile();
			 break;
			 
		 case 3:
			 manager.closeFile();
			 break;
			 
		 case 4:
			 manager.saveFile();
			 break;
			 
		 case 5:
			 manager.saveAs();
			 break;
			 
		 case 6:
			
			 break; 
			 
		 }
		 
		}while(true);
		
	}
	
}
