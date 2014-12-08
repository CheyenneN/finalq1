package Transportation;

public abstract class Vehicle {

	public int name;
	public int color;
	public int weight;
	public Person owner;
	       
    void transferOwnership(Person newOwner) 
    {
    	owner = newOwner;
	}
    
    public interface vehicleNeedsIt {

    }

	   }

