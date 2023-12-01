/**
 * Lab04
 * @author Zachery Nyman
 * 19 January 2017
 */
package lab04;

public class Student extends Person {
	
	private int studentNumber;
	
	public Student()
	{
		super();
		studentNumber = 0;
	}
	
	public Student(String initialName, int initialStudentNumber)
	{
		super(initialName);
		studentNumber = initialStudentNumber;
	}
	
	public void set(String newName, int newStudentNumber)
	{
		setName(newName);
		studentNumber = newStudentNumber;
	}
	
	public int getStudentNumber()
	{
		return studentNumber;
	}
	
	public void setStudentNumber(int newStudentNumber)
	{
		studentNumber = newStudentNumber;
	}
	
	public String toString()
	{
		return "Name: " + getName() + "\nStudent number: " + studentNumber;
	}
	

}
