package methods;

import java.util.Scanner;

public class Student {
	int sid, p, c, m;
	String sname;
	int total;
	Scanner sc = new Scanner(System.in);

	void studentDetails() {
		
		System.out.println("Enter Student id: ");
		sid = sc.nextInt();
		System.out.println("Enter student name: ");
		sname = sc.next();
		System.out.println("Enter Student marks for physics,chemistry and math: ");
		p = sc.nextInt();
		c = sc.nextInt();
		m = sc.nextInt();
		total=p+c+m;
		
	}

	 void percentage() {
		
		float per = ((total * 100) / 300f);
		if(per>=80)
			System.out.println("Result :First Class");
		else if(per>=60 && per<80)
			System.out.println("Result :Second Class");
		else if(per>=35 && per<60)
			System.out.println("Result:Third Class");
		else
			System.out.println("Result:Fail");
	
		
	}

	void dispaly() {
		
		
		
		System.out.println("Student Id " + sid);
		System.out.println("Student name: " + sname);
		System.out.println("Marks of " + sname + "\nphysics: " + p + "\nchemistry: " + c + "\nmath: " + m+"\nTotal Marks: "+total);
		
	}
	public String toString()
	{
		return  "sid:" +sid+ " "+sname+" "+total; 
	}

	public static void main(String[] args) {

		Student s = new Student();
		s.studentDetails();
		System.out.println(s);
		s.dispaly();
		s.percentage();

	}
	
}
