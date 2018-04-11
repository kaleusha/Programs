import java.io.IOException;
import java.util.ArrayList;

public interface AddressBook {
	public void add() throws IOException;
	public void delete();
	public void edit();
	public void sortByLastName();
	public void sortByZip();
	public void print() throws IOException;
	

}
