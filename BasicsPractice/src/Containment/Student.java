package Containment;

public class Student {
	int roll;
	String name;
	Course c;
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getC() {
		return c;
	}

	public void setC(Course c) {
		this.c = c;
	}

	

	public String toString()
	{
		return "Roll:"+roll+" Name:"+name;
	}
	public static void main(String[] args) {
		Course c1=new Course();
		c1.setCourseid(12);
		c1.setCoursename("JAVA");
		
		
		Student s=new Student( );
		s.setName("mayur");
		s.setRoll(1254);
		s.setC(c1);
		System.out.println("---Student Details---");
		System.out.println(s);
		
	}

}
