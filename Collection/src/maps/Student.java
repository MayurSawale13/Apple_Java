package maps;

public class Student {
	int id,marks;
	String name,dept;
	Student(int id,String name,String dept,int marks)
	{
		this.id=id;
		this.marks=marks;
		this.name=name;
		this.dept=dept;
	}
	public String toString(){
		return id+" "+name+" "+dept+" "+marks;
	}
	public int hashCode(){
		return id;
	}
	public boolean equals(Object o){
		Student s=(Student)o;
		if(this.id==s.id){
			s.name=this.name;
			s.dept=this.dept;
			s.marks=this.marks;
			return true;
		}
		else
			return false;
	}
		
	
	}


