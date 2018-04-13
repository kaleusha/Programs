/******************************************************************************
 *  Purpose: Address Book Implementation 
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   12-04-2018
 ******************************************************************************/
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBookImpl implements AddressBook{

	  static ArrayList<Person> arraylist=new ArrayList<Person>();
	String arrayToJson;
	Scanner scanner=new Scanner(System.in);
	public void addressBookOperations(ArrayList<Person> arraylist2) throws IOException
	{
		arraylist=arraylist2;
		int choice;
		
		do {
		System.out.println("Enter your choice: ");
		System.out.println("\n1.add \n2.delete \n3.edit \n4.sortByLastName \n5.sortByZip \n6.print \n7.exit");
		 choice=scanner.nextInt();
		switch(choice)
		{
		case 1:
			add();
			 break;
			 
		 case 2:
			 delete();
			 break;
			 
		 case 3:
			edit();
			 break;
			 
		 case 4:
			sortByLastName();
			 break;
			 
		 case 5:
			sortByZip();
			 break;
			 
		 case 6:
			 print();
			 break;
			 
		 case 7:
			
			 break; 
			 
		 }
		}while(choice<6);
		
}
	/*Purpose:Add Book
	 *  
	 * (non-Javadoc) 
	 * @see AddressBook#add()
	 */
	public void add() throws IOException 
	{
		Person person=new Person();
		Address address=new Address();
		System.out.println("Enter first name:");
		String firstname=scanner.next();
		System.out.println("Enter last name:");
		String lastname=scanner.next();
		System.out.println("Enter city name:");
		String city=scanner.next();
		System.out.println("Enter state name:");
		String state=scanner.next();
		System.out.println("Enter zip code:");
		int zip=scanner.nextInt();
		System.out.println("Enter mobile number:");
		long mobileNumber=scanner.nextLong();
		person.setFirstName(firstname);
		person.setLastName(lastname);
		address.setCity(city);
		address.setState(state);
		address.setZip(zip);
		person.setPhoneNo(mobileNumber);
		person.setAddress(address);
		arraylist.add( person);
		
		System.out.println(arraylist);
		
	}
	
	/* Purpose:Delete Book
	 * 
	 * (non-Javadoc)
	 * @see AddressBook#delete()
	 */
	public  void delete() {
		System.out.println("Enter the name to delete user");
		String name =scanner.next();
		Iterator<Person> iterator = arraylist.iterator();
		
		for(int i=0;i<arraylist.size();i++)
		{
			if(arraylist.get(i).getFirstName().equals(name))
			{
				arraylist.remove(i);

			}
		}
		System.out.println(arraylist);		
	}

	
	/*Purpose:edit Book
	 * 
	 *  (non-Javadoc)
	 * @see AddressBook#edit()
	 */
	public void edit() {
		System.out.println("Enter the person name: ");
		String name=scanner.next();
		int field;
		Iterator<Person> iterator=arraylist.iterator();
		while(iterator.hasNext()) {
			Person persn= iterator.next();
			if(persn.getFirstName().equals(name)) {
				do {
				System.out.println("Which field you wants to edit: \n1.lastname \n2.address \n3.exit ");
				 field=scanner.nextInt();
				switch(field) {
				case 1:
					System.out.println("Enter new last name: ");
					String newlastname=scanner.next();
					persn.setLastName(newlastname);
					System.out.println("last name edit success");
					break;
				case 2:
					System.out.println("Enter new state: ");
					String newstate=scanner.next();
					Address add1=persn.getAddress();
					add1.setState(newstate);
					System.out.println("Enter new city: ");
					String newcity=scanner.next();
					Address add2=persn.getAddress();
					add2.setCity(newcity);
					System.out.println("Enter zipcode: ");
					int newzip=scanner.nextInt();
					Address address=persn.getAddress();
					address.setZip(newzip);
					System.out.println();
					System.out.println("address edit success");
					System.out.println(persn);
					break;
				
				
				case 3:
					break;
				}
			}while(field<3);
		}
		}	
		
	}

	
	/* Purpose:Sort By Last Name
	 * 
	 * (non-Javadoc)
	 * @see AddressBook#sortByLastName()
	 */
	public void sortByLastName() {
		for (int i = 0; i < arraylist.size(); i++) {
	        for (int j = 0; j < arraylist.size(); j++) {
	            Collections.sort(arraylist, new Comparator<Object>() {

	                public int compare(Object o1, Object o2) {
	                	Person  p1 = (Person) o1;
	                	Person p2 = (Person) o2;
	                    return p1.getLastName().compareToIgnoreCase(p2.getLastName());
	                    
	                }
	            });
	            
	        }

	    }
		System.out.println(arraylist);
		
	}

	
	/* Sort by Zip
	 * 
	 * (non-Javadoc)
	 * @see AddressBook#sortByZip()
	 */
	public void sortByZip() {
		class SortByZip implements Comparator<Person>
		{
			public int compare(Person person1, Person person2) 
			{
			
			Address address1  = person1.getAddress();
			Address address2 = person2.getAddress();
			int zip1 = address1.getZip();
			int zip2 = address2.getZip();
				return zip1 - zip2;
			}
		}
		Collections.sort(arraylist, new SortByZip());
		  for(Person address : arraylist)
		  {
		  System.out.println(address);
		  }
		
	}

	
	/* Purpose:Display Book
	 * 
	 * (non-Javadoc)
	 * @see AddressBook#print()
	 */
	public void print() throws IOException {
		System.out.println(arraylist);
		
		/*BufferedReader bufferReader = new BufferedReader(new FileReader("<Filename>"));
		String line;
		while((line = bufferReader.readLine()) != null)
		{
		    System.out.println(line);
		}
		bufferReader.close();*/
		
		

}
}
