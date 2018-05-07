import java.util.ArrayList;

public class Animal {
	String name;
	String  colore;
	public void eat()
	{
		System.out.println("animal eating");
	}
	
	public static void print(ArrayList<? extends Animal> animals)
	{
		System.out.println(animals.toString());
		
	}


}
