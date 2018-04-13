/******************************************************************************
 *  Purpose: Interface for Address Book 
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   10-04-2018
 ******************************************************************************/
import java.io.IOException;

public interface AddressBook {
	public void add() throws IOException;
	public void delete();
	public void edit();
	public void sortByLastName();
	public void sortByZip();
	public void print() throws IOException;
	

}
