import java.util.Arrays;

public class DemoDriver {

	public static void main(String[] args) {
		
		/*Pet[] p = new Pet[5];
		p[0] = new Pet("Foxy", 2, 47.5);
		p[1] = new Pet("Sparky", 8, 30.8);
		p[2] = new Pet("Stranger", 100, 900);
		p[3] = new Pet("Guy", 4, 100);
		p[4] = new Pet("Flipper", 35, 600);
		Arrays.sort(p);
		
		for(int i = 0; i < p.length; i++)
		{
			System.out.println(p[i]);
		}*/
		
		//example of privacy leak(using mutable variable[owner])
		Pet myDog = new Pet("Peaches", 8,42.0);
		Person owner = new Person("Susanne");
		myDog.setOwner(owner);
		Pet myDogCopy = (Pet) myDog.clone();
		System.out.println(myDog);
		System.out.println(myDogCopy);
		Person theOwner = myDogCopy.getOwner();
		theOwner.setName("Zach");
		System.out.println(myDog);
		System.out.println(myDogCopy);
		
		
		
	}

}
