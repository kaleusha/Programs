package com.bridgeit.pojo;

public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private long phoneNo;
	private String bookname;
	private String intime;
	private String outtime;
	
	public Student() {
		
	}
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getIntime() {
		return intime;
	}

	public void setIntime(String intime) {
		this.intime = intime;
	}

	public String getOuttime() {
		return outtime;
	}

	public void setOuttime(String outtime) {
		this.outtime = outtime;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNo=" + phoneNo
				+ ", bookname=" + bookname + ", intime=" + intime + ", outtime=" + outtime + "]";
	}

	

}
