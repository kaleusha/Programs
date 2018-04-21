import java.util.ArrayList;

public class Animal {
	String name;
	String  colore;
	public void eat()
	{
		System.out.println("animal eating");
	}
	public static <T> void print(ArrayList<T> animals)
	{
		System.out.println(animals.toString());
		
	}


}
