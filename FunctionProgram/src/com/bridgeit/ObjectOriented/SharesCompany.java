/******************************************************************************
 *  Purpose:  Maintain the Stock Symbol Purchased or Sold using Stack And Queue implementation
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   16-03-2018
 ******************************************************************************/
package com.bridgeit.ObjectOriented;

import java.awt.HeadlessException;
import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgeit.utility.Utility;

public class SharesCompany {
	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
			public static void main(String[] args) 
			{
				Utility utility=new Utility();
				Stack stack = new Stack();
				Queue queue = new Queue();
				while(true) {
				System.out.println("\n1.Add Symbol \n2.Sold symbol \n3.Purchased Symbol");
				System.out.println("Enter Choice: ");
				int choice=Utility.inputInteger();
				switch(choice)
				{
				case 1:
					System.out.println("Enter Symbol TO Add in Stack/Queue");
					String symbol=Utility.inputString();
					stack.push(symbol);
					queue.insert(symbol);
					System.out.println("Added Symbol");
					stack.display();
					queue.display();
					break;
			
				case 2:
					System.out.println("Enter Symbol to Sold");
					String symbol1=Utility.inputString();
					System.out.println("enter Amount ");
					
					//stack.remove(symbol);
					
				}
				/*File file = new File("/home/bridgeit/Programs/files/companyshare.json");
				FileReader fr;
				
					try {
						fr = new FileReader(file);
	
	                    JSONParser parser = new JSONParser();
	                    JSONArray array=(JSONArray) parser.parse(fr);
	                    List list = new List();
	                    Iterator iterator = array.iterator();
	                   // LinkedList linkedlist = new LinkedList();
	                    System.out.println("Enter the share symbol");
	                    String symbol = Utility.inputString();
	                    while(iterator.hasNext())
	                    {
						      JSONObject object2 = (JSONObject) iterator.next();
						
						if(object2.containsKey(symbol))
						{
							System.out.println("Share symbol already their in list");
							System.out.println("To add share press 1 and To remove share press 2");
							int choice = Utility.inputInteger();
							switch(choice)
							{
							case 1 : 
										System.out.println("Enter the number of share want to buy");
										int num_share = Utility.inputInteger();
										JSONObject object = (JSONObject) object2.get(symbol);
										int key = Integer.parseInt(object.get("NumOfShare").toString());
										int new_shares_count = key + num_share;
										object.remove("NumOfShare");
										object.put("NumOfShare", new_shares_count);
										FileWriter fwriter = new FileWriter(file);
										fwriter.write(JSONValue.toJSONString(array));
										fwriter.flush();
										fwriter.close();
										System.out.println("");
									
								break;
							case 2 : 	System.out.println("Enter the amount of share to sale");
										int amt = Utility.inputInteger();
										JSONObject object1 = (JSONObject) object2.get(symbol);
										int share_amt = Integer.parseInt(object1.get("ShareAmt").toString());
										int num_share1 = Integer.parseInt(object1.get("NumOfShare").toString());
										int new_shares_count1 = num_share1 - (amt/share_amt);
										object1.remove("NumOfShare");
										object1.put("NumOfShare", new_shares_count1);
										FileWriter fwriter1 = new FileWriter(file);
										fwriter1.write(JSONValue.toJSONString(array));
										fwriter1.flush();
										fwriter1.close();
								break;
							}
							
						}
						else
						{
							JSONObject object = new JSONObject();
							System.out.println("Enter number of share");
							int num = Utility.inputInteger();
							System.out.println("Enter share amount");
							int amt = Utility.inputInteger();
							object.put("NumOfShare",num );
							object.put("ShareAmt",amt);
							object2.put(symbol,object);
							System.out.println("Added succesfull");
							stack.push(symbol);
							stack.display();
							queue.insert(symbol);
							queue.display();
							FileWriter fwriter = new FileWriter(file);
							fwriter.write(JSONValue.toJSONString(array));
							fwriter.flush();
							fwriter.close();
						}
	}
					} catch (HeadlessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				*/
				
				
				}
			
		}
		


}
