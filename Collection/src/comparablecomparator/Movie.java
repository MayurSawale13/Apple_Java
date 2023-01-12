package comparablecomparator;

import java.util.ArrayList;

public class Movie {
	public int mid;
	public String name;
	public ArrayList<Actor> a1;
	public Movie(int mid,String name,ArrayList<Actor> a)
	{
		this.mid=mid;
		this.name=name;
		this.a1=a;
	}
public String toString()
{
	return mid+" "+name+" "+a1;
}
}
