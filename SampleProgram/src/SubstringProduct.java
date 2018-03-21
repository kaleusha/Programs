import java.util.Scanner;

public class SubstringProduct {
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
		int max=max=array[0]*array[1];
		int num1=0,num2=0;
		
		System.out.println("elements are: ");
		for(int j=0;j<array.length-2;j++)
		{
			
				 
				if(max<array[j+1]*array[j+2])
				{
					max=array[j+1]*array[j+2];
					num1=j+1;
					num2=j+2;
					
				
			}else if(max==array[0]|| max==array[1])
			{
				num1=0;
				num2=1;
			}
		}
		
			System.out.println(num1);
		System.out.println(num2);
		//System.out.println("product is: "+num1*num2);
		scanner.close();
	}

}
