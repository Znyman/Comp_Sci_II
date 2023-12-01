package rooms;

public class RoomOccupancyDriver {

	public static void main(String[] args) {
		
		RoomOccupancy room1 = new RoomOccupancy();
		room1.addOneToRoom();
		System.out.println("People in room 1: " + room1.getNumberInRoom());
		System.out.println("The total in the building is: " + RoomOccupancy.getTotal());
		RoomOccupancy room2 = new RoomOccupancy(41);
		room2.removeOneFromRoom();
		System.out.println("People in room 2: " + room2.getNumberInRoom());
		System.out.println("The total in the building is: " + RoomOccupancy.getTotal());
		
		
		
		

	}

}
