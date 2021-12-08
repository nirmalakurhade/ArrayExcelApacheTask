package Task6;

public class Users {
	String name;
    int phoneNo;
    
    Users(String name, int phoneNo)
    {
      super();
  	  this.name= name;
  	  this.phoneNo= phoneNo;
    }

	@Override
	public String toString() {
		
		return "Users [ name="  + name+ " , phoneNo= " + phoneNo +"]";
	}
    
}
