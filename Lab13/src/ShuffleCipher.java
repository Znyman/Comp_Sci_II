/**
 * Lab13
 * @author Zachery Nyman
 * 23 Feb 2017
 */

public class ShuffleCipher implements MessageEncoder {
	
	private static int shuffle;
	
	public ShuffleCipher(int n)
	{
		shuffle = n;
	}
	
	public String encode(String plaintext)
	{
		String encoded = plaintext;
		for(int i = 0; i < shuffle; i++)
		{
			encoded = new String(shuffle(encoded));
		}
		
		return encoded;
	}
	
	private char[] shuffle(String plaintext)
	{
		String firstHalf;
		String secondHalf;
		int index = 0;
		char firstShuffled;
		char secondShuffled;
		char[] shuffledMessage = new char[plaintext.length()];
		
		if(plaintext.length()%2 == 1)
		{
			firstHalf = plaintext.substring(0, plaintext.length()/2+1);
			secondHalf = plaintext.substring(plaintext.length()/2+1, plaintext.length());
			for(int i = 0; i < firstHalf.length(); i++)
			{
				firstShuffled = firstHalf.charAt(i);
				shuffledMessage[index] = firstShuffled;
				index += 2;
			}
			index = 1;
			for(int i = 0; i < secondHalf.length(); i++)
			{
				secondShuffled = secondHalf.charAt(i);
				shuffledMessage[index] = secondShuffled;
				index += 2;
			}
		}
		else
		{
			firstHalf = plaintext.substring(0, plaintext.length()/2);
			secondHalf = plaintext.substring(plaintext.length()/2, plaintext.length());
			for(int i = 0; i < firstHalf.length(); i++)
			{
				firstShuffled = firstHalf.charAt(i);
				shuffledMessage[index] = firstShuffled;
				index++;
				secondShuffled = secondHalf.charAt(i);
				shuffledMessage[index] = secondShuffled;
				index++;
			}
		}
		return shuffledMessage;
	}
}
