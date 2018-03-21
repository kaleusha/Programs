import java.io.IOException;
import java.util.Scanner;

public class LinkedList {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your Choice: ");
		System.out.println("\n1.Create \n2.Read \n3.Update \n4.Delete ");
		int choice=scanner.nextInt();
		Utility utility=new Utility();
		java.util.LinkedList linkedlist=new java.util.LinkedList();
	
		switch(choice)
		{
		case 1:
			//utility.addPerson();
			
			linkedlist.add(new Person());
			break;
			
		case 2:
			utility.read();
			//linkedlist.add(new Person());
			break;
			
		case 3:
			utility.update();
			break;
			
		case 4:
			utility.delete();
			break;
			
		}
	}

}
