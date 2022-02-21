class MainClass
{

	public static void main(String []args)
	{
		int i,j;
		int [][] myArray=new int[4][];
				
		myArray[0]=new int[]{1,1,1,1};
		myArray[1]=new int[]{2,2,2};
		myArray[2]=new int[]{3,3};
		myArray[3]=new int[]{4};

		for(i=0;i<myArray.length;i++)
		{

			for(j=0;j<myArray[i].length;j++)
			{
				System.out.print(myArray[i][j]);
			}
			System.out.println();
		}

		


	}


}