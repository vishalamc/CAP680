import java.util.*;
class MainClass
{
 
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int i,sum=0;
		System.out.println("Enter array size");
		int size=in.nextInt();
		int []myArray=new int[size];
		System.out.println("Enter array elements");
		for(i=0;i<size;i++)
		{
		myArray[i]=in.nextInt();
		}
		for(int x:myArray)
		{
			sum=sum+x;
		}
		System.out.println("Sum of array Elements are:"+sum);
			
	}



}