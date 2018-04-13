/******************************************************************************
 *  Purpose: Address pojo class
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   12-04-2018
 ******************************************************************************/
public class Address {
	private String city;
	private String state;
	private Integer zip;
	
	public String getCity() {
		return city;
	}
	public Address() {
		
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
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	
}
