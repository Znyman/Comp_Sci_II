/**
 * Lab04
 * @author Zachery Nyman
 * 19 January 2017
 */

package lab04;

public class Lab04Driver {

	public static void main(String[] args) {
		
		Person instructor = new Person("Susanne Sherba");
		System.out.println(instructor);
		System.out.println();
		
		Student ta = new Student("Sneha Sawlini", 12345);
		System.out.println(ta);
		System.out.println();
		
		Employee intel = new Employee("Zachery Nyman", "0987654321", 120000);
		System.out.println(intel);
		System.out.println();
		
		Employee intern = new Employee();
		System.out.println(intern);
		System.out.println();
		
		Employee president = new Employee("Barack Obama", "12334567890", 500000);
		System.out.println(president);
		System.out.println();
		
		intel.setAnnualSalary(140000);
		intel.setIdNumber("65474839");
		System.out.println(intel);
		
		
		
		
		


	}

}
