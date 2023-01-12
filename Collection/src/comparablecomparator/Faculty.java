package comparablecomparator;

public class Faculty {
	int id,salary;
	String subject,dept;
	Faculty(int id,int salary,String subject,String dept)
	{
		this.id=id;
		this.salary=salary;
		this.subject=subject;
		this.dept=dept;
	}
	public String toString()
	{
		return id+" "+salary+" "+subject+" "+dept;
	}

}
