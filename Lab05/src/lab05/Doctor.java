/**
 * Lab05
 * @author Zachery Nyman
 * 24 January 2017
 */

package lab05;

public class Doctor extends Person {
	
	private String specialty;
	private double officeVisitFee;
	
	public Doctor()
	{
		super();
		specialty = "Unknown";
		officeVisitFee = 0;
	}
	
	public Doctor(String initialName, String initialSpecialty, double initialOfficeVisitFee)
	{
		super(initialName);
		setSpecialty(initialSpecialty);
		setOfficeVisitFee(initialOfficeVisitFee);
	}
	
	public void set(String newName, String newSpecialty, double newOfficeVisitFee)
	{
		setName(newName);
		setSpecialty(newSpecialty);
		setOfficeVisitFee(newOfficeVisitFee);
	}
	
	public void setSpecialty(String newSpecialty)
	{
		if (!newSpecialty.equals(null))
		{
			specialty = newSpecialty;
		}
		else
		{
			System.out.println("No specialty entered.");;
		}
	}
	
	public void setOfficeVisitFee(double newOfficeVisitFee)
	{
		if (newOfficeVisitFee > 0)
		{
			officeVisitFee = newOfficeVisitFee;
		}
		else
		{
			System.out.println("Invalid office visit fee entered.");
		}
	}
	
	public String getSpecialty( )
    {
        return specialty;
    }
	
	public double getOfficeVisitFee( )
    {
        return officeVisitFee;
    }
	
	public String toString()
	{
		return super.toString() + "\nSpecialty: "+ getSpecialty() + "\nOffice visit fee: " + getOfficeVisitFee();
	}
	
	public boolean equals(Object otherObject)
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
			Doctor otherDoctor = (Doctor)otherObject;
			return (sameName(otherDoctor)) && specialty.equals(otherDoctor.specialty) && officeVisitFee == otherDoctor.officeVisitFee;
		}
	}
	
	
	
	

}
