import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookManager {
	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		int choice;
		 AddressBookImpl addressBookImpl=new AddressBookImpl<>();
		
		System.out.println("Enter your Choice: ");int i=1;
		do {
		System.out.println("\n1.newAddressBook \n2.openFile \n3.closeFile \n4.saveFile \n5.saveAs \n6.Quit ");
		 choice=scanner.nextInt();
		 ManagerImpl manager=new ManagerImpl();
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
			 
		 case 4:ArrayList<Person> arrayList=addressBookImpl.getData();
		 manager.saveFile(arrayList);
			
			/* ArrayList<Person> arrayList= addressBookImpl.addPerson();
			 manager.saveFile(arrayList);*/
			 break;
			 
		 case 5:
			 manager.saveAs();
			 break;
			 
		 case 6:
			 manager.quit();
			 break;
			 
			 
			 
		 }
		 i++;
		}while(i<7);
		
	}

}
