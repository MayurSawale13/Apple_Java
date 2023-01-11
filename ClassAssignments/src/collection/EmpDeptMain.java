package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmpDeptMain {
	
	void addEmp(ArrayList<Emp> e)
	{
		Emp e1=new Emp();
		e1.setId(1);
		e1.setName("mayur");
		Dept d1=new Dept();
		d1.setDid(15);
		d1.setName("Dev");
		e1.setD(d1);
		e.add(e1);
		Emp e2=new Emp();
		e2.setId(1);
		e2.setName("Amit");
		Dept d2=new Dept();
		d2.setDid(11);
		d2.setName("Testing");
		e2.setD(d2);
		e.add(e2);
		Emp e3=new Emp();
		e3.setId(44);
		e3.setName("Kavya");
		Dept d3=new Dept();
		d3.setDid(13);
		d3.setName("HR");
		e3.setD(d3);
		e.add(e3);
	}

	public static void main(String[] args) {
		ArrayList<Emp> e=new ArrayList<>();
		EmpDeptMain d=new EmpDeptMain();
		d.addEmp(e);
		Iterator<Emp> it=e.iterator();
		while(it.hasNext())
		{
			Emp s=it.next();
			System.out.println(s);
		}
		//ArrayList<Emp> s=new ArrayList<>();
		ArrayList<Emp>s=(ArrayList<Emp>)e.clone();
		
		System.out.println("First arrayList:"+e);
		System.out.println("cloned arrayList:"+s);
		Emp e4=new Emp();
		e4.setId(0);
		e4.setName("Clone");
		Dept d4=new Dept();
		d4.setDid(00);
		d4.setName("Clone");
		e4.setD(d4);
		e.add(e4);
		System.out.println(s);
		System.out.println(e);
		
		System.out.println("----Sorting using Comparable with dept name----");
		Collections.sort(e);
		System.out.println(e);
		

	}

}
