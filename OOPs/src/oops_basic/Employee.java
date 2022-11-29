package oops_basic;

public class Employee {
	int eid;
	String name;
	float sal;
	void acceptDetails(int e,String ename,float sal1)
	{
		eid=e;
		name=ename;
		sal=sal1;
	}
	void display()
	{
		System.out.println("Emp ID: "+eid+"\nEmp name: "+name+"\nsalary: "+sal);
	}

	public static void main(String[] args) {
	
		Employee e=new Employee();
		e.acceptDetails(12,"sangvi", 1560000.98f);
		e.display();
	}

}
