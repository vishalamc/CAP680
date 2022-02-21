class MainClass
{
	public static void main(String []args)
	{
		Customer C1=new Customer();
		C1.getDetails();
	}		

}
class Bank
{
	protected String BankName;
	Bank()
	{
	BankName="SBI";
	}

}
class Customer extends Bank
{
	private String CustName="kumar";	
	public void getDetails()
	{
	System.out.println("Bank: "+BankName+"Customer Name: "+CustName);
	}

}