/**
 * Project4
 * @author Zachery Nyman
 * 22 Feb 2017
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SteganographyDriver {

	public static void main(String[] args) throws SecretMessageException, IOException, NotEnoughSpaceException {
		
		Scanner keyboard =  new Scanner(System.in);
		File filename = new File("SecretMessage.wav");
		File inputFile = new File("NoSecretMessage.wav");
		File outputFile = new File("NewSecretMessage.wav");
		System.out.println("The original secret message hidden in the audio file was: \n" + Steganography.decodeMessage(filename));
		System.out.println("Enter a secret message to be hidden in an audio file: ");
		String secretMessage = keyboard.nextLine();
		Steganography.encodeMessage(inputFile, outputFile, secretMessage);
		System.out.println("The decoded message in the audio file was: \n"+ Steganography.decodeMessage(outputFile));
	}
}