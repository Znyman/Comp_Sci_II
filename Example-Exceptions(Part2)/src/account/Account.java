package account;

public class Account {
	
	private double balance;
	
	public Account()
	{
		balance = 0;
	}
	
	public Account(double initialDeposit) throws NonPositiveNumberException
	{
		balance = 0;
		if(initialDeposit <= 0)
		{
			throw new NonPositiveNumberException("Initial deposit must be greater than or equal to zero.");
		}
		balance = initialDeposit;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void deposit(double amount) throws NonPositiveNumberException
	{
		if(amount < 0)
		{
			throw new NonPositiveNumberException("Your deposit must be greater than zero.");
		}
		balance += amount;
	}
	
	public void withdrawal(double amount) throws NonPositiveNumberException, InsufficientFundsException
	{
		if(amount < 0)
		{
			throw new NonPositiveNumberException("Your withdrawal must be greater than zero.");
		}
		if(amount > balance)
		{
			throw new InsufficientFundsException("Your withdrawal must be less than or equal to your balance.");
		}
		balance -= amount;
	}
	
	
	
	
	
	
}
