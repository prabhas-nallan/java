import java.util.Scanner;
class BankAccount
{
	private String accHolderName;
	private String accNo;
	private double Balance;
	BankAccount(){	}
	BankAccount(String ah,String an,double b)
	{
		this.accHolderName=ah;
		this.accNo=an;
		this.Balance=b;
	}
	void setaccHolderName(String ah1)
	{
		this.accHolderName=ah1;
	}
	void setaccNo(String an1)
	{
		this.accNo=an1;
	}
	void setBalance(double b1)
	{
		this.Balance=b1;
	}
	double getBalance()
	{
		return this.Balance;
	}
	double deposit(double amtdep)
	{
		this.Balance=this.Balance+amtdep;
		return this.Balance;
	}
	double withdraw(double amtwith)
	{
		if(this.Balance<amtwith)
		{
			System.out.println("You have only "+this.Balance+"amount and you are asking for "+amtwith);
		}
		else
		{
			this.Balance=this.Balance-amtwith;
		}
		return this.Balance;
	}
	void display()
	{
		System.out.println("Account holder name is: "+this.accHolderName);
		System.out.println("Account number is: "+this.accNo);
		System.out.println("Account balance is: "+this.Balance);
	}
}
	