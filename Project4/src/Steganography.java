/**
 * Project4
 * @author Zachery Nyman
 * 22 Feb 2017
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;


public class Steganography {
	
	public static String decodeMessage(File inputFile) throws SecretMessageException
	{
		RandomAccessFile inputStream = null;
		try
		{
			inputStream = new RandomAccessFile(inputFile, "r");
			inputStream.seek(50);
			int messageLength = inputStream.readInt();//length of message;
			char[] secretMessageChar = new char[messageLength];
			secretMessageChar[0] = inputStream.readChar();//first char
			long location = inputStream.readLong();//location of next char
			for(int i = 1; i < messageLength; i++)
			{
				inputStream.seek(location);
				secretMessageChar[i] = inputStream.readChar();
				location = inputStream.readLong();
			}
			inputStream.close();
			String decodedMessage = new String(secretMessageChar);
			return decodedMessage;
		}
		catch(FileNotFoundException e)
		{
			throw new SecretMessageException(e.getMessage());
		}
		catch(IOException e)
		{
			throw new SecretMessageException(e.getMessage());
		}
	}
	
	public static void encodeMessage(File inputFile, File outputFile, String message) throws NotEnoughSpaceException, SecretMessageException
	{
		RandomAccessFile outputStream = null;
		long[] dataLocations = new long[message.length()];
		try
		{
			Files.copy(inputFile.toPath(), outputFile.toPath(), StandardCopyOption.REPLACE_EXISTING);//copies contents of NoSecretMessage message into NewSecretMessage
			outputStream = new RandomAccessFile(outputFile, "rw");									//and overwrites existing content, if applicable
			outputStream.seek(50);
			outputStream.writeInt(message.length());//size of the message placed @ 51-54 bytes (inclusive)
			dataLocations = getDataLocations(54, outputFile.length(), message.length());//54 is used as the start because the first 4 bytes
																						// of the message contains the (int) length of the message
			for(int i = 0; i < dataLocations.length; i++)
			{
				outputStream.seek(dataLocations[i]);
				outputStream.writeChar(message.charAt(i));
				if(i < dataLocations.length-1)
				{
					outputStream.writeLong(dataLocations[i+1]);
				}
				else
				{
					outputStream.writeLong(0);
				}
			}
			outputStream.close();
		}
		catch(FileNotFoundException e)
		{
			throw new SecretMessageException(e.getMessage());
		}
		catch(IOException e)
		{
			throw new SecretMessageException(e.getMessage());
		}
		catch(Exception e)
		{
			if(message.length() > outputFile.length()/10)
			{
				throw new NotEnoughSpaceException("Space needed: " + ((message.length()*10)+message.length()) + "\nSpace available: " + ((outputFile.length()/10)-54));
				//10 is used because each char/location takes 10 bytes, and message.length was added as space needed for one byte of separation
				//54 is subtracted because header is initial 50 bytes and length of message is the next 4 bytes
			}
			else
			{
				throw new SecretMessageException(e.getMessage());
			}
		}
	}
	
	private static long[] getDataLocations(long start, long stop, int numLocations) throws NotEnoughSpaceException
	{
		long[] dataLocations = new long[numLocations];//message.length
		try
		{
			int index = 0;
			for(long i = start; i <= stop; i += stop/numLocations)//maximum bytes of separation per char/location
			{
				dataLocations[index] = i;
				index++;
			}
		}
		catch(Exception e)
		{
			if(numLocations > stop/10)
			{
				throw new NotEnoughSpaceException("Space needed: " + ((numLocations*10)+numLocations) + "\nSpace available: " + ((stop/10)-54));
				//10 is used because each char/location takes 10 bytes, and numLocations was added as space needed for one byte of separation
				//54 is subtracted because header is initial 50 bytes and length of message is the next 4 bytes
			}
		}
		return dataLocations;
	}
}