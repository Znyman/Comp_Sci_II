
/**
 Class for basic pet records: name, age, and weight.
*/
public class Pet implements Comparable, Cloneable
{
    private String name;
    private int age;//in years
    private double weight;//in pounds
    private Person owner = null;

    public String toString( )
    {
        return ("Name: " + name + " Age: " + age + " years"
                       + "\nWeight: " + weight + " pounds" + " Owner: " + owner.getName());
    }

    public Pet(String initialName, int initialAge, 
                                          double initialWeight)
    {
        name = initialName;
        if ((initialAge < 0) || (initialWeight < 0))
        {
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        }
        else
        {
            age = initialAge;
            weight = initialWeight;
        }
    }

    public void set(String newName, int newAge, double newWeight)
    {
        name = newName;
        if ((newAge < 0) || (newWeight < 0))
        {
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        }
        else
        {
            age = newAge;
            weight = newWeight;
        }
    }

    public Pet(String initialName)
    {
        name = initialName;
        age = 0;
        weight = 0;
    } 

    public void setName(String newName)
    {
        name = newName; 
    }

    public Pet(int initialAge)
    {
        name = "No name yet.";
        weight = 0;
        if (initialAge < 0)
        {
            System.out.println("Error: Negative age.");
            System.exit(0);
        }
        else
            age = initialAge;
    }

    public void setAge(int newAge)
    {
        if (newAge < 0)
        {
            System.out.println("Error: Negative age.");
            System.exit(0);
        }
        else
            age = newAge;
    }

    public Pet(double initialWeight)
    {
        name = "No name yet";
        age = 0;
        if (initialWeight < 0)
        {
            System.out.println("Error: Negative weight.");
            System.exit(0);
        }
        else
            weight = initialWeight;
    }

    public void setWeight(double newWeight)
    {
        if (newWeight < 0)
        {
            System.out.println("Error: Negative weight.");
            System.exit(0);
        }
        else
            weight = newWeight;
    }

    public Pet( )
    {
        name = "No name yet.";
        age = 0;
        weight = 0; 
    }

    public String getName( )
    {
        return name;
    }

    public int getAge( )
    {
        return age;
    }

    public double getWeight( )
    {
        return weight;
    }
    
    public int compareTo(Object other)
    {
    	Pet otherPet = (Pet)other;
    	//return name.compareTo(otherPet.name); //sort by name
    	if(age < otherPet.age)
    	{
    		return -1;//comes before
    	}
    	else if(age > otherPet.age)
    	{
    		return 1;//comes after
    	}
    	else
    	{
    		return 0;//equal
    	}
    }
    //simple clone method (everything immutable[String, int, etc.])
    /*public Object clone()
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
    }*/
    //complex copy (mutable variables[Object memory reference to an object])
    public Object clone()
    {
    	try
    	{
    		Pet copy = (Pet)super.clone();
    		copy.owner = (Person)owner.clone();
    		return copy;
    	}
    	catch(CloneNotSupportedException e)
    	{
    		System.out.println(e.getMessage());
    		return null;
    	}
    }
    
    public Person getOwner()
    {
    	return owner;
    }
    
    public void setOwner(Person own)
    {
    	owner = own;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
