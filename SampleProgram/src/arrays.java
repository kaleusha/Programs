import java.util.Scanner;

public class arrays {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println(" how many  elements: ");
		int number=scanner.nextInt();
		int array[] = new int[number];

		System.out.println("Enter Array Elements: ");
		
		for(int i=0;i<number;i++)
		{
		     
			
			array[i]=scanner.nextInt();
			
		}
		int large=array[0];
		int secLarge=array[1];
		int small=array[0];
		int small2=array[1];
		for(int j=1;j<array.length;j++)
		{
			if(small>array[j])
			{
				small2=small;
				small=array[j];
			}else
			{
				if(large<array[j])
				{
					secLarge=large;
					large=array[j];
					
				}
			}
		}System.out.println("second largest: "+secLarge);
		System.out.println("largest: "+large);
		System.out.println("smallest: "+small);
		System.out.println("second smallest: "+small2);
		scanner.close();
	}
	

}
