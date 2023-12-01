
public abstract class Ticket {
	
	private static int nextNumber = 1;
	private int ticketNumber;
	
	public Ticket()
	{
		ticketNumber = nextNumber;
		nextNumber++;
	}
	
	abstract public int getPrice();
	
	public String toString()
	{
		return "Ticket Number: " + ticketNumber + " Price: " + getPrice();
	}
	
	
	
	
	

}
