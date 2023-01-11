package pojo;

import java.util.ArrayList;

public class Theatre {
	public int id;
	public String name;
	
	public ArrayList<Movie> m=new ArrayList<>();
	
	public Theatre(int id,String name,ArrayList<Movie> m)
	{
		this.id=id;
		this.name=name;
		this.m=m;
	}
	public String toString()
	{
		return id+" "+name+" "+m;
	}
 

}
