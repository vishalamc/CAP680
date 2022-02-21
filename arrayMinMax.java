import java.util.*;
class arrayMinMax
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int i;
		int []myarray=new int[5];
		System.out.println("Enter array element");
		for(i=0;i<myarray.length;i++)
		{
			myarray[i]=sc.nextInt();
		}
		System.out.println("Array elements are:");
		for(i=0;i<myarray.length;i++)
		{
			System.out.println(myarray[i]);
		}
		int max=myarray[0];
		int min=myarray[0];
		
		for(i=0;i<myarray.length;i++)
		{

			if(max<myarray[i])
			{

			max=myarray[i];
			}
			else if(min>myarray[i])
			{

			min=myarray[i];
			}
			
		}
		
System.out.println("Largest element from array is:"+max);
System.out.println("Minimum value from array is:"+min);
		

		
		
	}





}