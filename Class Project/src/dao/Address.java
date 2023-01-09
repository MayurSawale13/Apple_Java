package dao;

public class Address {
	public String state,city;
	public Address(String city,String state)
	{
		this.city=city;
		this.state=state;
		
	}
	public String toString()
	{
		return city+" "+state;
	}

}
