import java.util.*;
class oneDarray
{
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int i,sum=0;
		int [] num=new int[5];
		System.out.println("Enter 5 values");

		for(i=0;i<5;i++)
		{
		num[i]=sc.nextInt();
		}
		for(int j:num)
		{
		sum=sum+num[j];
		}
              System.out.println(sum);
		
	}
}