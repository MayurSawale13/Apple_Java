package arrays;

public class Department {
	int deptid,count;
	String name;
	Department(int id,String name,int count){
		this.deptid=id;
		this.name=name;
		this.count=count;
	}
	public String toString()
	{
		return "dept id:"+deptid+" name:"+name+" TotalEmp:"+count;
	}

}
