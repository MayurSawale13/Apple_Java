package oops_basic;

import java.util.Scanner;

public class Calci_ParaMain {

	public static void main(String[] args) {
		
		Calci_Para c = new Calci_Para();
		/*
		 * c.add(50, 60); c.multi(5, 6);
		 */
		Scanner n = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = n.nextInt();
		int b = n.nextInt();
		c.add(a, b);
		c.sub(a, b);
		c.multi(a, b);
		c.div(a, b);
		n.close();

	}

}
