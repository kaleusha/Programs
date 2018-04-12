package com.bridgeit.pojo;

public class Patient {
	
	private int id;
	private String name;
	private long mobileNumber;
	private int age;
	public String getName() {
		return name;
	}
	public Patient() {
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Patients [name=" + name + ", id=" + id + ", mobileNumber=" + mobileNumber + ", age=" + age + "]";
	}
}
