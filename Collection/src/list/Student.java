package list;

import java.util.ArrayList;

public class Student{

	int id;
	String name,dept;
	ArrayList<Integer>marks;
	Student(int id,String name,String dept,ArrayList<Integer>marks)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.marks=marks;
	}
}
