import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BinaryFileDriver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String filename = "plates.data";
		ObjectOutputStream outputStream = null;
		ObjectInputStream inputStream = null;
		
		LicensePlate plateOne = new LicensePlate("Colorado", "QVC279");
		LicensePlate plateTwo = new LicensePlate("Califonia", "RV8TX1");
		LicensePlate plateThree = new LicensePlate("Florida", "PO9F61");
		
		try
		{
			outputStream = new ObjectOutputStream(new FileOutputStream(filename));
			outputStream.writeObject(plateOne);
			outputStream.writeObject(plateTwo);
			outputStream.writeObject(plateThree);
		}
		catch (IOException e)
		{
		    System.out.println("Problem with writing to the file.");
		    System.exit(0);
		}
		outputStream.close();
		
		try
		{
			inputStream = new ObjectInputStream(new FileInputStream(filename));
			while(true)
			{
				System.out.println(inputStream.readObject());
			}
		}
		catch (FileNotFoundException e)
		{
		    System.out.println("Cannot open file: " + filename);
		    System.exit(0);
		}
		catch (EOFException e)
		{
		    System.out.println("No more numbers in the file.");
		    System.exit(0);
		}
		catch (IOException e)
		{
		    System.out.println("Problem with writing to the file.");
		    System.exit(0);
		}
		inputStream.close();
	}

}
