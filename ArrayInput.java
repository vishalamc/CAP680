import java.util.*;
class MainClass
{

	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int []myArray=new int[5];
		int i,max,min;
		System.out.println("Enter 5 array elements integer only");
		for(i=0;i<5;i++)
		{
		myArray[i]=in.nextInt();
		}
		
		max=myArray[0];
		min=myArray[0];
		for(i=0;i<5;i++)
		{
			if(max<myArray[i])
			{
				max=myArray[i];
			}
			else if(min>myArray[i])
			{
				min=myArray[i];
			}
		}
		
System.out.println("Max "+max);
System.out.println("Min "+min);		
	}

}