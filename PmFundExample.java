class PMFund
{

	double fundAmount;
	public PMFund()
	{
		fundAmount=1000;
	}
	public double getFundAmount()
	{
		return fundAmount;
	}
	public void setFundAmount(double amt)
	{
		fundAmount=amt;
	}

}
class Bank extends PMFund
{
	public String bankName;
	public String bankIfscCode;
	public String customerId;
	public double customerBalance;
	public double newBalance;
	public Bank()
	{
		bankName="SBI";
		bankIfscCode="SBI10001";
		customerId="SBI101";
		customerBalance=5000;		
	}
	protected void getNewBalance()
	{
		newBalance= fundAmount+customerBalance;
		System.out.println("Total Balance: "+newBalance);
	}
}
class Customer extends Bank
{
	public String customerName;
	public Customer()
	{
	customerName="Kumar Vishal";
	}
	public void getCustomerDetails()
	{
		System.out.println("Customer Name:"+customerName);
	}
}
class MainClass
{

	public static void main(String []args)
	{
		Customer c1=new Customer();
		c1.getCustomerDetails();
		c1.getNewBalance();
		

	}

}