package oops_basic;

import java.util.Scanner;

public class Employee1 {
	int id;
	float salary;
	char c;
	String dept, contact, name;

	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee name:");
		name = sc.next();
		System.out.println("Enter Employee id:");
		id = sc.nextInt();
		System.out.println("Enter Employee Department:");
		dept = sc.next();
		System.out.println("Enter Employee salary:");
		salary = sc.nextFloat();
		System.out.println("Enter Employee rating:");
		c = sc.next().charAt(0);
		System.out.println("Enter Employee contact:");
		contact = sc.next();
	}

	float bonus() {
		float b;
		if (c == 'A')
			b = salary * 0.15f;
		else if (c == 'B')
			b = (salary) * 0.10f;
		else if (c == 'C')
			b = (salary) * 0.05f;
		else
			b = 0f;
		return b;
	}

	void pfCal(float b, float a) {
		b = bonus();
		a = (b + salary) * 0.10f;
		System.out.println("pf amount: " + a);
	}

	void display() {
		System.out.println("Employee name: " + name);
		System.out.println("Employee salary: " + salary);
	}

	public static void main(String[] args) {

		Employee1 e1 = new Employee1();
		e1.getData();
		e1.display();
		float r1 = e1.bonus();
		System.out.println("bonus: " + r1);
		e1.pfCal(e1.salary, r1);

	}

}
