package instruments;

public abstract class Instrument {
	
	private String name;
	
	public Instrument(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	
	abstract public void play();//no body (not even an empty body for abstract method)
	

}
