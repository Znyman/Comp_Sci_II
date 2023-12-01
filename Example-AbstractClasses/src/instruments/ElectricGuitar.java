package instruments;

public class ElectricGuitar extends StringInstrument {
	
	public ElectricGuitar(int numStrings)
	{
		super("Electric Guitar", numStrings);
	}
	
	public void play()
	{
		System.out.println("An electric guitar is playing");
	}
	
	
	
	

}
