package Containment;

public class Student {
	int roll;
	String name;
	Department d;
	Student(int roll, String name,Department d){
		this.roll=roll;
		this.name=name;
		this.d=d;
		
	}

	public String toString()
	{
		return "Roll:"+roll+" Name:"+name;
	}
	public static void main(String[] args) {
		Department d=new Department(002,"Physics");
		
		Student s=new Student(1,"Akhil",d);
		
		System.out.println("---Student Details---");
		System.out.println(s);
		System.out.println(d);
	}

}
