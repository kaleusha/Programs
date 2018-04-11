import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddressBookManager {
	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		int choice;
		 File filepath = null;
		 ManagerImpl manager=new ManagerImpl();
		System.out.println("Enter your Choice: ");int i=1;
		do {
		System.out.println("\n1.newAddressBook \n2.openFile \n3.closeFile \n4.saveFile \n5.saveAs \n6.exit ");
		 choice=scanner.nextInt();
		
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
		 i++;
		}while(i<6);
		scanner.close();
		
	}

}
