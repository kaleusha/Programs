
public class PersonClass {
	String firstname;
	String secondname;
	String city;
	String mobileno;
	String state;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	
	@Override
	public String toString() {
		return "PersonClass [firstname=" + firstname + ", secondname=" + secondname + ", city=" + city + ", state="
				+ state + ", mobileno=" + mobileno + "]";
	}
	

}
