/**
 * Lab10
 * @author Zachery Nyman
 * 14 February 2017
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFileDriver {

	public static void main(String[] args) {
		
		String filename = "advice.txt";
		Scanner inFile = null;
		PrintWriter outFile = null;
		Scanner keyboard = new Scanner(System.in);
		
		try
		{
		    inFile = new Scanner(new FileInputStream(filename));
		}
		catch (FileNotFoundException e)
		{
		    System.out.println("Cannot open file: " + filename);
		    System.exit(0);
		}
		
		String myAdvice = inFile.nextLine();
		System.out.println(myAdvice);
		
		inFile.close();
		
		try
		{
			outFile = new PrintWriter(new FileOutputStream(filename));
			System.out.print("What is your advice? ");
			String yourAdvice = keyboard.nextLine();
			outFile.print("My advice: " + yourAdvice);
		}
		catch (FileNotFoundException e)
		{
		    System.out.println("Cannot open file: " + filename);
		    System.exit(0);
		}
		
		outFile.close();
		
	}

}
