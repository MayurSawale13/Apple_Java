package Containment;

public class Car2 {
int id;
String color,name;
Driver d;
Car2(int i,String color,String name,int did,String dname,String c1 )
{
	this.id=i;
	this.color=color;
	this.name=name;
	d=new Driver(did,dname,c1);
}
public String toString()
{
	return "id: "+id+" Car Name: "+name+" Color:"+color+d;
}

}
