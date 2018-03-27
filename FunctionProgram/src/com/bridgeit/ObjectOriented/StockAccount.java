/******************************************************************************
 *  Purpose: maintains a list of CompanyShares object which has Stock Symbol 
 *           and Number of Shares as well as DateTime of the transaction
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   24-03-2018
 ******************************************************************************/
package com.bridgeit.ObjectOriented;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.json.simple.JSONObject;

import com.bridgeit.utility.Utility;

public class StockAccount 
{
	String customerPath = "/home/bridgeit/Programs/files/stockCustomer.json";
	String stockPath = "/home/bridgeit/Programs/files/stockAccount.json";

	Map<String, String> transaction = new HashMap<String, String>();
	SimpleDateFormat dateFormat = new SimpleDateFormat("hh-mm-ss dd/MM/YYYY");
	Date date = new Date();
	int count = 1;
	@SuppressWarnings("unused")
	public StockAccount(Customer customer)
	{
		
		JSONObject name = new JSONObject();
		JSONObject jsonObject = Utility.readFromJsonFile1(customerPath);
		JSONObject jsonObject1 = new JSONObject();

		name.put("Money", customer.getMoney());
		name.put("TotalShare", customer.getTotal_share());
		jsonObject.put(customer.getName(), name);
		Utility.writeJsonObjectToFile2(customerPath, jsonObject);
	}

	public StockAccount() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * buy the share
	 * @param symbol
	 * @param noOfShare
	 * @param name
	 */
	
	public void buyShare(String symbol, long noOfShare, String name) 
	{
		JSONObject jsonStockObject = Utility.readFromJsonFile1(stockPath);
		JSONObject stockSymbolObject = (JSONObject) jsonStockObject.get(symbol);
		long price = (long) stockSymbolObject.get("Price");
		stockSymbolObject.put("NumberOfShare", (long) stockSymbolObject.get("NumberOfShare") - noOfShare);
		jsonStockObject.put(symbol, stockSymbolObject);
		Utility.writeJsonObjectToFile2(stockPath, jsonStockObject);
		boolean flag = false;
		JSONObject jsonObject = Utility.readFromJsonFile1(customerPath);
		JSONObject customer = (JSONObject) jsonObject.get(name);
		JSONObject share_value = null;
		if (customer.get("Shares") == null)
		{
			share_value = new JSONObject();
			flag = true;
		} else 
		{
			share_value = (JSONObject) customer.get("Shares");
			flag = false;
		}
		if (flag == true) 
		{
			share_value.put(symbol, noOfShare);
		} 
		else 
		{
			if (share_value.get(symbol) == null) 
			{
				share_value.put(symbol, noOfShare);
			} else 
			{
				share_value.put(symbol, (long) share_value.get(symbol) + noOfShare);
			}
		}
		customer.put("Money", (long) customer.get("Money") - (noOfShare * price));
		customer.put("TotalShare", (long) customer.get("TotalShare") + noOfShare);
		customer.put("Shares", share_value);
		jsonObject.put(name, customer);
		Utility.writeJsonObjectToFile2(customerPath, jsonObject);
		transaction.put((count++) + " " + symbol,
				name + " bought " + noOfShare + " Share at time " + dateFormat.format(date));

	}

	/**
	 * sell the share
	 * @param symbol
	 * @param noOfShare
	 * @param name
	 */
	
	public void sellShare(String symbol, long noOfShare, String name)
	{
		JSONObject customerJsonObject = Utility.readFromJsonFile1(customerPath);
		JSONObject stockJsonObject = Utility.readFromJsonFile1(stockPath);

		JSONObject symbolJson = (JSONObject) stockJsonObject.get(symbol);
		long price = (long) symbolJson.get("Price");
		symbolJson.put("NumberOfShare", (long) symbolJson.get("NumberOfShare") + noOfShare);
		stockJsonObject.put(symbol, symbolJson);
		Utility.writeJsonObjectToFile2(stockPath, stockJsonObject);

		JSONObject nameJsonObject = (JSONObject) customerJsonObject.get(name);
		nameJsonObject.put("Money", (long) nameJsonObject.get("Money") + (price * noOfShare));
		customerJsonObject.put(name, nameJsonObject);

		nameJsonObject.put("TotalShare", (long) nameJsonObject.get("TotalShare") - noOfShare);
		customerJsonObject.put(name, nameJsonObject);

		JSONObject share = (JSONObject) nameJsonObject.get("Shares");
		share.put(symbol, (long) share.get(symbol) - noOfShare);

		nameJsonObject.put("Shares", share);
		customerJsonObject.put(name, nameJsonObject);

		Utility.writeJsonObjectToFile2(customerPath, customerJsonObject);

		transaction.put((count++) + " " + symbol,
				name + " sold " + noOfShare + " Share at time " + dateFormat.format(date));
	}

	/**
	 * add new company
	 * @param symbol
	 * @param noOfShares
	 * @param priceOfEachShare
	 */
	
	public void addNewSymbol(String symbol, long noOfShares, long priceOfEachShare) 
	{
		JSONObject jsonObject = Utility.readFromJsonFile1(stockPath);
		JSONObject jsonSymbolObject = new JSONObject();
		jsonSymbolObject.put("NumberOfShare", noOfShares);
		jsonSymbolObject.put("Price", priceOfEachShare);
		jsonObject.put(symbol, jsonSymbolObject);
		Utility.writeJsonObjectToFile2(stockPath, jsonObject);
	}

	/**remove the company
	 * @param symbol
	 */
	public void removeSymbol(String symbol) 
	{
		JSONObject jsonObject = Utility.readFromJsonFile1(stockPath);
		jsonObject.remove(symbol);
		Utility.writeJsonObjectToFile2(stockPath, jsonObject);
	}

	/**
	 * display transactions details
	 */
	public void displayTransactionDetails() 
	{
		Iterator<Map.Entry<String, String>> iterator = transaction.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey() + "    " + entry.getValue());
		}
	}

	/**
	 * print the report 
	 */
	public void displayReport() 
	{
		JSONObject jsonObject = Utility.readFromJsonFile1(stockPath);
		System.out.println(jsonObject.toJSONString());
		JSONObject jsonCustomerObject = Utility.readFromJsonFile1(customerPath);
		System.out.println(jsonCustomerObject.toJSONString());
	}


}
