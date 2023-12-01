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
    
    public String toString( )
    {
        return "Name: " + name;
    }
   
    public boolean sameName(Person otherPerson)
    {
        return name.equalsIgnoreCase(otherPerson.name);
    }
}
