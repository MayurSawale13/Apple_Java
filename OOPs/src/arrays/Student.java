package arrays;

import java.util.Scanner;

public class Student {

	int id;
	String name,dept;
	Student(int id,String name,String dept)
	{
		this.id= id;
		this.name=name;
		 this.dept=dept;	
	}
	public String toString(){
	return "Id:"+id+" name:"+name+" dept:"+dept;
	}
	
	public static void main(String[] args) {
		Student st[]=new Student[5];
		Scanner sc=new Scanner(System.in);
		/*Student s1=new Student(100,"akhil","physics");
		Student s2=new Student(101,"anand","chemistry");
		Student s3=new Student(102,"ahmed","mech");
		Student s4=new Student(103,"asif","comp");
		st[0]=s1;
		st[1]=s2;
		st[2]=s3;
		st[3]=s4;*/
		for(int i=0;i<st.length;i++)
		{
			System.out.println("enter student id,name and dept");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			 st[i]=new Student(id,name,dept);
		}
		for(Student s:st)
		{
			if(s.dept.equals("cs"))
			System.out.println(s);
		}
	}

}
