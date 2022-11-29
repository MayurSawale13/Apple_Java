package oops;

 public class Student {
	int id;
	String name;
	public void getData(int sid,String s)
	{
		id=sid;
		name=s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		System.out.println("Student1@"+s1.hashCode());
		Student s2=new Student();
		System.out.println("Student2@"+s2.hashCode());
		
	}

}
