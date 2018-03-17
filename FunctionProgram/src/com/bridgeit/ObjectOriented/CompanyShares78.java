package com.bridgeit.ObjectOriented;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

import com.bridgeit.utility.Utility;

public class CompanyShares78 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		Stack stack = new Stack();
		Queue queue = new Queue();
		File file = new File("/home/bridgeit/Programs/files/companyshare.json");
		FileReader fr;
		try {
			fr = new FileReader(file);
		
		JSONParser parser = new JSONParser();
		JSONArray array;
	    array = (JSONArray) parser.parse(fr);
		Iterator itr = array.iterator();
		
		System.out.println("Enter the share symbol");
		String symbol = Utility.inputString();
		while(itr.hasNext())
		{
			JSONObject obj = (JSONObject) itr.next();
			if(obj.containsKey(symbol))
			{
				System.out.println("Share symbol already their in list");
				System.out.println("To add share press 1 and To remove share press 2");
				int choice = Utility.inputInteger();
				switch(choice)
				{
				case 1 : 
							System.out.println("Enter the number of share want to buy");
							int num_share = Utility.inputInteger();
							JSONObject object = (JSONObject) obj.get(symbol);
							int key = Integer.parseInt(object.get("NumOfShare").toString());
							int new_shares_count = key + num_share;
							object.remove("NumOfShare");
							object.remove(num_share);
							object.put("NumOfShare", new_shares_count);
							FileWriter writer = new FileWriter(file);
							writer.write(JSONValue.toJSONString(array));
							writer.flush();
							writer.close();
							System.out.println("symbol remove successfully from file");
						
					break;
				case 2 : 	System.out.println("Enter the amount of share to sale");
							int amt = Utility.inputInteger();
							JSONObject object1 = (JSONObject) obj.get(symbol);
							int share_amt = Integer.parseInt(object1.get("ShareAmt").toString());
							int num_share1 = Integer.parseInt(object1.get("NumOfShare").toString());
							int new_shares_count1 = num_share1 - (amt/share_amt);
							object1.remove("NumOfShare");
							object1.put("NumOfShare", new_shares_count1);
							FileWriter writer1 = new FileWriter(file);
							writer1.write(JSONValue.toJSONString(array));
							writer1.flush();
							writer1.close();
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
				obj.put(symbol,object);
				System.out.println("Added succesfull");
				stack.push(symbol);
				stack.display();
				queue.insert(symbol);
				queue.display();
				FileWriter fw = new FileWriter(file);
				fw.write(JSONValue.toJSONString(array));
				fw.flush();
				fw.close();
			}
		}
		}
		catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
}

}
