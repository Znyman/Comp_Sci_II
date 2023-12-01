package lab04;

public class Undergraduate extends Student {
	
	private int level;
	//1 = freshman, 2 = sophomore, 3 Junior, 4 Senior
	
	public Undergraduate()
	{
		super();
		level = 1;
	}
	
	public Undergraduate(String initialName, int initialStudentNumber, int initialLevel)
	{
		super(initialName, initialStudentNumber);
		setLevel(initialLevel);
	}
	
	public int getLevel()
	{
		return level;
	}
	
	public void setLevel(int newLevel)
	{
		if (newLevel > 0 && newLevel < 5)
		{
			level = newLevel;
		}
		else
		{
			level = 1;
		}
	}
	
	public void set(String newName, int newStudentNumber, int newLevel)
	{
		set(newName, newStudentNumber);
		setLevel(newLevel);
	}
	
	public String toString()
	{
		return super.toString() + "\nStudent Level: " + getLevel();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
