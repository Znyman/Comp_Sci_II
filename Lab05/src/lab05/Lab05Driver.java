/**
 * Lab05
 * @author Zachery Nyman
 * 24 January 2017
 */

package lab05;

public class Lab05Driver {

	public static void main(String[] args) {
		
		Doctor d1 = new Doctor();
		System.out.println(d1);
		Doctor d2 = new Doctor("Jae", "Orthopedics", 300.25);
		System.out.println(d2);
		Doctor d3 = new Doctor("Hannah", "Chiropractics", 600.50);
		System.out.println(d3);
		System.out.println(d2.equals(d3));
		d3.set("Edwin", "Psychologist", 500.75);
		System.out.println(d3);
		
		
		
		
		
		


	}

}
