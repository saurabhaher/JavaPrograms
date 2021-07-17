package com.assign2;

class Account
{
	int accountNO ;
	double accountBalance;
	String accountType;
	static int accountCount;
	public Account(int accountNO, double accountBalance, String accountType) {
		super();
		this.accountNO = accountNO;
		this.accountBalance = accountBalance;
		this.accountType = accountType;
		accountCount++;
	}
	
	void depositAmount(double amount)
	{
		accountBalance =accountBalance+ amount;
	}

	
	public void getAccountDetails() 
	{
		System.out.println("Account [accountNO=" + accountNO + ", accountBalance=" + accountBalance + ", accountType=" + accountType
				+ "]");
	}
	
}

class StaticDemo
{
	public static double fahrenheitToCelcius(double f)
	{
		double c = ((f-32)*5)/9;
		return c;
	}
}
public class Assignment2B {

	public static void main(String[] args) {
		Account S1 = new Account(11,1000,"Saving");
		S1.getAccountDetails();
		Account c1 = new Account(12,1000,"Current");
		c1.depositAmount(200);
		c1.getAccountDetails();
		
	}

}
