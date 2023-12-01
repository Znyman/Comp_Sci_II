/**
 * Lab04
 * @author Zachery Nyman
 * 19 January 2017
 */
package lab04;

public class Person
{
    private String name;
    
    public Person( )
    {
        name = "No name yet";
        System.out.println("Person: No arg constructor called.");
    }
    
    public Person(String initialName)
    {
        name = initialName;
        System.out.println("Person: One arg constructor called.");
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public String getName( )
    {
        return name;
    }
    
    public String toString( )
    {
        return "Name: " + name;
    }
   
    public boolean sameName(Person otherPerson)
    {
        return name.equalsIgnoreCase(otherPerson.name);
    }
}
