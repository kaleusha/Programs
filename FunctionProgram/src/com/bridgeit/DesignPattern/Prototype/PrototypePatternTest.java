package com.bridgeit.DesignPattern.Prototype;

public class PrototypePatternTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		PrototypePattern emp=new PrototypePattern();
		emp.loadData();
		
		//clone method to get the PrototypePattern object
		PrototypePattern emp1= (PrototypePattern) emp.clone();
		PrototypePattern emp2=(PrototypePattern) emp.clone();
		
		java.util.List<String> list=  emp1.getEmpList();
		list.add("xyz");
		list.add("pqr");
		 java.util.List<String> list1= emp2.getEmpList();
		 list1.remove("usha");
		 
		 System.out.println("emp: "+emp.getEmpList());
		 System.out.println("emp1: "+list);
		 System.out.println("emp2: "+list1);
	}

}
