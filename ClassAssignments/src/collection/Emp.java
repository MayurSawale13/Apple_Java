package collection;

public class Emp implements Comparable<Emp>{
	private int id;
	private String name;
	private Dept d;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dept getD() {
		return d;
	}
	public void setD(Dept d) {
		this.d = d;
	}
	public String toString ()
	{
		return id+" "+name+" "+d.getDid()+" "+d.getName();
	}
	public int compareTo(Emp e)
	{
		return this.d.getName().compareTo(e.d.getName());
		/*if(this.getD().getDid()>e.getD().getDid())
			return 1;
		else if(this.d.getDid()<e.getD().getDid())
			return -1;
		else
			return 0;*/
			
		/*if(this.getD().getName().compareTo(e.getD().getName())==1)
			return 1;
		else if(this.getD().getName().compareTo(e.getD().getName())==-1)
			return -1;
		else
			return 0;*/
		/*if(this.name.compareTo(name)==1)
			return 1;
		else if(this.name.compareTo(name)==-1)
			return -1;
		else 
			return 0;*/
		
			
		
	}
	
}
