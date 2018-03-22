import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Utility {
	Scanner scanner=new Scanner(System.in);

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addPerson() 
	{
		String  file=("/home/bridgeit/Programs/files/sample");
		try {
			FileReader fileread = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Enter First Name: ");
		String firstname=scanner.nextLine();
		System.out.println("Enter second Name: ");
		String secondname=scanner.nextLine();
		System.out.println("Enter city Name: ");
		String city=scanner.nextLine();
		System.out.println("Enter state Name: ");
		String state=scanner.nextLine();
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
	
	public static<T> void writeFileinteger(T search) { 
		String string = search.toString();
		try {
			FileWriter writer = new FileWriter("/home/bridgeit/Programs/files/sample");
			BufferedWriter write = new BufferedWriter(writer);
			write.write(string);

			write.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


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

	@SuppressWarnings("unchecked")
	public void update(ArrayList al) throws IOException {
		
		String file = "/home/bridgeit/Programs/files/sample";
		FileWriter filewriter=new FileWriter(file);
		BufferedWriter bufferwiter=new BufferedWriter(filewriter);
		System.out.println("Enter the person name to edit details");
		String name = scanner.nextLine();
		System.out.println("Enter the new name to update.");
		String change = scanner.nextLine();
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).equals(name))
			{
				al.set(i, change);
			}
		}System.out.println("update successful: "+al);
		
		bufferwiter.close();
	}

	public void delete(ArrayList al) {
		try {
			String file = "/home/bridgeit/Programs/files/sample";
			FileWriter fw=new FileWriter(file);
			BufferedWriter bufferwiter=new BufferedWriter(fw);
			System.out.println("Enter the new name to delete.");
			String delete = scanner.nextLine();
			for(int i=0;i<al.size();i++)
			{
				if(al.get(i).equals(delete))
				{
					al.remove(delete);
					
				}
			}System.out.println("delete successful: "+al);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		
	}


}
