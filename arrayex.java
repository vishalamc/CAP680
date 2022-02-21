import java.util.*;
class arrayex
{
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=in.nextInt();
		int sum=0;
		int []myarray=new int[size];
		int i;
		System.out.println("Enter array elements");
		for(i=0;i<size;i++)
		{
			myarray[i]=in.nextInt();

		}
		
		for(i=0;i<size;i++)
		{
			sum=sum+myarray[i];

		}
		System.out.println("Sum of Array elements:"+sum);
	}


}