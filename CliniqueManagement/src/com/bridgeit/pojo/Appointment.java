package com.bridgeit.pojo;

public class Appointment {
	private Patient patient;
	private String date,doctorName;
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	private int id;
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date2) {
		this.date = date2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Appoinment [Patient=" + patient + ", date=" + date + ", id=" + id + "]";
	}

}
