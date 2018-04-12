import java.io.IOException;

public interface Manager {
	public void newAddressBook() throws IOException;
	public void  openFile() throws IOException;
	public void closeFile() throws IOException;
	public void saveFile() throws IOException;
	public void saveAs();

}
