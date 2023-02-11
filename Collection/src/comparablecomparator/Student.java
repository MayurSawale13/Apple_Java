package comparablecomparator;

import java.util.ArrayList;

public class Student implements Cloneable {
	String name;
	ArrayList<Integer> al;
	Student(String name,ArrayList<Integer> al)
	{
		this.name=name;
		this.al=al;
	}
	public String toString()
	{
		return name+" "+al;
	}
	public Object clone() throws CloneNotSupportedException
	{
		Student s=(Student) super.clone();
		s.al=(ArrayList<Integer>) al.clone();
		return s;
		 //return super.clone();//for shallow copy
	}
	

}
