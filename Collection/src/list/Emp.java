package list;

import java.util.Iterator;
import java.util.LinkedList;

public class Emp {
	int id,deptid;
	String name;
	Emp(int id,int deptid,String name)
	{
		this.id=id;
		this.deptid=deptid;
		this.name=name;
	}
	public String toString()
	{
		return "EmpId:"+id+" DeptId:"+deptid+" Name:"+name;
	}
	public static void main(String[] args) {
		LinkedList<Emp> llemp=new LinkedList<Emp>();
		llemp.add(new Emp(9,12,"Akhil"));
		llemp.add(new Emp(10,12,"Anil"));
		llemp.add(new Emp(23,15,"Faruq"));
		llemp.add(new Emp(51,12,"jack"));
		llemp.add(new Emp(84,52,"bhim"));
		llemp.add(new Emp(6,25,"gauri"));
		llemp.add(new Emp(66,12,"Shaheen"));
		System.out.println(llemp);
		int flag=0;
		for(Emp e:llemp)
		{
			if(e.id==10)
				flag=e.deptid;
		}
		Iterator<Emp> it=llemp.iterator();
		 
		while(it.hasNext())
		{
			Emp r=it.next();
			if(r.deptid==flag)
				it.remove();
		}
		
		System.out.println(llemp);
		

	}

}
