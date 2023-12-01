package account;

public class InsufficientFundsException extends Exception {
	
	public InsufficientFundsException()
	{
		super("InsufficientSFundsException");
	}
	
	public InsufficientFundsException(String message)
	{
		super(message);
	}

}
