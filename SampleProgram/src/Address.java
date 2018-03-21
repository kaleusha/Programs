
import java.util.LinkedList;

public	class Address {
	  private String name;

	  private String street;

	  private String city;

	  private String state;

	  private String code;

	  Address(String n, String s, String c, String st, String cd) {
	    name = n;
	    street = s;
	    city = c;
	    state = st;
	    code = cd;
	  }

	  public String toString() {
	    return name + " " + street + " " + city + " " + state + " " + code;
	  }
	

	
	  public static void main(String args[]) {
	    LinkedList<Address> ml = new LinkedList<Address>();

	    ml.add(new Address("A", "11 Ave", "U", "IL", "11111"));
	    ml.add(new Address("R", "11 Lane", "M", "IL", "22222"));
	    ml.add(new Address("T", "8 St", "C", "IL", "33333"));

	    for (Address element : ml)
	      System.out.println(element + "\n");

	  }

}
