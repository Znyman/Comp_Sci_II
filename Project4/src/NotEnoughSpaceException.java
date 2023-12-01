/**
 * Project4
 * @author Zachery Nyman
 * 22 Feb 2017
 */

public class NotEnoughSpaceException extends Exception {
	
	public NotEnoughSpaceException()
	{
		super("NotEnoughSpaceException");
	}
	
	public NotEnoughSpaceException(String message)
	{
		super(message);
	}
}