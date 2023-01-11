package pojo;

import dao.Address;

public class Person {

	public int pid;
	public int contact;
	public String name;
	public Address a;
	public Person(int pid,int contact,String name,Address a)
	{
		this.pid=pid;
		this.contact=contact;
		this.name=name;
		this.a=a;
		
	}
	public String toString()
	{
		return pid+" "+contact+" "+name+" "+a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
