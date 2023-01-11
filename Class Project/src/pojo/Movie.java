package pojo;

public class Movie {
	public int id,noofshows;
	public String name;
	public Movie(int id,int noofshows,String name)
	{
		this.id=id;
		this.noofshows=noofshows;
		this.name=name;
	}
public String toString(){
	return id+" "+noofshows+" "+name;
}

}
