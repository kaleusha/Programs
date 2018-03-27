/******************************************************************************
 *  Purpose: maintains a list of CompanyShares object which has Stock Symbol 
 *           and Number of Shares as well as DateTime of the transaction
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   24-03-2018
 ******************************************************************************/
package com.bridgeit.ObjectOriented;

public class Customer 
{
	private String name;
	private long money;
	private long totalShare;
	
	public Customer(String name, long money, long totalShare) 
	{
		this.name = name;
		this.money = money;
		this.totalShare = totalShare;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public long getMoney() 
	{
		return money;
	}

	public void setMoney(long money) 
	{
		this.money = money;
	}


	public long getTotal_share() 
	{
		return totalShare;
	}

	public void setTotal_share(int totalShare) 
	{
		this.totalShare = totalShare;
	}

	@Override
	public String toString() 
	{
		return "Customer [name=" + name + ", money=" + money + ", total_share=" + totalShare	+ "]";
	}	

}
