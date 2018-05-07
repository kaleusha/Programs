import java.util.ArrayList;

public class AnimalMain {
	
	public static void main(String[] args) {
		
		ArrayList<Dog>  arrayList=new ArrayList<>();
		ArrayList<Cat>  arrayList1=new ArrayList<>();
		
		Dog dog=new Dog();
		dog.name="xyz";
		dog.colore="black";
		Cat cat=new Cat();
		cat.name="pqr";
		cat.colore="white";
		arrayList.add(dog);
		arrayList1.add(cat);
		
		ArrayList<String>  arrayList2 = new ArrayList<>();
		
		Animal.print(arrayList);
		Animal.print(arrayList1);
		
		//Animal.print(arrayList2);
	}

}
