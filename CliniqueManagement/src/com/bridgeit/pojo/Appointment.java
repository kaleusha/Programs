/******************************************************************************
 *  Purpose: Pojo class for Appointment 
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   12-04-2018
 ******************************************************************************/
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
	@Override
	public String toString() {
		return "Appointment [patient=" + patient + ", date=" + date + ", doctorName=" + doctorName + "]";
	}
	
	
}
