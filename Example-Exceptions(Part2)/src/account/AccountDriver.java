package account;

public class AccountDriver {

	public static void main(String[] args) {
		
		Account myAccount = null;
		try
		{
			myAccount = new Account(45);
			myAccount.deposit(5);
			System.out.println(myAccount.getBalance());
			myAccount.withdrawal(5);
			System.out.println(myAccount.getBalance());
			myAccount.withdrawal(45);
		}
		catch(InsufficientFundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch(NonPositiveNumberException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println(myAccount.getBalance());
	}

}
