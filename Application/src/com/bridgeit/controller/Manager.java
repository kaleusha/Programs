
package com.bridgeit.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.bridgeit.pojo.Student;

public class Manager 
{
 Scanner scanner=new Scanner(System.in);
static List<Student> arraylist=new ArrayList<Student>();	
Student student=new Student();
	
/**
 * Purpose: Add Student in list
 * 
 * @throws InterruptedException
 */
public void add() throws InterruptedException 
{
	
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date indate = new Date();
	System.out.println(dateFormat.format(indate));
	student.setIntime(dateFormat.format(indate));
	student.setId(arraylist.size()+1);
	System.out.println(student.getId());
	System.out.println("Enter first name:");
	String firstname=scanner.next();
	System.out.println("Enter last name:");
	String lastname=scanner.next();
	System.out.println("Enter mobile number:");
	long mobileNumber=scanner.nextLong();
	System.out.println("Enter book name");
	String bookname=scanner.next();
	
	boolean outflag=true;
	while(outflag)
	{
		Thread.sleep(2000);
		System.out.println("do u want to remove from library 1/0");
		if(scanner.nextInt()==1)
		{
			outflag=false;
			Date outdate = new Date();
			student.setOuttime(dateFormat.format(outdate));
		}
		
	}
	
	
	student.setFirstName(firstname);
	student.setLastName(lastname);
	student.setPhoneNo(mobileNumber);
	System.out.println(bookname);
	student.setBookname(bookname);
	
     boolean flag=check(firstname,bookname);
     if (flag) {
        System.out.println("firstname and bookname contained in the list");
     } else {
    	 arraylist.add(student);
        System.out.println(arraylist);
     }
	
}
/**
 * Purpose: Check first name or Book name are already in list or not
 * 
 * @param firstname
 * @param bookname
 * @return
 */
public boolean check(String firstname, String bookname)
{
	for(int i=0;i<arraylist.size();i++)
	{
		Student student=arraylist.get(i);
		if(student.getFirstName().equals(firstname) && student.getBookname().equals(bookname))
		{
			return true;
		}
	}
	return false;
}

public void printDetails() {
	System.out.println(arraylist);
	
}
/**
 * Purpose: Print Student List
 * 
 */
public void viewStudent() {
	
	for(int i=0;i<arraylist.size();i++)
	{
		student=arraylist.get(i);
		System.out.println(student.getFirstName());
	}
}
/**
 * Purpose: Print book List
 * 
 */
public void displayBook() {
	for(int i=0;i<arraylist.size();i++)
	{
		student=arraylist.get(i);
		System.out.println(student.getBookname());
	}
	
}
	
}
