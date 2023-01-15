package written;

public class Profile  {
	String state,country;
	Profile(String state,String country)
	{
		this.state=state;
		this.country=country;
	}
	public String toString(){
		return state+", "+country;
	}
	
}
