package test4;

public class Person1 implements Cloneable{
	int id;
	String name;
	public Country c;
	public Person1(int id,String name,Country c){
		this.id=id;
		this.name=name;
		this.c=c;
	}
	public String toString(){
		return id+" "+name+" "+c;
	}
	public Object clone() throws CloneNotSupportedException{
		
		Person1 p=(Person1) super.clone();
		p.c=(Country) c.clone();
		return p; //deep copy
		//return super.clone(); shallow copy
		
	}
}
