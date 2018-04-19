package com.bridgeit.callableStmt;

import java.util.Scanner;

public class studentMain {
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		Select select=new Select();
		InsertData insert=new InsertData();
		DeleteData delete=new DeleteData();
		UpdateData update=new  UpdateData();
		System.out.println("Enter your choice: ");
		do {
		System.out.println("\n1.select \n2.insert  \n3.delete \n4.update \n5.exit");
		int choice=scanner.nextInt();
		switch(choice)
		{
		case 1:
			select.select();
			break;
			
		case 2:
			insert.insertData();
			break;
			
		case 3:
			delete.deleteData();
			break;
			
		case 4:
			update.updateData();
			break;
			
		case 5:
			break;
		}
		}while(true);
		
		
	}

}
