
public class Person implements Cloneable
{
    private String name;
    
    public Person( )
    {
        name = "No name yet";
    }
    
    public Person(String initialName)
    {
        name = initialName;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public String getName( )
    {
        return name;
    }
    
    public void writeOutput( )
    {
        System.out.println("Name: " + name);
    }
   
    public boolean hasSameName(Person otherPerson)
    {
        return this.name.equalsIgnoreCase(otherPerson.name);
    }
    
    public Object clone()
    {
    	try
    	{
    		return super.clone();
    	}
    	catch(CloneNotSupportedException e)
    	{
    		System.out.println(e.getMessage());
    		return null;
    	}
    }
    
    
    
    
    
    
    
    
    
    
    
}
