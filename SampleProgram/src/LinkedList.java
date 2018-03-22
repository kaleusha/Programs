import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LinkedList {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws IOException {
		 char ch=' ';
		Scanner scanner=new Scanner(System.in);
		
		Utility utility=new Utility();
		ArrayList<String> al=new ArrayList<String>();
		java.util.LinkedList linkedlist=new java.util.LinkedList();
	do
	{
		System.out.println("Enter Your Choice: ");
		
		System.out.println("\n1.Create \n2.Read \n3.Update \n4.Delete ");
		int choice=scanner.nextInt();
		switch(choice)
		{
		case 1:
			
			linkedlist.add(new Person(al));
			break;
			
		case 2:utility.read();
			
			
			break;
			
		case 3:
			utility.update(al);
			break;
			
		case 4:
			utility.delete(al);
			break;
			
		}
     System.out.println("Do You want to continue(Y/N)");
     ch=scanner.next().charAt(0);
	}while(ch=='Y'||ch=='y');
	scanner.close();
}
}