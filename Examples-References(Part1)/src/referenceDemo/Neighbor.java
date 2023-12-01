package referenceDemo;
// version 1

public class Neighbor
{
    private String name;
    private int    numberOfChildren;
    private Pet    familyPet;
	

    public Neighbor()
    {
    	name = null;
    	numberOfChildren = 0;
    	familyPet = null;
    }
    
	public Neighbor(String newName, int children, Pet thePet)
	{
		name = newName;
		numberOfChildren = children;
		familyPet = thePet;
	}
	
    public String getName()
	{
		return name;
	}
    
	public void setName(String newName)
	{
		name = newName;
	}
	
	public int getNumberOfChildren()
	{
		return numberOfChildren;
	}
	
	public void setNumberOfChildren(int howMany)
	{
		numberOfChildren = howMany;
	}
	
	public Pet getPet( )
    {
        return familyPet;
    }
	
	public void setPet(Pet thePet)
	{
		familyPet = thePet;
	}
		
	
    public String toString( )
    {
        return "Neighbor: " + name + "\nNumber of children: " + numberOfChildren
        		+ "\nTheir Pet:\n" + familyPet;
		
	}
}
