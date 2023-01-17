package maps;

import java.util.ArrayList;

public class Employee {
	int id;
	String name,dept;
    Profile p; 
	Employee(int id,String name,String dept,Profile p){
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.p=p;
	}
	public String toString(){
		return id+" "+name+" "+dept+" "+p;
	}
	
		

	
}
