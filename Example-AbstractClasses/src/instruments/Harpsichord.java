package instruments;

public class Harpsichord extends KeyboardInstrument {
	
	public Harpsichord(int numKeys)
	{
		super("Harpsichord", numKeys);
	}
	
	public void play()
	{
		System.out.println("A Harpsichord is playing");
	}
	
	
	

}
