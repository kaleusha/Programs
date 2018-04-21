import java.util.HashSet;
import java.util.Set;

public class set {
	public static void main(String[] args) {
		Set<user>  set=new  HashSet<>();
		user user=new user(1, "usha");
		user user2=new user(1, "usha");
		
		set.add(user);
		set.add(user2);
		System.out.println(set.size());
		System.out.println(set);
		
	}
	

}