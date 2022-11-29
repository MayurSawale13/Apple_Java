package Encapsulation;
//POJO plain old java object
public class Employe {
	private int id;
	private String name;
	Employe(){
		
	}
	Employe(int id,String name){
		this.id=id;
		this.name=name;
		
	}
public void setId(int i)
{
	this.id=i;
}
public int getId()
{
	return id;
}
public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}
void display()
{
	System.out.println("Emp Id: "+id+"Emp Name: "+name);
}
}
