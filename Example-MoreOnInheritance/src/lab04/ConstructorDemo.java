/**
 * Lab04
 * @author Zachery Nyman
 * 19 January 2017
 */

package lab04;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println(s1);
		
		//Student s2 = new Student("Zachery", 12345);
		//System.out.println(s2);
		
		Undergraduate ug = new Undergraduate("Joe", 12345, 2);
		System.out.println(ug);
		
		Student s = ug;
		
		System.out.println(s.getClass());
		
		Person p = ug;
		
		//Undergraduate u = s1;
		
		Student s3 = new Student("Bill", 12345);
		Student s4 = new Student("Nancy", 12345);
		System.out.println(s3.equals(s4));
		
		


	}

}
