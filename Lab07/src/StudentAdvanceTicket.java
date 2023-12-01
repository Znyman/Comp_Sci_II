
public class StudentAdvanceTicket extends AdvanceTicket {
	
	public StudentAdvanceTicket(int days)
	{
		super(days);
	}
	
	public int getPrice()
	{
		if(getDaysInAdvance() >= 10)
		{
			return 15;
		}
		else
		{
			return 20;
		}
	}

}
