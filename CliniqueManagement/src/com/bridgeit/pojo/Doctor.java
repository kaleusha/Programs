package com.bridgeit.pojo;

public class Doctor {
	
	private int id;
	private String name;
	private String specialization;
	private String availability;
	private int noOFPatients;
	
	public Doctor() {
	}
	
	public String getName() {
		return name;
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
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public int getNoOFPatients() {
		return noOFPatients;
	}
	public void setNoOFPatients(int noOFPatients) {
		this.noOFPatients = noOFPatients;
	}
	
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", id=" + id + ", specialization=" + specialization + ", availability="
				+ availability + ", noOFPatients=" + noOFPatients + "]";
	}

}
