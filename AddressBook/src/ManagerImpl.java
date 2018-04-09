import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.omg.CORBA.PUBLIC_MEMBER;

public class ManagerImpl {
	Scanner scanner=new Scanner(System.in);

	public void newAddressBook() throws IOException {
		File path=new File("/home/bridgeit/Programs/AddressBook/files");
		File[] listFile=path.listFiles();
		System.out.println("list of file in folder: ");
		for(File file1: listFile)
		{
			System.out.println(file1.getName());
		}
		System.out.println("Enter the new file name: ");
		String newFile=scanner.next();
		File nfile=new File("/home/bridgeit/Programs/AddressBook/files/"+newFile+".json");
		nfile.createNewFile();
		System.out.println("NEw file created");
		
		
		
	}
	
	 String openFile;
	public void openFile() throws IOException {
		
		File path=new File("/home/bridgeit/Programs/AddressBook/files");
		File[] listFile=path.listFiles();
		System.out.println("list of file in folder: ");
		for(File file1: listFile)
		{
			System.out.println(file1.getName());
		}

		    
				System.out.println("Enter file name to open:");
				 openFile=scanner.next();
				 addressBookOperations();
				/*String line = null;
				
				 FileReader fileReader = new FileReader(openFile);
				 BufferedReader bufferReader=new BufferedReader(fileReader);

				    while((line = bufferReader.readLine()) != null) {
				        System.out.println(line);
				    }   
				    bufferReader.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  */
		    
		   
		    
	
		
		
	}
	
	public void addressBookOperations() throws IOException
	{
		int choice;
		AddressBookImpl addressBookImpl=new AddressBookImpl();
		do {
		System.out.println("Enter your choice: ");
		System.out.println("\n1.addPerson \n2.deletePerson \n3.editPerson \n4.sortByLastName \n5.sortByZip \n6.exit");
		 choice=scanner.nextInt();
		switch(choice)
		{
		case 1:
			addressBookImpl.addPerson();
			 break;
			 
		 case 2:
			 addressBookImpl.deletePerson();
			 break;
			 
		 case 3:
			 addressBookImpl.editPerson();
			 break;
			 
		 case 4:
			 addressBookImpl.sortByLastName();
			 break;
			 
		 case 5:
			 addressBookImpl.sortByZip();
			 break;
			 
		 case 6:
			 break;
		
			 
			 
			 
		 }
		}while(choice<6);
		
}
	

	public void closeFile() {
		// TODO Auto-generated method stub
		
	}

	public void saveFile(ArrayList<Person> arraylist) throws IOException {
		String arrayToJson = null;
		

		try {
			ObjectMapper objectMapper = new ObjectMapper();
			 arrayToJson = objectMapper.writeValueAsString(arraylist);
			System.out.println(" Convert List of person objects to JSON :");
			System.out.println(arrayToJson);
			
			
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	    String path="/home/bridgeit/Programs/AddressBook/files/";
		FileWriter filewrite = new FileWriter(path);
		filewrite.write(arrayToJson);
		filewrite.flush();
		filewrite.close();
		System.out.println("Added Successfully.");
		
		
	}

	public void saveAs() {
		// TODO Auto-generated method stub
		
	}

	public void quit() {
		// TODO Auto-generated method stub
		
	}
	

}
