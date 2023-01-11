package comparablecomparator;

public class Employee implements Comparable<Employee>{
	int id,salary;
	String name,dept;
	char ch;
	Employee(int id,int salary,String name,String dept,char ch)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
		this.dept=dept;
		this.ch=ch;
		}
	public String toString()
	{
		return id+" "+salary+" "+name+" "+dept+" "+ch;
	}
	public int compareTo(Employee e)
	{
		/*if(this.id>e.id)
			return 1;
		else if(this.id<e.id)
			return -1;
		else
			return 0;*/
		/*if(this.salary>e.salary)
			return 1;
		else if(this.salary<e.salary)
			return -1;
		else
			return 0;*/
		if(this.dept.compareTo(e.dept)==0)
		{
			if(this.salary>e.salary)
				return 1;
			else if(this.salary<e.salary)
				return -1;
			else
				return 0;
		}
		else
			return this.dept.compareTo(e.dept);
			
			
		}
	}


