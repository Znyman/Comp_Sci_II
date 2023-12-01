/**
 * Lab13
 * @author Zachery Nyman
 * 23 Feb 2017
 */

public class SubstitutionCipher implements MessageEncoder {
	
	private static int shift;
	
	public SubstitutionCipher(int initialShift)
	{
		shift = initialShift;
	}

	public String encode(String plaintext)
	{
		String encoded = new String(shift(plaintext));
		return encoded;
	}
	
	private char[] shift(String plaintext)
	{
		char[] shiftedMessage = new char[plaintext.length()];
		for(int i = 0; i < plaintext.length(); i++)
		{
			char c = plaintext.charAt(i);
			char shifted = (char) (c + shift);
			shiftedMessage[i] = shifted;
		}
		return shiftedMessage;
	}
}
