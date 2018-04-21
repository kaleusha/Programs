import java.util.HashMap;
import java.util.HashSet;

public class arrayelement {
	public static void main(String[] args) {
		int array[]= {1,2,1,2,3,4,5};
		//ArrayList<Integer> arrayList = new ArrayList<Integer>(Array.asList(array));
		HashMap<Integer, Integer> hashMap=new HashMap<>();
		int count=0;
		boolean flag=true;
		for(int i=0;i<array.length;i++)
		{
			if(hashMap.containsKey(array[i]))
			{
				hashMap.put(array[i], hashMap.get(array[i])+1);
				
			}else
				hashMap.put(array[i], 1);
			
	}System.out.println(hashMap);
	}

}
