package arrays_object;

import java.util.Arrays;
import java.util.Scanner;

public class EmpMain {
	
	Scanner sc=new Scanner(System.in);
	void addEmp1(Emp e[])
	{
		e[0]=new Emp(1,150,"mayur",(new Dept(15,"sales")));
		e[1]=new Emp(7,680,"Akhil",(new Dept(15,"hr")));
		e[2]=new Emp(8,190,"Balaji",(new Dept(15,"sales")));
		e[3]=new Emp(3,750,"Sumit",(new Dept(15,"sales")));
		e[4]=new Emp(4,950,"Veena",(new Dept(15,"hr")));
	}
	void addEmp(Emp e[])
	{
		for(int i=0;i<e.length;i++)
		{
			
			System.out.println("Enter id  salary name");
			int id=sc.nextInt();
			int salary=sc.nextInt();
			String s=sc.next();
			Emp e1=new Emp();
			e1.setId(id);
			e1.setSalary(salary);
			e1.setName(s);
			System.out.println("Enter did and dname");
			int did=sc.nextInt();
			String dname=sc.next();
			Dept d1=new Dept(did,dname);
			e1.setD(d1);
			e[i]=e1;
		}

		
	}
	
	void display(Emp e[])
	{
		for(int i=0;i<e.length;i++)
			System.out.println(e[i]);
	}
	void searchEmp(Emp e1[])
	{
		for(int i=0;i<e1.length;i++)
		{
			if(e1[i].getSalary()>=10000)
				System.out.println(e1[i]);
		}
		for(int i=0;i<e1.length;i++)
		{
			if(e1[i].getD().dname.equalsIgnoreCase("sales"))
			{
				System.out.println(e1[i]);
			}
		}
		
		
	}
	void duplicateDept(Emp e1[])
	{
		Emp e2[]=new Emp[e1.length];
		for(int i=0;i<e1.length;i++)
		{
			int count=1;
			for(int j=i+1;j<e1.length;j++)
			{
				if(e1[i].getD().dname.equalsIgnoreCase(e1[j].getD().dname))
				{
					e2[i]=e1[j];
				}
				count++;
				if(e2[i]==null){
				if(count==2)
					e2[i]=e1[i];
				}
				}
		}
		System.out.println(Arrays.toString(e2));
	}
//[dev,fd,0,cs,0,cs,gh]
	public static void main(String[] args) {
		Emp e[]=new Emp[5];
		
		EmpMain m=new EmpMain();
		m.addEmp1(e);
		m.display(e);
	//	m.searchEmp(e);
		m.duplicateDept(e);

	}

}
