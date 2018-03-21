import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Person {
	String firstname;
	String secondname;
	String city;
	String state;
	
	Scanner scanner=new Scanner(System.in);

	//@SuppressWarnings({ "unchecked", "rawtypes" })
	Person() {
		String  file=("/home/bridgeit/Programs/files/sample");
		try {
			FileReader fileread = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Enter First Name: ");
		 firstname=scanner.nextLine();
		System.out.println("Enter second Name: ");
	      secondname=scanner.nextLine();
		System.out.println("Enter city Name: ");
		 city=scanner.nextLine();
		System.out.println("Enter state Name: ");
	    state=scanner.nextLine();
	  //Array.add(firstname);
	  	ArrayList<String> al=new ArrayList<String>();
	  		al.add(firstname);
	  		al.add(secondname);
	  		al.add(city);
	  		al.add(state);
	  		String s=al.toString();
	  		System.out.println(s);
	  		try {
	  			FileWriter filewrite=new FileWriter(file);
	  			BufferedWriter br=new BufferedWriter(filewrite);
	  			br.write(s);
	  			br.close();
	  			
	  		} catch (IOException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  		}
	    
	    }
	public String toString() {
	    return firstname + " " + secondname + " " + city + " " + state ;
	  }
		
	

	public void read() throws FileNotFoundException {
		FileReader fileread=new FileReader("/home/bridgeit/Programs/files/sample");
		BufferedReader br=new BufferedReader(fileread);
		String data=" ";
		while(true)
		{
			try {
				data=br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(data==null)
				break;
			System.out.println(data);
			
		}
		
	
	}

}
