
public class FruitTest {

	public static void main(String[] args) {
		
		Fruit fruit = new GoldenDelicious();
		Orange orange = new Orange();
		Apple apple = new Macintosh();
		
		//Question 1
		System.out.println(fruit instanceof Fruit);
		//Question 2
		System.out.println(fruit instanceof Orange);
		//Question 3
		System.out.println(fruit instanceof Apple);
		//Question 4
		System.out.println(fruit instanceof GoldenDelicious);
		//Question 5
		System.out.println(fruit instanceof Macintosh);
		//Question 6
		System.out.println(orange instanceof Orange);
		//Question 7
		System.out.println(orange instanceof Fruit);
		//Question 8
		//fruit.makeAppleCider();
		apple.makeAppleCider();
		//Question 9
		
		//Question 10
		apple.makeAppleCider();
		//Question 11
		orange.makeOrangeJuice();
		//fruit.makeOrangeJuice();
		//Question 12
		//Orange p = new Apple();
		//Macintosh p = new Apple();
		Apple p = new Macintosh();
		
		
		
		
		
		

	}

}
