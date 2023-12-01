package referenceDemo;
public class Pet
{
    private String name;
    private int age;      //in years
    private double weight;//in pounds
    
    public Pet( )
    {
        name = "No name yet.";
        age = 0;
        weight = 0; 
    }
    
    public Pet(String initialName, int initialAge, double initialWeight)
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
	
     
    public void setName(String newName)
    {
        name = newName;
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

    public String toString( )
    {
        return "Name: " + name + "\nAge: " + age + "\nWeight: " + weight;
       
    }
    
    public boolean equals(Pet p)
    {
    	if (p == null)
    	{
    		return false;
    	}
    	
    	return name.equals(p.name) && age == p.age && weight == p.weight;
    	
    }
    
    public static void changer(int i)
    {
    	i++;
    	System.out.println("Vale of i in changer is: " + i);
    }
    
    public static void changer(Pet p)
    {
    	p.name = "No Name";
    }
    
    
    
    
    
    
    
}
