package instruments;

public abstract class KeyboardInstrument extends Instrument {
	
	private int numberOfKeys;
	
	public KeyboardInstrument(String name, int numKeys)
	{
		super(name);
	}

}
