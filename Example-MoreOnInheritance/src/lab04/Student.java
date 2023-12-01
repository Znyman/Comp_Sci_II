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
		//this("This is the name I want", 12345);
		studentNumber = 0;
		System.out.println("Student: No arg constructor called.");
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
	
	public boolean equals(Object otherObject)//overriding
	{
		if (otherObject == null)
		{
			return false;
		}
		else if (getClass() != otherObject.getClass())
		{
			return false;
		}
		else
		{
			Student otherStudent = (Student)otherObject;
			return (sameName(otherStudent)) && studentNumber == otherStudent.studentNumber;
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
