package constructor;

import java.util.Scanner;

public class Constructor {
	int id;float salary;
	String name;
	
	//UserDefined Constr is used,default constr is not called
	Constructor()	//used to intiazliaze object with global var
	{//UserDefined simple Constructor
		id=1;
		salary=123.5f;
		name="Pavan";
		
	}
	
	
	Constructor(int i,float s,String n)
	{//UserDefined ParaMeterized Constructor
		id=i;
		salary=s;
		name=n;
		
	}
	void display()
	{
		System.out.println("Id: "+id+" salary: "+salary+" name:"+name);
	}

	public static void main(String[] args) {
		
		//<class_name><var name>=new <constructor>
		Constructor c1=new Constructor();
		//create object using default constr
		c1.display();
		System.out.println("---------ParaMeterized---------");
		/*Constructor c2=new Constructor(2,150.2f,"Sapna");
		c2.display();
*/		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id,salary,name");
		int cid=sc.nextInt();
		float csal=sc.nextFloat();
		String cname=sc.next();
		Constructor c2=new Constructor(cid,csal,cname);
		c2.display();
		System.out.println("Enter id,sal,name:");
		cid=sc.nextInt();
		csal=sc.nextFloat();
		cname=sc.next();
		Constructor c3=new Constructor(cid,csal,cname);
		c3.display();
		sc.close();
	}

}
