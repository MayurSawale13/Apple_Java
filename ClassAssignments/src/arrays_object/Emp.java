package arrays_object;

public class Emp {
	private int id,salary;
	private String name;
	private Dept d;
	public Dept getD() {
		return d;
	}
	public void setD(Dept d) {
		this.d = d;
	}
	Emp(){
		
	}
	Emp(int id,int salary,String name ,Dept d)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
		this.d=d;
	}
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public int getSalary(){
		return salary;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return id+" "+name+" "+salary+"Dept :"+d.did+" "+d.dname;
	}
	
	

}
