/**
 * Project4
 * @author Zachery Nyman
 * 22 Feb 2017
 */

public class SecretMessageException extends Exception {
	
	public SecretMessageException()
	{
		super("SecretMessageException");
	}
	
	public SecretMessageException(String message)
	{
		super(message);
	}
}