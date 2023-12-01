/**
 * 10 January 2016
 * @author Zachery Nyman
 * Lab02
 */

public class HotDogStandDriver {

	public static void main(String[] args) {
		
		HotDogStand stand1 = new HotDogStand("Zach's Stand");
		for (int i = 0; i < 30; i++)
		{
			stand1.justSold();
		}
		System.out.println(stand1.getHotDogStandID() + " sold " + stand1.getHotDogsSold() + " hot dogs.");
		
		HotDogStand stand2 = new HotDogStand("DU's Stand");
		for (int i = 0; i < 60; i++)
		{
			stand2.justSold();
		}
		System.out.println(stand2.getHotDogStandID() + " sold " + stand2.getHotDogsSold() + " hot dogs.");
		
		HotDogStand stand3 = new HotDogStand("Betty's Stand");
		for (int i = 0; i < 45; i++)
		{
			stand3.justSold();
		}
		System.out.println(stand3.getHotDogStandID() + " sold " + stand3.getHotDogsSold() + " hot dogs.");
		
		System.out.println("Total hotdogs sold: " + HotDogStand.getTotalHotDogsSold());
		
		
		

	}

}
