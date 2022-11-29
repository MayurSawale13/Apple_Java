package methods;

import java.util.Scanner;

public class Employe {
	int id;
	double contact;
	float salary;
	String name, dept, email;

	public void setData(int i, double c, float sal, String ename, String d, String e) {
		id = i;
		contact = c;
		salary = sal;
		name = ename;
		dept = d;
		email = e;
	}

	public void display() {
		System.out.println("Employee id: " + id + "\nEmployee name:" + name);
		System.out.println("Department: " + dept + "\nContact Number: " + contact + "\nEmail: " + email);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Empolyee name: ");
		String n = sc.next();
		System.out.println("Enter Empolyee id: ");
		int eid = sc.nextInt();
		System.out.println("Enter Empolyee Contact: ");
		double ec = sc.nextInt();
		System.out.println("Enter Empolyee salary: ");
		float esal = sc.nextFloat();
		System.out.println("Enter Empolyee Department: ");
		String edept = sc.next();
		System.out.println("Enter Empolyee Email: ");
		String email1 = sc.next();
		Employe e1 = new Employe();
		e1.setData(eid, ec, esal, n, edept, email1);
		e1.display();
		
		System.out.println("Enter Empolyee name: ");
		n = sc.next();
		System.out.println("Enter Empolyee id: ");
		eid = sc.nextInt();
		System.out.println("Enter Empolyee Contact: ");
		ec = sc.nextInt();
		System.out.println("Enter Empolyee salary: ");
		esal = sc.nextFloat();
		System.out.println("Enter Empolyee Department: ");
		edept = sc.next();
		System.out.println("Enter Empolyee Email: ");
		email1 = sc.next();
		Employe e2 = new Employe();
		e2.setData(eid, ec, esal, n, edept, email1);
		e2.display();
		
		System.out.println("Enter Empolyee name: ");
		n = sc.next();
		System.out.println("Enter Empolyee id: ");
		eid = sc.nextInt();
		System.out.println("Enter Empolyee Contact: ");
		ec = sc.nextInt();
		System.out.println("Enter Empolyee salary: ");
		esal = sc.nextFloat();
		System.out.println("Enter Empolyee Department: ");
		edept = sc.next();
		System.out.println("Enter Empolyee Email: ");
		email1 = sc.next();
		Employe e3 = new Employe();
		e3.setData(eid, ec, esal, n, edept, email1);
		e3.display();
		
		System.out.println("Enter Empolyee name: ");
		n = sc.next();
		System.out.println("Enter Empolyee id: ");
		eid = sc.nextInt();
		System.out.println("Enter Empolyee Contact: ");
		ec = sc.nextInt();
		System.out.println("Enter Empolyee salary: ");
		esal = sc.nextFloat();
		System.out.println("Enter Empolyee Department: ");
		edept = sc.next();
		System.out.println("Enter Empolyee Email: ");
		email1 = sc.next();
		Employe e4 = new Employe();
		e4.setData(eid, ec, esal, n, edept, email1);
		e4.display();
		
		System.out.println("Enter Empolyee name: ");
		n = sc.next();
		System.out.println("Enter Empolyee id: ");
		eid = sc.nextInt();
		System.out.println("Enter Empolyee Contact: ");
		ec = sc.nextInt();
		System.out.println("Enter Empolyee salary: ");
		esal = sc.nextFloat();
		System.out.println("Enter Empolyee Department: ");
		edept = sc.next();
		System.out.println("Enter Empolyee Email: ");
		email1 = sc.next();
		Employe e5 = new Employe();
		e5.setData(eid, ec, esal, n, edept, email1);
		e5.display();

	}

}
