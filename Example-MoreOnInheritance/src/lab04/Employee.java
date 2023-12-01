/**
 * Lab04
 * @author Zachery Nyman
 * 19 January 2017
 */
package lab04;

public class Employee extends Person {
	
	private String idNumber;
	private double annualSalary;
	
	public Employee()
	{
		super();
		idNumber = "No ID yet";
		annualSalary = 0;
	}
	
	public Employee(String initialName, String initialIdNumber, int initialAnnualSalary)
	{
		super(initialName);
		idNumber = initialIdNumber;
		annualSalary = initialAnnualSalary;
	}
	
	public void setIdNumber(String newIdNumber)
	{
		idNumber = newIdNumber;
	}
	
	public void setAnnualSalary(int newAnnualSalary)
	{
		annualSalary = newAnnualSalary;
	}
	
	public String toString()
	{
		return "Name: " + getName() + "\nID number: " + idNumber + "\nSalary: " + annualSalary;
	}
	

}
