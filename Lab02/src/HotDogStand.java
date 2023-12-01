/**
 * 10 January 2016
 * @author Zachery Nyman
 * Lab02
 */

public class HotDogStand {
	
	private String hotDogStandID;
	private int hotDogsSold;
	private static int totalHotDogsSold;
	
	public HotDogStand(String dogStandID)
	{
		hotDogStandID = dogStandID;
		hotDogsSold = 0;
	}
	
	public void justSold()
	{
		hotDogsSold++;
		totalHotDogsSold ++;
	}
	
	public String getHotDogStandID()
	{
		return hotDogStandID;
	}
	
	public int getHotDogsSold()
	{
		return hotDogsSold;
	}
	
	public static int getTotalHotDogsSold()
	{
		return totalHotDogsSold;
	}
	
}
