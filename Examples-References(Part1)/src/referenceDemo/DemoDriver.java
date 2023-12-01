package referenceDemo;

public class DemoDriver {

	public static void main(String[] args) {
		
		//primitive
		int age;
		age = 21;
		int anotherAge;
		anotherAge = age;
		
		Pet aDog;
		aDog = new Pet ("Peaches", 8, 40.0);
		System.out.println(aDog);
		Pet anotherDog;
		anotherDog = aDog;
		anotherDog.setName("Bowser");
		
		/*System.out.println("aDog values: ");
		System.out.println(aDog);
		System.out.println();
		System.out.println("anotherDog values: ");
		System.out.println(anotherDog);
		
		System.out.println(aDog == anotherDog);*/
		
		Pet thirdDog = new Pet("Bowser", 8, 40.0);
		
		System.out.println(thirdDog.equals(anotherDog));
		
		age = 24;
		Pet.changer(age);
		System.out.println("Vale of age in driver is: " + age);
		
		Pet.changer(thirdDog);
		System.out.println(thirdDog);
		
		Neighbor myNeighbor = new Neighbor("The Smiths", 0, new Pet("Grumpy", 3, 90.5));
		

	}

}
