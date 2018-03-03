package com.bridgeit.Algorithprogram;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch
{
	public static void main(String[] args) throws IOException 
	{
		     Scanner scanner=new Scanner(System.in);
			  File f;
			  String temp1,temp2;
			  f=new File("myfile.txt");
			  if(!f.exists()){
			  f.createNewFile();
			  System.out.println("New file \"myfile.txt\" has been created to the current directory");
			  }
			  System.out.println(new File(".").getAbsoluteFile());
			  FileInputStream fstream = new FileInputStream("myfile.txt");
			  DataInputStream in = new DataInputStream(fstream);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  String line=br.readLine();
			  System.out.println(line);
			  ArrayList<String> list=new ArrayList<String>();
			  
			  
			  while(line!=null)
			  {
				  String Array[]=line.split(" ");
				  for(String a:Array)
				  {
					  list.add(a);
				  }
				  
			  }
			  for(int i=0; i<list.size()-1; i++)
		        {
		            for(int j=i+1; j<list.size()-1; j++)
		            {
		                if(list.get(i).compareTo(list.get(j))>0)
		                {
		                    temp1=list.get(j);
		                    temp2=list.get(j);
		                    list.set(j, temp1);
		                    list.set(j, temp1);
		                    
		                }
		            }
		        }
			  System.out.println("\nSorted names are in Ascending Order: ");
		        for(int i=0;i<list.size()-1;i++)
		        {
		            System.out.println(list.get(i));
		        }
			
	}
}
