package methods;

import java.util.Scanner;

public class ReturnEx {

	float bonus(int salary, char c) {
		System.out.println("salary before bonus " + salary);
		System.out.println("pf  before adding bonus " + (float)(salary*0.10f));
		float newSal;
		if (c == 'A')
			newSal = salary + (salary * 0.15f);
		else if (c == 'B')
			newSal = salary + (salary * 0.10f);
		else if (c == 'C')
			newSal = salary + (salary * 0.05f);
		else
			newSal = salary;
		System.out.println("salary After bonus " + newSal);
		return newSal;
	}

	void pfSal(float salary) {
		System.out.println("pf: " + (salary * 0.10f));
	}

	public static void main(String[] args) {
		ReturnEx b = new ReturnEx();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary,rating(A/B/C/D): ");
		int salary = sc.nextInt();
		char c = sc.next().charAt(0);
		float sal = b.bonus(salary, c);
		b.pfSal(sal);
		sc.close();
	}

}
