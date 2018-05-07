import java.util.Scanner;

public class CountDuplicate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = scanner.nextInt();

		int[] crr_array = new int[size];
		int[] new_array= new int[size];
		int[] times = new int[size];

		// Read integers from the console
		System.out.println("Enter array elements: ");
		for (int i = 0; i < crr_array.length; i++) {
		    crr_array[i] = scanner.nextInt();
		    times[i] = 1;
		}

		// Search for repeated elements
		for (int j = 0; j < crr_array.length; j++) {
		    for (int i = j; i < crr_array.length; i++) {
		        if (crr_array[j] == crr_array[i] && j != i )
		        {
		            new_array[i] = crr_array[i];
		        	times[i]++;
		        }
		    }
		}



		//Printing output
		for (int i = 0; i <crr_array.length; i++) 
		{
		 for(int j=0;j<times.length;j++)
		 {
			if(crr_array[i]!=crr_array[i+1] && times[j]==2)
			{
		     System.out.println("\t" + crr_array[i]  + "\t" + times[i]);
			}

		 }	
		}scanner.close();
	}
}
