package methods;

import java.util.Scanner;

public class InstanceVar {
/*
 * Intialiazation of Instance variable:
	1.Reference variable
	2.method
	3.constructor
	*/
	int id;
	String name;
	
	void setData(int i,String s)
	{
		id=i;
		name=s;
		/*2.Method(Simple)
		 * Scanner sc=new Scanner (System.in);
		System.out.println("Enter student id: ");
		id=sc.nextInt();
		System.out.println("Enter student name: ");
		name=sc.next();*/
		
	}
	void display()
	{
		System.out.println("id:"+id+"\nname: "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student id");
		int sid=sc.nextInt();
		System.out.println("Enter student name");
		String sname=sc.next();
		//Object Initialization:
		InstanceVar s1=new InstanceVar();
	/*	1.refernece variable:
	 * s1.id=123;
		s1.name="mayur"*/
	//2.Method(para) i.e. Intialization of Instance var
		
		s1.setData(sid, sname);
		
		InstanceVar s2=new InstanceVar();

		System.out.println("Enter student id");
		sid=sc.nextInt();
		System.out.println("Enter student name");
		sname=sc.next();
		
		s2.setData(sid, sname);
		
		InstanceVar s3=new InstanceVar();
		
		System.out.println("Enter student id");
		sid=sc.nextInt();
		System.out.println("Enter student name");
		sname=sc.next();
		s3.setData(sid,sname);
		
	
		s1.display();
		s2.display();
		s3.display();
		sc.close();
		
	}

}
