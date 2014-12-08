package Transportation;

import java.util.UUID;

public class Person {
	
	public String FirstName;
	public String LastName;
	public UUID PersonID;
    
    public String getFirstName()
    {
        return this.FirstName;
    }
    
    public String setFirstName()
    {
    	return this.FirstName;
    }
    
    public String getLastName()
    {
        return this.LastName;
    }
    
    public String setLastName()
    {
    	return this.LastName;
    }
    
    public class GenerateUUID {
    	  
    	  public final void main(String... aArgs)
    	  {
    	    UUID idOne = UUID.randomUUID();
    	    UUID idTwo = UUID.randomUUID();
    	    log("UUID One: " + idOne);
    	    log("UUID Two: " + idTwo);
    	  }
    	  
    	  private void log(Object aObject){
    	    System.out.println( String.valueOf(aObject) );
    	  }
    }
}


