/******************************************************************************
 *  Purpose: Prototype Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.Prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypePattern implements Cloneable {
private List<String> empList;
	
	public PrototypePattern(){
		empList = new ArrayList<String>();
	}
	
	public PrototypePattern(List<String> list){
		this.empList=list;
	}
	public void loadData(){
		
		empList.add("usha");
		empList.add("kale");
		empList.add("asha");
		empList.add("nisha");
	}
	
	public List<String> getEmpList() {
		return empList;
	}


	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getEmpList()){
				temp.add(s);
			}
			return new PrototypePattern(temp);
	}
	

}
