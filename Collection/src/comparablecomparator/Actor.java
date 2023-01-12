package comparablecomparator;

public class Actor {
	public int id;
	public String name;
	public Actor(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id+" "+name; 
	}

}
