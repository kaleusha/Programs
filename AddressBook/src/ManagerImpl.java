/******************************************************************************
 *  Purpose: Manager Implementation
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   10-04-2018
 ******************************************************************************/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class ManagerImpl implements Manager
{
static Scanner scanner=new Scanner(System.in);
static String folderPath="/home/bridgeit/Programs/AddressBook/files/";

static File file;
ArrayList<Person> arraylist=new ArrayList<Person>();	
static ObjectMapper mapper=new ObjectMapper(); 
	/* Purpose:Create new  book
	 * 
	 * (non-Javadoc)
	 * @see Manager#newAddressBook()
	 */
	public void newAddressBook() throws IOException {
		File filel=new File(folderPath);
		File[] listFile=filel.listFiles();
		System.out.println("list of file in folder: ");
		for(File file1: listFile)
		{
			System.out.println(file1.getName());
		}
		System.out.println("Enter the new file name: ");
		String newFile=scanner.next();
		file=new File(folderPath+newFile+".json");
		file.createNewFile();
		System.out.println("NEw file created");
	}
	
	/* Purpose:Open Book
	 * 
	 * (non-Javadoc)
	 * @see Manager#openFile()
	 */
	public void openFile() throws IOException {
		
		File filel=new File(folderPath);
		File[] listFile=filel.listFiles();
		System.out.println("list of file in folder: ");
		for(File file1: listFile)
		{
			System.out.println(file1.getName());
		}
      	    
				System.out.println("Enter file name to open:");
				file=new File(folderPath+scanner.next()+".json");
				System.out.println(file);
				BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
				String jsonarray;
				if((jsonarray=bufferedReader.readLine()) != null)
				{
					System.out.println(jsonarray);
					TypeReference<ArrayList<Person>> typeReference=new TypeReference<ArrayList<Person>>() {};
						arraylist=mapper.readValue(jsonarray,typeReference);
					System.out.println(arraylist);	
					
				}bufferedReader.close();
				 AddressBookImpl addressBookImpl=new AddressBookImpl();
				addressBookImpl.addressBookOperations(arraylist);
		
	}
	/* Purpose:Close  Book
	 * 
	 * (non-Javadoc)
	 * @see Manager#closeFile()
	 */
	public void closeFile	() throws IOException {
		int choice;
		System.out.println("enter your choice");
		do {
		System.out.println("\n1.do u want to save file \n2.not save \n3.exit ");
		 choice=scanner.nextInt();
		switch(choice)
		{
		case 1:
		saveFile();
		break;
		case 2:
			System.out.println("not save");
			break;
		case 3:
			
			break;
		
		}
		}while(choice<3);
		
		
	}

	/* Purpose:Save file
	 * 
	 * (non-Javadoc)
	 * @see Manager#saveFile()
	 */
	public void saveFile() throws IOException {
		ArrayList<Person> List=AddressBookImpl.arraylist;
	
		System.out.println(file);
		
		mapper.writeValue(new FileOutputStream(file),List);
		System.out.println("Save Successfully.");
			
	}
	/*Purpose:Save file as
	 * 
	 *  (non-Javadoc)
	 * @see Manager#saveAs()
	 */
	public void saveAs() {
		System.out.println("enter extention of file");
		 String extension=scanner.next(); 
		 System.out.println("Enter the name of address book");
		 
	        file=new File("/home/bridgeit/Programs/AddressBook/files/" +""+scanner.next()+ extension);
	     
	        ArrayList<Person> List=AddressBookImpl.arraylist;
	        ObjectMapper objectMapper = new ObjectMapper();
	        try {
	            objectMapper.writeValue(file, List);
	            System.out.println("File Save Successfully");
	            System.out.println(List);
	        } catch (IOException e) {
	            
	            e.printStackTrace();
	        }    
		
		
	}

	
	
/*public static void main(String[] args) throws IOException {
		
		ManagerImpl manager=new ManagerImpl();
		//System.out.println("Welcome to Address");
		do{
		System.out.println("Make a choice from below");
		System.out.println("1.Create \n2.Open \n3.Save \n4.SaveAs \n5.exit");
		File file = null;
		switch (scanner.nextInt()) {
		case 1:	manager.newAddressBook();
				break;
		case 2:	manager.openFile();
				break;
		case 3:	manager.saveFile();
				break;
		case 4:	manager.saveAs();
				break;
		
		case 5:break;
			
		}
		}while(true);
	}*/
}
