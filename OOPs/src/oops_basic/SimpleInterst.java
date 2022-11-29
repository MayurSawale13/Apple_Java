package oops_basic;

import java.util.Scanner;

public class SimpleInterst {

	void SimpleInterst1(float p,float r,float t)
	{
		System.out.println("Simple Interst : "+(((p*r*t)/100)));
	}

	public static void main(String[] args) {
		
		SimpleInterst s=new SimpleInterst();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle ,rate of Interstand time in years");
		float p=sc.nextFloat();
		float r=sc.nextFloat();
		float t=sc.nextFloat();
		s.SimpleInterst1(p, r, t);
		sc.close();
	}

}
