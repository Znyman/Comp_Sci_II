
public class AdvanceTicket extends Ticket {
	
	private int daysInAdvance;
	
	public AdvanceTicket(int days)
	{
		super();
		daysInAdvance = days;
	}
	
	public int getPrice()
	{
		if(daysInAdvance >= 10)
		{
			return 30;
		}
		else
		{
			return 40;
		}
	}
	
	public int getDaysInAdvance()
	{
		return daysInAdvance;
	}

}
