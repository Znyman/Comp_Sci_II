package rooms;

public class RoomOccupancy {
	
	private int numberInRoom;
	private static int totalNumber = 0;
	
	public RoomOccupancy()
	{
		numberInRoom = 0;
	}
	
	public RoomOccupancy(int num)
	{
		numberInRoom= num;
		totalNumber += num;
	}
	
	public void addOneToRoom()
	{
		numberInRoom++;
		totalNumber++;
	}
	
	public void removeOneFromRoom()
	{
		if (numberInRoom > 0)
		{
			numberInRoom--;
			totalNumber--;
		}
	}
	
	public int getNumberInRoom()
	{
		return numberInRoom;
	}
	
	public static int getTotal()
	{
		return totalNumber;
	}
	
	
	
	
	
	

}
