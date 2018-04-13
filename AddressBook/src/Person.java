/******************************************************************************
 *  Purpose: Person Pojo class
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   12-04-2018
 ******************************************************************************/
public class Person {
	Address address=new Address();
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Person() {
		
	}
	private String firstName;
	private String lastName;
	private long phoneNo;
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
	
	@Override
	public String toString() {
		return "Person [address=" + address + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNo="
				+ phoneNo + "]";
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}


}
