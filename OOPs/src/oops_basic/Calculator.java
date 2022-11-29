package oops_basic;

import java.util.Scanner;

public class Calculator {
		Scanner c = new Scanner(System.in);
	void add() {
		
		System.out.println("Enter to two numbers");
		int a = c.nextInt();// local to method i.e. scope to method only
		// ,created and deleted in method.
		int b = c.nextInt();
		System.out.println("Addtion is: " + (a + b));
		
	}

	void sub() {
		//Scanner c = new Scanner(System.in);
		System.out.println("Enter to two numbers");
		int a = c.nextInt();
		int b = c.nextInt();
		System.out.println("Substraction is: " + (b - a));
		
	}

	void multi() {
		//Scanner c = new Scanner(System.in);
		System.out.println("Enter to two numbers");
		int a = c.nextInt();
		int b = c.nextInt();
		System.out.println("Multiplication is: " + (a * b));

	}

	void div() {
		//Scanner c = new Scanner(System.in);
		System.out.println("Enter to two numbers");
		int a = c.nextInt();
		int b = c.nextInt();
		System.out.println("Division is: " + (a / b));
		c.close();
	}

}
