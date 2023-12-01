package referenceDemo;

public class DemoDriver {

	public static void main(String[] args) {
		
		Neighbor myNeighbor = new Neighbor("The Smiths", 0, new Pet("Grumpy", 3, 90.5));
		Neighbor anotherNeighbor = new Neighbor(myNeighbor);
		
		System.out.println("Before any changes: ");
		System.out.println(myNeighbor);
		System.out.println();
		System.out.println(anotherNeighbor);
		
		anotherNeighbor.setName("The Millers");
		anotherNeighbor.setNumberOfChildren(2);
		Pet otherPet = anotherNeighbor.getPet();
		otherPet.setName("Happy");
		
		System.out.println();
		System.out.println("After the changes: ");
		System.out.println(myNeighbor);
		System.out.println();
		System.out.println(anotherNeighbor);

	}

}
